package com.gonzalo.tourman.Calculator;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class CalculatorMainUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		CalculatorModel model = new CalculatorModel();
		CalculatorViewImpl view = new CalculatorViewImpl();
		
		CalculatorPresenter presenter = new CalculatorPresenter(model, view);
		
		final VerticalLayout layout = new VerticalLayout();
		
		layout.setMargin(true);
		layout.addComponent(view);
		setContent(layout);
	}

}
