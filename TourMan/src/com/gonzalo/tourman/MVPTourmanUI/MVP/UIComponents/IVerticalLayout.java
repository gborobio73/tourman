package com.gonzalo.tourman.MVPTourmanUI.MVP.UIComponents;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;

public interface IVerticalLayout {
	
	public VerticalLayout getLayout();

	public void clear();

	public void addComponent(CustomComponent component);

}
