package com.virtualpairprogrammers.services.diary;

import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.domain.Action;

public class DiaryManagementPrototypeImpl implements DiaryManagementService{
	private List<Action> actionList;
	
	public DiaryManagementPrototypeImpl() {
		this.actionList = new ArrayList<Action>();
	}
	
	@Override
	public void recordAction(Action action) {
		this.actionList.add(action);
		
	}

	@Override
	public List<Action> getAllIncompleteActions(String requiredUser) {
		List<Action> incompleteActions = new ArrayList<Action>();
		for(Action action : actionList) {
			if(action.getOwningUser().equals(requiredUser) && !action.isComplete())
				incompleteActions.add(action);
		}
		return incompleteActions;
	}

}
