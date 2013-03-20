package com.gonzalo.tourman.UI;

import com.gonzalo.tourman.UI.Components.MenuButtonFactory;
import com.gonzalo.tourman.UI.Components.MenuController;
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
		UIManager uiManager = new UIManager();
		MenuController menuController= new MenuController(uiManager);
		MenuButtonFactory buttonFactory = new MenuButtonFactory(menuController);
				
	    HorizontalSplitPanel mainLayout = mainUIBuilder.buildMainLayout();
		VerticalLayout workingLayout = mainUIBuilder.createWorkingLayout();
		
		uiManager.setWorkingLayout(workingLayout);
		NavigationMenu menu = new NavigationMenu(uiManager, buttonFactory);
		
		mainLayout.addComponent(menu.createNavigationMenu());
		mainLayout.addComponent(workingLayout);
		
		return mainLayout;
	}
}
