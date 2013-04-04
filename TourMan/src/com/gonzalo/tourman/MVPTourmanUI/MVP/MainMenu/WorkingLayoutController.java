package com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu;

import com.gonzalo.tourman.MVPTourmanUI.Interfaces.IWorkingLayoutController;
import com.gonzalo.tourman.MVPTourmanUI.MVP.UIComponents.ICustomComponent;
import com.gonzalo.tourman.MVPTourmanUI.MVP.UIComponents.IVerticalLayout;
import com.vaadin.ui.Notification;

public class WorkingLayoutController implements IWorkingLayoutController{

	private IVerticalLayout workingLayout;
	private IViewsFactory viewsFactory;

	public WorkingLayoutController(IVerticalLayout workingLayout, IViewsFactory viewsFactory)
	{
		this.workingLayout = workingLayout;
		this.viewsFactory = viewsFactory;
	}

	public void loadCalculator() {
		workingLayout.clear();
		
		ICustomComponent view = viewsFactory.buildCalculatorView();
		
		workingLayout.addComponent(view.getComponent());		
	}

	public void loadUnknown() {
		workingLayout.clear();
		Notification.show("Unknown");	
	}

	public void loadFakDat() {
		workingLayout.clear();
		Notification.show("That is Erika's button");
	}
}
