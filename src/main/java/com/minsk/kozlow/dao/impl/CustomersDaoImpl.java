package com.minsk.kozlow.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.minsk.kozlow.dao.CustomersDao;
import com.minsk.kozlow.models.Customers;
import com.minsk.kozlow.util.HibernateUtil;

public class CustomersDaoImpl implements CustomersDao {

	public void addCustomer(Customers customer) {
		Session session = null;
	    try {
	      session = HibernateUtil.getSessionFactory().openSession();
	      session.beginTransaction();
	      session.save(customer);
	      session.getTransaction().commit();
	    } catch (Exception e) {
	      e.printStackTrace();
	    } finally {
	      if (session != null && session.isOpen()) {

	        session.close();
	      }
	    }
		
	}

	public void updateCustomer(Long id, Customers customer) {
	    Session session = null;
	    try {
	      session = HibernateUtil.getSessionFactory().openSession();
	      session.beginTransaction();
	      session.update(customer);
	      session.getTransaction().commit();
	    } catch (Exception e) {
	    	e.printStackTrace();
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
		
	}

	public void deleteCustomer(Customers customer) {
		 Session session = null;
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      session.beginTransaction();
		      session.delete(customer);
		      session.getTransaction().commit();
		    } catch (Exception e) {
		     e.printStackTrace();
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
		
	}

	public List<Customers> getAllCustomers() {
		 Session session = null;
		    List busses = new ArrayList<Customers>();
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      if (session==null)
		      {
		    	  throw new Exception("11111111111");
		      }
		      busses = session.createCriteria(Customers.class).list();
		    } catch (Exception e) {
		    	e.printStackTrace();
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
		    return busses;
	}

	public Customers getCustomerById(Long cust_id) {
		 Session session = null;
		    Customers bus = null;
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      bus = (Customers) session.load(Customers.class, cust_id);
		    } catch (Exception e) {
		      e.printStackTrace();
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
		    return bus;
	}
	
}
