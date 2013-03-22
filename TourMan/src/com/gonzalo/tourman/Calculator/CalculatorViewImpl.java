package com.gonzalo.tourman.Calculator;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

public class CalculatorViewImpl extends CustomComponent implements ICalculatorView, ClickListener  {

	private Label display = new Label("0.0");
	/* Only the presenter registers one listener... */
    List<ICalculatorViewListener> listeners = new ArrayList<ICalculatorViewListener>();

    public CalculatorViewImpl() {
        GridLayout layout  = new GridLayout(4, 5);

        // Create a result label that spans over all
        // the 4 columns in the first row
        layout.addComponent(display, 0, 0, 3, 0);
    
        // The operations for the calculator in the order
        // they appear on the screen (left to right, top
        // to bottom)
        String[] operations = new String[] {
            "7", "8", "9", "/", "4", "5", "6",
            "*", "1", "2", "3", "-", "0", "=", "C", "+" };

        // Add buttons and have them send click events
        // to this class
        for (String caption: operations)
            layout.addComponent(new Button(caption, this));

        setCompositionRoot(layout);
    }
    
    public void setDisplay(double value) {
        display.setValue(Double.toString(value));
    }

    public void addPresenter(ICalculatorViewListener listener) {
        listeners.add(listener);
    }

    /** Relay button clicks to the presenter with an
     *  implementation-independent event */
    @Override
    public void buttonClick(ClickEvent event) {
        for (ICalculatorViewListener listener: listeners)
            listener.buttonClick(event.getButton().getCaption().charAt(0));
    }	

}
