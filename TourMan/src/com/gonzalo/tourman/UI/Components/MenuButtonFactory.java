package com.gonzalo.tourman.UI.Components;

import com.gonzalo.tourman.UI.Interfaces.IMenuButtonFactory;
import com.gonzalo.tourman.UI.Interfaces.IMenuController;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class MenuButtonFactory implements IMenuButtonFactory {

	private IMenuController controller;

	public MenuButtonFactory(IMenuController controller)
	{
		this.controller = controller;
	}
	
	public Button buildHomeButton() {
		Button homeButton= new Button("Home");
		homeButton.addClickListener(getHomeListener());
		return homeButton;
	}
	
	public Button buildAddTournamentButton() {
		Button homeLink = new Button("Add Tournament");
		homeLink.addClickListener(getHomeButtonListener());
		return homeLink;
	}

	private ClickListener getHomeListener() {
		return new ClickListener() 
		{
			@Override
			public void buttonClick(final ClickEvent event) 
			{
				controller.openWelcomeForm();
			}
		};
	}
	
	private ClickListener getHomeButtonListener() {
		return new ClickListener() 
		{
			@Override
			public void buttonClick(final ClickEvent event) 
			{
				controller.openAddTournamentForm();
			}
		};
	}
}
