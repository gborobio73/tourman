package com.gonzalo.tourman.MVPTourmanUI;

import com.google.inject.AbstractModule;

public class MVPTourmanUIModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(IMainMenuModel.class).to(MainMenuModel.class);		
		bind(IMainMenuView.class).to(MainMenuViewImpl.class);
		bind(IMainMenuButtonFactory.class).to(MainMenuButtonFactory.class);
	}
}
