package com.gonzalo.tourman.UI;

import com.gonzalo.tourman.UI.Components.ButtonFactory;
import com.gonzalo.tourman.UI.Components.MainUIBuilder;
import com.gonzalo.tourman.UI.Components.MenuController;
import com.gonzalo.tourman.UI.Interfaces.IButtonFactory;
import com.gonzalo.tourman.UI.Interfaces.IMainUIBuilder;
import com.gonzalo.tourman.UI.Interfaces.IMenuController;
import com.google.inject.AbstractModule;

public class UIModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(IButtonFactory.class).to(ButtonFactory.class);
		bind(IMainUIBuilder.class).to(MainUIBuilder.class);
		bind(IMenuController.class).to(MenuController.class);
	}

}
