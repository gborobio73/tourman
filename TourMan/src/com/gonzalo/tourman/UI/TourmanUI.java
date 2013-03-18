package com.gonzalo.tourman.UI;

import com.gonzalo.tourman.UI.Interfaces.IMainUIBuilder;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.UI;

public class TourmanUI {
	IMainUIBuilder mainUIBuilder;
	UI mainUI;
	public TourmanUI (UI mainUI, IMainUIBuilder mainUIBuilder)
	{
		this.mainUIBuilder = mainUIBuilder;
		this.mainUI = mainUI;
	}
	
	public void Build()
	{
		HorizontalSplitPanel mainLayout = new HorizontalSplitPanel();
		
		mainLayout.setSplitPosition(150, Unit.PIXELS);
		mainLayout.setLocked(true);
		mainUI.setContent(mainLayout);
		
		mainLayout.addComponent(mainUIBuilder.createNavigationMenu());
		mainLayout.addComponent(mainUIBuilder.createWelcome());
	}
	
}
