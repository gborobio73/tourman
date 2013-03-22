package com.gonzalo.tourman.UI.Components;

import com.gonzalo.tourman.UI.UIManager;
import com.gonzalo.tourman.UI.Interfaces.IMenuController;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;

public class MenuController implements IMenuController
{
	private UIManager uiManager;
	
	public MenuController(UIManager uiManager) {
		this.uiManager = uiManager;
	}

	public void openAddTournamentForm() {
		//Notification.show("The button was clicked",Type.TRAY_NOTIFICATION);
		//final Window window = new Window("Add tournament");
        final FormLayout addTournamentForm = new FormLayout();
        addTournamentForm.addComponent(new Label("Add tournament"));
        //window.setContent(addTournamentForm);
        uiManager.openForm(addTournamentForm);
	}

	public void openWelcomeForm() {
		final FormLayout addTournamentForm = new FormLayout();
        addTournamentForm.addComponent(new Label("Welcome"));
        uiManager.openForm(addTournamentForm);
		
	}

}
