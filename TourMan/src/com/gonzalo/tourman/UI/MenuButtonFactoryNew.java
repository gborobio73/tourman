package com.gonzalo.tourman.UI;

import com.gonzalo.tourman.UI.Interfaces.IMenuButtonFactory;
import com.vaadin.ui.Button;

public class MenuButtonFactoryNew implements IMenuButtonFactory {

	public Button buildHomeButton() {
		Button homeButton= new Button("Home");
		return homeButton;
	}
	
	public Button buildAddTournamentButton() {
		Button homeLink = new Button("Add Tournament");
		return homeLink;
	}

}
