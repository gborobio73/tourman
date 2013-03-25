package com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu;

import java.util.ArrayList;
import java.util.List;

import com.gonzalo.tourman.MVPTourmanUI.Interfaces.IMainMenuButtonFactory;
import com.gonzalo.tourman.MVPTourmanUI.Interfaces.IMainMenuListener;
import com.gonzalo.tourman.MVPTourmanUI.Interfaces.IMainMenuView;
import com.google.inject.Inject;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;

public class MainMenuViewImpl extends CustomComponent implements IMainMenuView, ClickListener{

	List<IMainMenuListener> listeners = new ArrayList<IMainMenuListener>();
	
	@Inject
	public MainMenuViewImpl(IMainMenuButtonFactory buttonFactory)
	{
		VerticalLayout layout  = new VerticalLayout();
		Button helloButton = buttonFactory.buildCalculatorButton();
		helloButton.addClickListener(this);
		layout.addComponent(helloButton);
		
		Button anotherButton = buttonFactory.buildYeeeeiiiButton();
		anotherButton.addClickListener(this);
		layout.addComponent(anotherButton);
		
		Button erikaButton = buttonFactory.buildErikaButton();
		erikaButton.addClickListener(this);
		layout.addComponent(erikaButton);
		
		setCompositionRoot(layout);
	}

	
	public void addMainMenuPresenter(IMainMenuListener mainMenuListener) {
		listeners.add(mainMenuListener);
	}

	@Override
	public void buttonClick(ClickEvent event) {
		for(IMainMenuListener listener : listeners)
			listener.menuOptionSelected(event.getButton().getCaption());
		
	}
}
