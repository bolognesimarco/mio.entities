package com.fideuram.crm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Comunicazione {

	@Id
	@GeneratedValue
	private int id;
	
	@JoinColumn(name="assegnatario")
	private AttoreCRM assegnatario;

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

	public Comunicazione() {

	}
}
