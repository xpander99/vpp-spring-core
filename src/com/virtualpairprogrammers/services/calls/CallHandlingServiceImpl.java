package com.virtualpairprogrammers.services.calls;

import java.util.Collection;

import com.virtualpairprogrammers.domain.Action;
import com.virtualpairprogrammers.domain.Call;
import com.virtualpairprogrammers.services.customers.CustomerManagementService;
import com.virtualpairprogrammers.services.customers.CustomerNotFoundException;
import com.virtualpairprogrammers.services.diary.DiaryManagementService;

public class CallHandlingServiceImpl implements CallHandlingService{
	private CustomerManagementService customerManagementService;
	private DiaryManagementService diaryManagementService;
	
	 public CallHandlingServiceImpl(CustomerManagementService customerManagementService, DiaryManagementService diaryManagementService) {
		// TODO Auto-generated constructor stub
		 this.customerManagementService = customerManagementService;
		 this.diaryManagementService = diaryManagementService;
	}

	@Override
	public void recordCall(String customerId, Call newCall, Collection<Action> actions)
			throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		customerManagementService.recordCall(customerId, newCall);
		for(Action action : actions)
		{
			diaryManagementService.recordAction(action);
		}
	}
	
	

}
