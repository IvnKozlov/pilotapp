package com.minsk.kozlow.dao;

import java.util.List;

import com.minsk.kozlow.models.Customers;

public interface CustomersDao {
	public void addCustomer(Customers customer);
	public void updateCustomer(Long id, Customers customer);
	public void deleteCustomer (Customers customer);
	public List<Customers> getAllCustomers();
	public Customers getCustomerById(Long cust_id);
}
