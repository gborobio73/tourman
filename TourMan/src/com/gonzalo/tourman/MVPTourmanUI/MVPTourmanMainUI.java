package com.gonzalo.tourman.MVPTourmanUI;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class MVPTourmanMainUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		
		Injector injector = Guice.createInjector(new MVPTourmanUIModule());
		MainMenuModel menuModel = injector.getInstance(MainMenuModel.class);
		MainMenuViewImpl menuView = injector.getInstance(MainMenuViewImpl.class);
		
		HorizontalSplitPanel mainLayout = new HorizontalSplitPanel();
		mainLayout.setSplitPosition(150, Unit.PIXELS);
		mainLayout.setLocked(true);
		
		final VerticalLayout menuLayout = new VerticalLayout();
		final VerticalLayout verticalLayout = new VerticalLayout();
		WorkingLayoutController workingLayoutController = new WorkingLayoutController(verticalLayout);
		IMainMenuPresenter presenter = new MainMenuPresenter(menuModel, menuView);
		presenter.setWorkingLayoutController(workingLayoutController);
		
		menuLayout.setMargin(true);
		menuLayout.addComponent(menuView);
		
		mainLayout.addComponent(menuLayout);
		mainLayout.addComponent(verticalLayout);
		
		setContent(mainLayout);
	}

}
