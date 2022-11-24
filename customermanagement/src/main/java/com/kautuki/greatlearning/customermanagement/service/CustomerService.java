package com.kautuki.greatlearning.customermanagement.service;

import java.util.List;

import com.kautuki.greatlearning.customermanagement.model.Customer;

public interface CustomerService {
	public Customer getCustomerByID(long id);
	public List<Customer> gelAllCustomers();
	public void saveCustomer(Customer customer);
	public void deleteCustomer(long id);
}
