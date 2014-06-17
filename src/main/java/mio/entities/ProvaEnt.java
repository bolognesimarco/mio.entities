package mio.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fideuram.crm.model.Comunicazione;
import com.fideuram.crm.model.UtenteCRM;



public class ProvaEnt {
	public static void main(String[] aa) throws Exception{
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("crm");
			EntityManager em = emf.createEntityManager();
			
			Comunicazione com1 = new Comunicazione();
			UtenteCRM ass = new UtenteCRM();
			ass.setSigla("mb");
			com1.setAssegnatario(ass);
			
			
			em.getTransaction().begin();
			//em.persist(ass);
			em.persist(com1);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		System.exit(0);
	}


}