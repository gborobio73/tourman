package com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu;

import com.gonzalo.tourman.MVPTourmanUI.Interfaces.IMainMenuButtonFactory;
import com.vaadin.ui.Button;

public class MainMenuButtonFactory implements IMainMenuButtonFactory {

	public Button buildCalculatorButton() {
		return new Button("Calculator");	
	}

	public Button buildYeeeeiiiButton() {
		return new Button("Yeeeiiii");
	}

	public Button buildErikaButton() {
		return new Button("Erika");	}

}
