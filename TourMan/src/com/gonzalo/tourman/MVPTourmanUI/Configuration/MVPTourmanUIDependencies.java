package com.gonzalo.tourman.MVPTourmanUI.Configuration;

import com.gonzalo.tourman.MVPTourmanUI.Interfaces.IMainMenuButtonFactory;
import com.gonzalo.tourman.MVPTourmanUI.Interfaces.IMainMenuView;
import com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator.CalculatorComponentsFactory;
import com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator.CalculatorModel;
import com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator.CalculatorViewImpl;
import com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu.MainMenuButtonFactory;
import com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu.MainMenuViewImpl;
import com.google.inject.AbstractModule;

public class MVPTourmanUIDependencies extends AbstractModule{

	@Override
	protected void configure() {
		bind(IMainMenuView.class).to(MainMenuViewImpl.class);
		bind(IMainMenuButtonFactory.class).to(MainMenuButtonFactory.class);	
	}
}
