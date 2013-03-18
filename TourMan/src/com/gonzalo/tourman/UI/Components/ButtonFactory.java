package com.gonzalo.tourman.UI.Components;

import com.gonzalo.tourman.UI.Interfaces.IButtonFactory;
import com.vaadin.ui.Button;

public class ButtonFactory implements IButtonFactory {

	public Button buildHomeButton() {
		Button homeLink = new Button("Home");
		return homeLink;
	}
}
