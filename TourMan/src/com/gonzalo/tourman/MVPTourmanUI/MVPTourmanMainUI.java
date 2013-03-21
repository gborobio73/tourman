package com.gonzalo.tourman.MVPTourmanUI;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class MVPTourmanMainUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		
		Injector injector = Guice.createInjector(new MVPTourmanUIModule());
		MainMenuModel model = injector.getInstance(MainMenuModel.class);
		MainMenuViewImpl view = injector.getInstance(MainMenuViewImpl.class);
		
		MainMenuPresenter presenter = new MainMenuPresenter(model, view);
		
		/*MainMenuModel model = new MainMenuModel();
		MainMenuViewImpl view = new MainMenuViewImpl(new MainMenuButtonFactory());		
		MainMenuPresenter presenter = new MainMenuPresenter(model, view);
		*/
		final VerticalLayout layout = new VerticalLayout();
		
		layout.setMargin(true);
		layout.addComponent(view);
		
		setContent(layout);
	}

}
