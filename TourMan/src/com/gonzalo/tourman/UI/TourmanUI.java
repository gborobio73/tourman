package com.gonzalo.tourman.UI;

import com.gonzalo.tourman.UI.Interfaces.IMainUIBuilder;
import com.gonzalo.tourman.UI.Interfaces.ITourmanUI;
import com.google.inject.Inject;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.VerticalLayout;

public class TourmanUI implements ITourmanUI{
	
	IMainUIBuilder mainUIBuilder;
	
	@Inject
	public TourmanUI (IMainUIBuilder mainUIBuilder)
	{
		this.mainUIBuilder = mainUIBuilder;
		
	}
		
	public HorizontalSplitPanel buildContent()
	{
		UIContext.intialize();
		
	    HorizontalSplitPanel mainLayout = mainUIBuilder.buildMainLayout();
		Component navigationMenu = mainUIBuilder.createNavigationMenu();
		mainLayout.addComponent(navigationMenu);
		VerticalLayout workingLayout = mainUIBuilder.createWorkingLayout();
		mainLayout.addComponent(workingLayout);
		
		UIContext.setWorkingLayout(workingLayout);
		
		return mainLayout;
	}

	
	
}
