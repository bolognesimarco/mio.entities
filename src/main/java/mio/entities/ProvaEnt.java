package mio.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fideuram.crm.model.Canale;
import com.fideuram.crm.model.Comunicazione;
import com.fideuram.crm.model.GruppoCRM;
import com.fideuram.crm.model.TipoComunicazione;
import com.fideuram.crm.model.UtenteCRM;

public class ProvaEnt {

	public static void main(String[] aa) throws Exception{
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("crm");
			EntityManager em = emf.createEntityManager();
			
			em.getTransaction().begin();
			
			MashIn min = new MashIn();
			min.setTemp(56);
			min.setTempIn(47);
			em.persist(min);
			
			em.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

		System.exit(0);
	}

	public static void main2(String[] aa) throws Exception {

		try {
			EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("crm");
			EntityManager em = emf.createEntityManager();

			UtenteCRM ass = em.getReference(UtenteCRM.class, 3786);
			Canale canale = em.getReference(Canale.class, 90);
			GruppoCRM gLav = em.getReference(GruppoCRM.class, 3478);
			TipoComunicazione tipoCom = em.getReference(
					TipoComunicazione.class, 176);

			Comunicazione com1 = new Comunicazione();
			com1.setAssegnatario(ass);
			com1.setOwner(ass);
			com1.setDirezioneId(1);
			com1.setCreatore(ass);
			com1.setCanale(canale);
			com1.setGruppoLavorazione(gLav);
			com1.setTipoComunicazione(tipoCom);

			em.getTransaction().begin();
			// em.persist(com1);
			em.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

		System.exit(0);
	}

}