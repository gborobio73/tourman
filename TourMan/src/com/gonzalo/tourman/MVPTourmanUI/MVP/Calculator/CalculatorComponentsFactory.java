package com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator;

import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;

public class CalculatorComponentsFactory {

	public GridLayout buildCalculatorLayout(Label display, ClickListener listener) {
		GridLayout layout  = new GridLayout(4, 5);
		layout.addComponent(display, 0, 0, 3, 0);
		String[] operations = new String[] {
            "7", "8", "9", "/", "4", "5", "6",
            "*", "1", "2", "3", "-", "0", "=", "C", "+" };
        
		for (String caption: operations)
            layout.addComponent(new Button(caption, listener));
		return layout;
	}

}
