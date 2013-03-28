package com.gonzalo.tourman.Application.Configuration;

import com.gonzalo.tourman.Application.TournamentFactory;
import com.gonzalo.tourman.Application.Interfaces.ITournamentFactory;
import com.gonzalo.tourman.MVPTourmanUI.Interfaces.IMainMenuButtonFactory;
import com.gonzalo.tourman.MVPTourmanUI.Interfaces.IMainMenuView;
import com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu.MainMenuButtonFactory;
import com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu.MainMenuViewImpl;
import com.google.inject.AbstractModule;

public class ApplicationConfiguration extends AbstractModule{

	@Override
	protected void configure() {
		bind(ITournamentFactory.class).to(TournamentFactory.class);
	}
}
