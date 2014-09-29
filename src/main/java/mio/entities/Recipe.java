package mio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Recipe {
	@Id @GeneratedValue private int id;
	@Column private String name;
	@OneToOne private MashIn mashIn;
	@OneToOne private AcidRest acidRest;
	@OneToOne private ProteinRest proteinRest;
	@OneToOne private BetaAmylase betaAmylase;
	@OneToOne private AlphaAmylase alphaAmylase;
	@OneToOne private SaccharificationRest saccharificationRest;
	@OneToOne private MashOut mashOut;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MashIn getMashIn() {
		return mashIn;
	}
	public void setMashIn(MashIn mashIn) {
		this.mashIn = mashIn;
	}
	public AcidRest getAcidRest() {
		return acidRest;
	}
	public void setAcidRest(AcidRest acidRest) {
		this.acidRest = acidRest;
	}
	public ProteinRest getProteinRest() {
		return proteinRest;
	}
	public void setProteinRest(ProteinRest proteinRest) {
		this.proteinRest = proteinRest;
	}
	public BetaAmylase getBetaAmylase() {
		return betaAmylase;
	}
	public void setBetaAmylase(BetaAmylase betaAmylase) {
		this.betaAmylase = betaAmylase;
	}
	public AlphaAmylase getAlphaAmylase() {
		return alphaAmylase;
	}
	public void setAlphaAmylase(AlphaAmylase alphaAmylase) {
		this.alphaAmylase = alphaAmylase;
	}
	public SaccharificationRest getSaccharificationRest() {
		return saccharificationRest;
	}
	public void setSaccharificationRest(SaccharificationRest saccharificationRest) {
		this.saccharificationRest = saccharificationRest;
	}
	public MashOut getMashOut() {
		return mashOut;
	}
	public void setMashOut(MashOut mashOut) {
		this.mashOut = mashOut;
	}
	
	
}
