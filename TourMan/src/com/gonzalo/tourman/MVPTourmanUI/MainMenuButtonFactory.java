package com.gonzalo.tourman.MVPTourmanUI;

import com.vaadin.ui.Button;

public class MainMenuButtonFactory implements IMainMenuButtonFactory {

	@Override
	public Button buildHelloButton() {
			return new Button("Say hello");	
	}

}
