package com.gonzalo.tourman.UI;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
public class MainUI extends UI {
	
	@Override
	protected void init(VaadinRequest request) {
		Injector injector = Guice.createInjector(new UIModule());
		TourmanUI tourmanUI = injector.getInstance(TourmanUI.class);
		setContent(tourmanUI.Build());
	}
}
