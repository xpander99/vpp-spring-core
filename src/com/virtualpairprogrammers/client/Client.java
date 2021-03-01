package com.virtualpairprogrammers.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtualpairprogrammers.services.customers.CustomerManagementService;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
		//we get the bean from the container
		CustomerManagementService customerManagementService = container.getBean(CustomerManagementService.class);
		/*
		 * Now we can acces the methods provided by the service.
		 */
	}

}
