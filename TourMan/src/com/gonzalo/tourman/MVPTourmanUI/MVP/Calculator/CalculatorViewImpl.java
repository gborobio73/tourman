package com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator;

import java.util.ArrayList;
import java.util.List;

import com.gonzalo.tourman.MVPTourmanUI.MVP.UIComponents.ICustomComponent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

public class CalculatorViewImpl extends CustomComponent implements ICalculatorView, ICustomComponent, ClickListener  {

	private Label display = new Label("0.0");
	List<ICalculatorViewListener> listeners = new ArrayList<ICalculatorViewListener>();

    public CalculatorViewImpl() {
        
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

	public CustomComponent getComponent() {
		GridLayout layout  = new GridLayout(4, 5);
		layout.addComponent(display, 0, 0, 3, 0);
        
		String[] operations = new String[] {
            "7", "8", "9", "/", "4", "5", "6",
            "*", "1", "2", "3", "-", "0", "=", "C", "+" };
        
		for (String caption: operations)
            layout.addComponent(new Button(caption, this));

        setCompositionRoot(layout);
        return this;
	}	

}
