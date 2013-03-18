package com.gonzalo.tourman.UI;

import com.gonzalo.tourman.UI.Interfaces.IMainUIBuilder;
import com.gonzalo.tourman.UI.Interfaces.ITourmanUI;
import com.google.inject.Inject;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;

public class TourmanUI implements ITourmanUI{
	
	IMainUIBuilder mainUIBuilder;
	
	@Inject
	public TourmanUI (IMainUIBuilder mainUIBuilder)
	{
		this.mainUIBuilder = mainUIBuilder;
		
	}
		
	public Component Build()
	{
		HorizontalSplitPanel mainLayout = mainUIBuilder.buildManiLayout();
		mainLayout.addComponent(mainUIBuilder.createNavigationMenu());
		mainLayout.addComponent(mainUIBuilder.createWelcome());
		return mainLayout;
	}

	
	
}
