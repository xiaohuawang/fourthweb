
import java.math.BigDecimal;

import javax.persistence.EntityManager;

import customTools.DBUtil;
import fourthweb.Test1;


public class grabCustomer{  
	public static void main(String[] args) {   
		EntityManager em = DBUtil.getEmFactory().createEntityManager();  
		try {   
			Test1 ob = new Test1();
			//ob.setAcct(1);
			ob.setName1("lolol");
			ob.setStartingbalance(new BigDecimal(2000));
			DBUtil.insert(ob);
		
			
			//Test2 a = new Test2();
			//a.setAccount(new BigDecimal(100));
		   // a.setAmount(45.2);
		    //a.setId(50);
		    //a.setTransaction(new BigDecimal(500));
		    
		}
		
		
		
		catch (Exception e){   
			System.out.println(e);  
       } finally {    
    	   
    	   
    	   em.close();    
       System.out.println("cerrado!");   } 
		}
	}