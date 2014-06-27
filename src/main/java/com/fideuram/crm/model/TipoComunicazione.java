package com.fideuram.crm.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
public class TipoComunicazione {
	
	@Id
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
