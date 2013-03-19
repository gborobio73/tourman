package com.gonzalo.tourman.UI.Components;

import com.gonzalo.tourman.UI.Interfaces.IButtonFactory;
import com.gonzalo.tourman.UI.Interfaces.IMainUIBuilder;
import com.google.inject.Inject;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class MainUIBuilder implements IMainUIBuilder{
	
	private final IButtonFactory buttonFactory;
	
	@Inject
	public MainUIBuilder(IButtonFactory buttonFactory)
	{
		this.buttonFactory = buttonFactory;
	}
	
	public HorizontalSplitPanel buildMainLayout() {
		HorizontalSplitPanel mainLayout = new HorizontalSplitPanel();
		
		mainLayout.setSplitPosition(150, Unit.PIXELS);
		mainLayout.setLocked(true);
		return mainLayout;
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

	public VerticalLayout createWorkingLayout() {
		VerticalLayout welcome = new VerticalLayout();
		welcome.setMargin(true);
		welcome.addComponent(new Label("Welcome to tournament manager"));
		return welcome;
	}

}
