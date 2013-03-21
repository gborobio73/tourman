package com.gonzalo.tourman.MVPTourmanUI;

import com.vaadin.ui.Notification;

public class MainMenuPresenter implements IMainMenuListener{

	private IMainMenuModel model;
	private IMainMenuView view;

	public MainMenuPresenter(IMainMenuModel model, IMainMenuView view) {
		this.model = model;
		this.view = view;
		
		view.addListener(this);
	}

	@Override
	public void buttonClick(String button) {
		Notification.show(button);
		
	}

}
