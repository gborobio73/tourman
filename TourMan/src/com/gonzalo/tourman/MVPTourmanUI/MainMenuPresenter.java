package com.gonzalo.tourman.MVPTourmanUI;

import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

public class MainMenuPresenter implements IMainMenuListener, IMainMenuPresenter{

	private IMainMenuModel menuModel;
	private IMainMenuView menuView;
	private IWorkingLayoutController workingLayoutPresenter;

	public MainMenuPresenter(IMainMenuModel model, IMainMenuView view) {
		this.menuModel = model;
		this.menuView = view;
		view.addListener(this);
	}

	public void menuOptionSelected(String optionName) {
			
		//if(button == "Calculator") workingLayoutPresenter.load(formFactory.buildCalculator());
		if(optionName == "Calculator") workingLayoutPresenter.loadCalculator();
		else workingLayoutPresenter.loadUnknown() ;
		//workingLayout.removeAllComponents();
		//workingLayout.addComponent(new CalculatorView());
	}

	public void setWorkingLayoutController(IWorkingLayoutController workingLayoutPresenter) {
		this.workingLayoutPresenter = workingLayoutPresenter;
		
	}

}
