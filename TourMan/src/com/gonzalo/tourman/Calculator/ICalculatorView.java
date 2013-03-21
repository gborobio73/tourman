package com.gonzalo.tourman.Calculator;

public interface ICalculatorView {

	public void setDisplay(double value);

    public void addListener(ICalculatorViewListener listener);
}
