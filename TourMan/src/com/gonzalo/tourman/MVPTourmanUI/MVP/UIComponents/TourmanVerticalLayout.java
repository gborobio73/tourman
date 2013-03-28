package com.gonzalo.tourman.MVPTourmanUI.MVP.UIComponents;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;

public class TourmanVerticalLayout implements IVerticalLayout {

	private VerticalLayout layout;
	
	public TourmanVerticalLayout()
	{
		this.layout = new VerticalLayout();
	}
	
	public VerticalLayout get() {
		return layout;
	}

	public void clear() {
		layout.removeAllComponents();
	}
	
	public void addComponent(CustomComponent component) {
		layout.addComponent(component);
		
	}


}
