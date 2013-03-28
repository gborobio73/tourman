package com.gonzalo.tourman.MVPTourmanUI;

import com.gonzalo.tourman.MVPTourmanUI.Configuration.MVPTourmanUIDependencies;
import com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu.IViewsFactory;
import com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu.MainMenuPresenter;
import com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu.MainMenuViewImpl;
import com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu.ViewsFactory;
import com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu.WorkingLayoutController;
import com.gonzalo.tourman.MVPTourmanUI.MVP.UIComponents.IVerticalLayout;
import com.gonzalo.tourman.MVPTourmanUI.MVP.UIComponents.TourmanVerticalLayout;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class MVPTourmanMainUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		
		Injector injector = Guice.createInjector(new MVPTourmanUIDependencies());
		MainMenuViewImpl menuView = injector.getInstance(MainMenuViewImpl.class);
		
		HorizontalSplitPanel mainLayout = new HorizontalSplitPanel();
		mainLayout.setSplitPosition(150, Unit.PIXELS);
		mainLayout.setLocked(true);
		
		IVerticalLayout verticalLayout = new TourmanVerticalLayout();
		IViewsFactory viewsFactory = new ViewsFactory();
		WorkingLayoutController workingLayoutController = new WorkingLayoutController(verticalLayout, viewsFactory);
		
		MainMenuPresenter mainMenuPresenter = new MainMenuPresenter();
		menuView.addMainMenuPresenter(mainMenuPresenter);
		
		mainMenuPresenter.setWorkingLayoutController(workingLayoutController);
		
		final VerticalLayout menuLayout = new VerticalLayout();
		menuLayout.setMargin(true);
		menuLayout.addComponent(menuView);
		
		mainLayout.addComponent(menuLayout);
		mainLayout.addComponent(verticalLayout.get());
		
		setContent(mainLayout);
	}

}
