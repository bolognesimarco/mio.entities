package mio.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProvaEnt implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public ProvaEnt() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;

	private String level;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Column(name = "name")
	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	@Column(name = "level")
	public void setLevel(String level) {
		this.level = level;
	}

}