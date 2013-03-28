package com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator;

import com.vaadin.ui.CustomComponent;

public interface ICalculatorView {

	public void setDisplay(double value);

    public void addPresenter(ICalculatorViewListener listener);

}
