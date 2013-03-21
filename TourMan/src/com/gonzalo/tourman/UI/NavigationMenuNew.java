package com.gonzalo.tourman.UI;

import com.gonzalo.tourman.UI.Components.MenuController;
import com.gonzalo.tourman.UI.Interfaces.IMenuButtonFactory;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class NavigationMenuNew {
	private MenuController menuController;
	private IMenuButtonFactory buttonFactory;

	public NavigationMenuNew(MenuController menuController, IMenuButtonFactory buttonFactory) {
		this.menuController = menuController;
		this.buttonFactory = buttonFactory;
	}

	public VerticalLayout buildMenu() {
		VerticalLayout mainMenu = new VerticalLayout();
		MarginInfo margin = new MarginInfo(true);
		mainMenu.setMargin(margin );
		mainMenu.addStyleName("outlined");
		mainMenu.setHeight(50.0f, Unit.PERCENTAGE);
		Label title = new Label("Tourman main menu");
		
		Button homeButton = buttonFactory.buildHomeButton();
		homeButton.addClickListener(getHomeButtonListener());
		
		Button addTournamentButton = buttonFactory.buildAddTournamentButton();
		addTournamentButton.addClickListener(getAddTournamentButtonListener());
		
		mainMenu.addComponent(title);
		mainMenu.addComponent(homeButton);
		mainMenu.addComponent(addTournamentButton);
		return mainMenu;
	}

	private ClickListener getHomeButtonListener() {
		return new ClickListener() 
		{
			@Override
			public void buttonClick(final ClickEvent event) 
			{
				menuController.openWelcomeForm();
			}
		};
	}
	
	private ClickListener getAddTournamentButtonListener() {
		return new ClickListener() 
		{
			@Override
			public void buttonClick(final ClickEvent event) 
			{
				menuController.openAddTournamentForm();
			}
		};
	}
}
