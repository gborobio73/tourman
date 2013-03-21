package com.gonzalo.tourman.UI;

import com.gonzalo.tourman.UI.Interfaces.IMenuButtonFactory;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class NavigationMenu {
	UIManager uiManager;
	IMenuButtonFactory buttonFactory;
	
	public NavigationMenu(UIManager uiManager, IMenuButtonFactory buttonFactory)
	{
		this.uiManager = uiManager;
		this.buttonFactory = buttonFactory;
	}

	public VerticalLayout createNavigationMenu() 
	{
		VerticalLayout mainMenu = new VerticalLayout();
		MarginInfo margin = new MarginInfo(true);
		mainMenu.setMargin(margin );
		mainMenu.addStyleName("outlined");
		mainMenu.setHeight(50.0f, Unit.PERCENTAGE);
		Label title = new Label("Tourman main menu");
		Button home = buttonFactory.buildHomeButton();
		Button addTournament = buttonFactory.buildAddTournamentButton();
		mainMenu.addComponent(title);
		mainMenu.addComponent(home);
		mainMenu.addComponent(addTournament);
		return mainMenu;
		
	}
}
