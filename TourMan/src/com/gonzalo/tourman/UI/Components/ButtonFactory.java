package com.gonzalo.tourman.UI.Components;

import javax.inject.Inject;

import com.gonzalo.tourman.UI.Interfaces.IButtonFactory;
import com.gonzalo.tourman.UI.Interfaces.IMenuController;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class ButtonFactory implements IButtonFactory {

	private IMenuController controller;

	@Inject
	public ButtonFactory(IMenuController controller)
	{
		this.controller = controller;
	}
	
	public Button buildHomeButton() {
		return new Button("Home");
	}
	
	public Button buildAddTournamentButton() {
		Button homeLink = new Button("Add Tournament");
		homeLink.addClickListener(getHomeButtonListener());
		return homeLink;
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
