package com.fideuram.crm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comunicazione {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable=false)
	private int direzioneId;

	@ManyToOne(optional=false)
	@JoinColumn(name="assegnatario")
	private AttoreCRM assegnatario;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="owner")
	private AttoreCRM owner;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="utentecreatore")
	private UtenteCRM creatore;

	@ManyToOne(optional=false)
	@JoinColumn(name="canaleid")
	private Canale canale;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="tipocomunicazioneid")
	private TipoComunicazione tipoComunicazione;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="gruppolavorazione")
	private GruppoCRM gruppoLavorazione;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public AttoreCRM getAssegnatario() {
		return assegnatario;
	}

	public void setAssegnatario(AttoreCRM assegnatario) {
		this.assegnatario = assegnatario;
	}

	public AttoreCRM getOwner() {
		return owner;
	}

	public void setOwner(AttoreCRM owner) {
		this.owner = owner;
	}
	
	public int getDirezioneId() {
		return direzioneId;
	}

	public void setDirezioneId(int direzioneId) {
		this.direzioneId = direzioneId;
	}

	public UtenteCRM getCreatore() {
		return creatore;
	}

	public void setCreatore(UtenteCRM creatore) {
		this.creatore = creatore;
	}
	
	

	public Canale getCanale() {
		return canale;
	}

	public void setCanale(Canale canale) {
		this.canale = canale;
	}

	public GruppoCRM getGruppoLavorazione() {
		return gruppoLavorazione;
	}

	public void setGruppoLavorazione(GruppoCRM gruppoLavorazione) {
		this.gruppoLavorazione = gruppoLavorazione;
	}

	public TipoComunicazione getTipoComunicazione() {
		return tipoComunicazione;
	}

	public void setTipoComunicazione(TipoComunicazione tipoComunicazione) {
		this.tipoComunicazione = tipoComunicazione;
	}

	public Comunicazione() {

	}
}
