package com.gonzalo.tourman.MVPTourmanUI;

import com.vaadin.ui.Button;

public class MainMenuButtonFactory implements IMainMenuButtonFactory {

	public Button buildCalculatorButton() {
			return new Button("Calculator");	
	}

	public Button buildYeeeeiiiButton() {
		return new Button("Yeeeiiii");
	}

}
