package com.virtualpairprogrammers.services.customers;

import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.domain.Call;
import com.virtualpairprogrammers.domain.Customer;

public class CustomerManagementPrototypeImpl implements CustomerManagementService{
	private List<Customer> customerList;
	
	public CustomerManagementPrototypeImpl() {
		this.customerList = new ArrayList<Customer>();
	}

	@Override
	public void newCustomer(Customer newCustomer) {
		this.customerList.add(newCustomer);
		
	}

	@Override
	public void updateCustomer(Customer changedCustomer) {
		for(Customer c : customerList) {
			if(c.getCustomerId().equals(changedCustomer.getCustomerId()))
				c = changedCustomer;
		}
		
	}

	@Override
	public void deleteCustomer(Customer oldCustomer) {
		this.customerList.remove(oldCustomer);
		
	}

	@Override
	public Customer findCustomerById(String customerId) throws CustomerNotFoundException {
		for(Customer c : customerList) {
			if(c.getCustomerId().equals(customerId))
				return c;
		}
		return null;
	}

	@Override
	public List<Customer> findCustomersByName(String name) {
		List<Customer> rCustomers = new ArrayList();
		for(Customer c : customerList) {
			if(c.getCompanyName().equals(name))
				rCustomers.add(c);
		}
		return rCustomers;
	}

	@Override
	public List<Customer> getAllCustomers() {
		return this.customerList;
	}

	@Override
	public Customer getFullCustomerDetail(String customerId) throws CustomerNotFoundException {
		for(Customer c : customerList) {
			if(c.getCustomerId().equals(customerId))
				return c;
		}
		return null;
	}

	@Override
	public void recordCall(String customerId, Call callDetails) throws CustomerNotFoundException {
		for(Customer c : customerList) {
			if(c.getCustomerId().equals(customerId))
				c.addCall(callDetails);
		}
		
	}

}
