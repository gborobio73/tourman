package com.gonzalo.tourman.MVPTourmanUI;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;

public class MainMenuViewImpl extends CustomComponent implements IMainMenuView, ClickListener  {

	List<IMainMenuListener> listeners = new ArrayList<IMainMenuListener>();
	
	@Inject
	public MainMenuViewImpl(IMainMenuButtonFactory buttonFactory)
	{
		// draw the view
		VerticalLayout layout  = new VerticalLayout();
		Button helloButton = buttonFactory.buildHelloButton();
		helloButton.addClickListener(this);
		layout.addComponent(helloButton);
		
		setCompositionRoot(layout);
	}

	
	public void addListener(IMainMenuListener mainMenuListener) {
		listeners.add(mainMenuListener);
	}

	@Override
	public void buttonClick(ClickEvent event) {
		for(IMainMenuListener listener : listeners)
			listener.buttonClick(event.getButton().getCaption());
		
	}

}
