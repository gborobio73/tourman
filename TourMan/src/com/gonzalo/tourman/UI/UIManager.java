package com.gonzalo.tourman.UI;

import com.vaadin.ui.FormLayout;
import com.vaadin.ui.VerticalLayout;

public class UIManager {

	private VerticalLayout workingLayout;
	
	public UIManager() {
	}

	public void setWorkingLayout(VerticalLayout layout) {
		workingLayout = layout;
		
	}
	
	public void openForm(FormLayout form) {
		workingLayout.removeAllComponents();
		workingLayout.addComponent(form);
	}

}
