package com.virtualpairprogrammers.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtualpairprogrammers.services.calls.CallHandlingService;
import com.virtualpairprogrammers.services.customers.CustomerManagementService;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
		
		CallHandlingService callHandlingService = container.getBean(CallHandlingService.class);
		
		
		container.close();
	}

}
