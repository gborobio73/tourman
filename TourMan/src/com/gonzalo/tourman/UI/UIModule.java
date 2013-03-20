package com.gonzalo.tourman.UI;

import com.gonzalo.tourman.UI.Components.MainUIBuilder;
import com.gonzalo.tourman.UI.Interfaces.IMainUIBuilder;
import com.google.inject.AbstractModule;

public class UIModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(IMainUIBuilder.class).to(MainUIBuilder.class);
	}

}
