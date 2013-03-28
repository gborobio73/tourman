package com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator;

public interface ICalculatorView {

	public void setDisplay(double value);

    public void addPresenter(ICalculatorViewListener presenter);

}
