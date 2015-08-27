package customTools;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class DBUtil {
	private static final EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("fourthweb");
			 public static EntityManagerFactory getEmFactory()
			    { 
				   return emf; 
				 }
			 
			 
			 
			 
			 public static void insert(fourthweb.Test1 user) {
				 EntityManager em = DBUtil.getEmFactory().createEntityManager();
				 EntityTransaction trans = em.getTransaction();
				 trans.begin(); 
				 try {
				 em.persist(user);
				 trans.commit();
				 } catch (Exception e) {
				 System.out.println(e);
				 trans.rollback();
				 } finally {
				 em.close();
				 }
}
}