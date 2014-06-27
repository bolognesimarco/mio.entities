package com.fideuram.crm.model;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

//@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Discriminator")
public abstract class AttoreCRM {
	
	@Id
	@GeneratedValue
	private int id;
	
	@OneToMany(mappedBy="assegnatario")
	private Collection<Comunicazione> comunicazioniAssegnate = new HashSet<Comunicazione>();
	
	@OneToMany(mappedBy="owner")
	private Collection<Comunicazione> comunicazioniOwner = new HashSet<Comunicazione>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Collection<Comunicazione> getComunicazioniAssegnate() {
		return comunicazioniAssegnate;
	}

	public void setComunicazioniAssegnate(
			Collection<Comunicazione> comunicazioniAssegnate) {
		this.comunicazioniAssegnate = comunicazioniAssegnate;
	}

	public Collection<Comunicazione> getComunicazioniOwner() {
		return comunicazioniOwner;
	}

	public void setComunicazioniOwner(Collection<Comunicazione> comunicazioniOwner) {
		this.comunicazioniOwner = comunicazioniOwner;
	}
	
	
	
}
