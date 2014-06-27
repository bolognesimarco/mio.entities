package com.fideuram.crm.model;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

//@Entity
@DiscriminatorValue("GruppoCRM")
public class GruppoCRM extends AttoreCRM{
	
	@Column
	private boolean isBackOffice;
	
	@OneToMany(mappedBy="gruppoLavorazione")
	private Collection<Comunicazione> comunicazioniLavorazione = new HashSet<Comunicazione>();


	public boolean isBackOffice() {
		return isBackOffice;
	}

	public void setBackOffice(boolean isBackOffice) {
		this.isBackOffice = isBackOffice;
	}

	public Collection<Comunicazione> getComunicazioniLavorazione() {
		return comunicazioniLavorazione;
	}

	public void setComunicazioniLavorazione(
			Collection<Comunicazione> comunicazioniLavorazione) {
		this.comunicazioniLavorazione = comunicazioniLavorazione;
	}
	
	
}
