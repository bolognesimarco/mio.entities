package com.fideuram.crm.model;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

//@Entity
@DiscriminatorValue("UtenteCRM")
public class UtenteCRM extends AttoreCRM{
	
	@Column
	private String sigla;
	
	@OneToMany(mappedBy="creatore")
	private Collection<Comunicazione> comunicazioniCreator = new HashSet<Comunicazione>();

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	
}
