package com.gonzalo.tourman.UI;

import com.gonzalo.tourman.UI.Components.MainUIBuilder;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
public class MainUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		new TourmanUI(this, new MainUIBuilder()).Build();
	}

	

}
