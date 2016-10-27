package com.minsk.kozlow.dao;

import com.minsk.kozlow.dao.impl.CustomersDaoImpl;

public class Factory {

private static CustomersDao customerDao = null;
private static Factory instance = null;

public static synchronized Factory getInstance(){
	
	if(instance == null)
	{
		instance = new Factory();
	}
	return instance;
}

public CustomersDao getCustomersDao(){
	if (customerDao==null)
	{
		customerDao=new CustomersDaoImpl();
	}
	return customerDao;
}

}
