package com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu;

import com.gonzalo.tourman.MVPTourmanUI.Interfaces.IWorkingLayoutController;
import com.gonzalo.tourman.MVPTourmanUI.MVP.UIComponents.ICustomComponent;
import com.gonzalo.tourman.MVPTourmanUI.MVP.UIComponents.IVerticalLayout;
import com.vaadin.ui.Notification;

public class WorkingLayoutController implements IWorkingLayoutController{

	private IVerticalLayout layout;
	private IViewsFactory viewsFactory;

	public WorkingLayoutController(IVerticalLayout workingLayout, IViewsFactory viewsFactory)
	{
		this.layout = workingLayout;
		this.viewsFactory = viewsFactory;
	}

	public void loadCalculator() {
		layout.clear();
		
		ICustomComponent view = viewsFactory.buildCalculatorView();
		
		layout.addComponent(view.getComponent());		
	}

	public void loadUnknown() {
		layout.clear();
		Notification.show("Unknown");	
	}

	public void loadFakDat() {
		layout.clear();
		Notification.show("That is Erika's button");
	}
}
