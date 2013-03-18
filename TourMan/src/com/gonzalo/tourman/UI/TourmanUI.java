package com.gonzalo.tourman.UI;

import com.gonzalo.tourman.UI.Interfaces.IMainUIBuilder;
import com.gonzalo.tourman.UI.Interfaces.ITourmanUI;
import com.google.inject.Inject;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.UI;

public class TourmanUI implements ITourmanUI{
	IMainUIBuilder mainUIBuilder;
	
	@Inject
	public TourmanUI (IMainUIBuilder mainUIBuilder)
	{
		this.mainUIBuilder = mainUIBuilder;
	}
		
	public Component Build()
	{
		HorizontalSplitPanel mainLayout = new HorizontalSplitPanel();
		
		mainLayout.setSplitPosition(150, Unit.PIXELS);
		mainLayout.setLocked(true);
		mainLayout.addComponent(mainUIBuilder.createNavigationMenu());
		mainLayout.addComponent(mainUIBuilder.createWelcome());
		return mainLayout;
	}
	
}
