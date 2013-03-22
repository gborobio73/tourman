package com.gonzalo.tourman.UI;

import com.gonzalo.tourman.UI.Components.MenuButtonFactory;
import com.gonzalo.tourman.UI.Components.MenuController;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class NewMainUI extends UI{

	@Override
	protected void init(VaadinRequest request) {
		
		HorizontalSplitPanel mainLayout = buildMainLayout(); 
		VerticalLayout workingLayout = createWorkingLayout();
		UIManager uiManager = new UIManager();
		uiManager.setWorkingLayout(workingLayout);
		MenuController menuController = new MenuController(uiManager);
		NavigationMenuNew navigationMenu = new NavigationMenuNew(menuController, new MenuButtonFactoryNew());
		mainLayout.addComponent(navigationMenu.buildMenu());
		mainLayout.addComponent(workingLayout);
		setContent(mainLayout);
	}

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
