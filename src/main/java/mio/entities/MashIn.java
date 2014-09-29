package mio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class MashIn {

	@Id @GeneratedValue private int id;
	@Column private int tempIn;
	@Column private int temp;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTempIn() {
		return tempIn;
	}
	public void setTempIn(int tempIn) {
		this.tempIn = tempIn;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	
	
}
