package com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator;

import java.util.ArrayList;
import java.util.List;
import com.gonzalo.tourman.MVPTourmanUI.MVP.UIComponents.ICustomComponent;
import com.google.inject.Inject;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

@SuppressWarnings("serial")
public class CalculatorViewImpl extends CustomComponent implements ICalculatorView, ICustomComponent, ClickListener  {

	private CalculatorComponentsFactory factory;
	private Label display = new Label("0.0");
	List<ICalculatorViewListener> listeners = new ArrayList<ICalculatorViewListener>();

	@Inject
	public CalculatorViewImpl(CalculatorComponentsFactory factory)
	{
		this.factory = factory;
	}
	
	public void setDisplay(double value) {
        display.setValue(Double.toString(value));
    }

    public void addPresenter(ICalculatorViewListener listener) {
        listeners.add(listener);
    }

    @Override
    public void buttonClick(ClickEvent event) {
        for (ICalculatorViewListener listener: listeners)
            listener.buttonClick(event.getButton().getCaption().charAt(0));
    }

	public CustomComponent getComponent() {
		GridLayout layout = factory.buildCalculatorLayout(display, this);
        
        setCompositionRoot(layout);
        
        return this;
	}

		

}
