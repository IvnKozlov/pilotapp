package com.minsk.kozlow.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	static{
		try{
			sessionFactory= new Configuration().configure().buildSessionFactory();
			
		}catch(Throwable ex){
			ex.printStackTrace();
			System.err.println("error in hibernate!!!!!!!!");
		}
	}
	
	public static SessionFactory getSessionFactory()
	{
	      if (sessionFactory==null)
	      {
	    	  try {
				throw new Exception("22222222222");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
		return sessionFactory;
	}

}
