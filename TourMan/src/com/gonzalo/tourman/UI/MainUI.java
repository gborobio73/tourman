package com.gonzalo.tourman.UI;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
public class MainUI extends UI {
	
	@Override
	protected void init(VaadinRequest request) 
	{
		TourmanUI tourmanUI = new TourmanUI();
		setContent(tourmanUI.Build());
	}
}
