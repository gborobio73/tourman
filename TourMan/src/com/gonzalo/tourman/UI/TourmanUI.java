package com.gonzalo.tourman.UI;

import com.gonzalo.tourman.UI.Components.MainUIBuilder;
import com.gonzalo.tourman.UI.Interfaces.IMainUIBuilder;
import com.gonzalo.tourman.UI.Interfaces.ITourmanUI;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;

public class TourmanUI implements ITourmanUI{
	
	public TourmanUI ()
	{
		
	}
		
	public Component Build()
	{
		Injector injector = Guice.createInjector(new UIModule());
	    MainUIBuilder mainUIBuilder = injector.getInstance(MainUIBuilder.class);
	    
		HorizontalSplitPanel mainLayout = new HorizontalSplitPanel();
		
		mainLayout.setSplitPosition(150, Unit.PIXELS);
		mainLayout.setLocked(true);
		mainLayout.addComponent(mainUIBuilder.createNavigationMenu());
		mainLayout.addComponent(mainUIBuilder.createWelcome());
		return mainLayout;
	}
	
}
