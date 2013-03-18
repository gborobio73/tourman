package com.gonzalo.tourman.UI.Interfaces;

import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;

public interface IMainUIBuilder {
	public HorizontalSplitPanel buildManiLayout();
	public Component createNavigationMenu() ;
	public Component createWelcome();
}
