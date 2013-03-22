package com.gonzalo.tourman.UI.Components;

import com.gonzalo.tourman.UI.Interfaces.IMainUIBuilder;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class MainUIBuilder implements IMainUIBuilder{
	
	public HorizontalSplitPanel buildMainLayout() {
		HorizontalSplitPanel mainLayout = new HorizontalSplitPanel();
		
		mainLayout.setSplitPosition(150, Unit.PIXELS);
		mainLayout.setLocked(true);
		return mainLayout;
	}
	
	public VerticalLayout createWorkingLayout() {
		VerticalLayout welcome = new VerticalLayout();
		welcome.setMargin(true);
		welcome.addComponent(new Label("Welcome to tournament manager"));
		return welcome;
	}

}
