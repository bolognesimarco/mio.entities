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
}
