package com.gonzalo.tourman.Calculator;

import com.gonzalo.tourman.Calculator.ICalculatorViewListener;

public class CalculatorPresenter implements ICalculatorViewListener{

	private CalculatorModel model;
	private ICalculatorView view;
	private double current = 0.0;
    private char   lastOperationRequested = 'C';

	public CalculatorPresenter(CalculatorModel model, ICalculatorView view) {
		this.model = model;
		this.view = view;
		
		view.setDisplay(current);            
        view.addListener(this);
		
	}

	@Override
	public void buttonClick(char operation) {
		// Handle digit input
        if ('0' <= operation && operation <= '9') {
            current = current * 10
                    + Double.parseDouble("" + operation);
            view.setDisplay(current);
            return;
        }

        // Execute the previously input operation
        switch (lastOperationRequested) {
        case '+':
            model.add(current);
            break;
        case '-':
            model.add(-current);
            break;
        case '/':
            model.divide(current);
            break;
        case '*':
            model.multiply(current);
            break;
        case 'C':
            model.setValue(current);
            break;
        } // '=' is implicit

        lastOperationRequested = operation;

        current = 0.0;
        if (operation == 'C')
            model.clear();
        view.setDisplay(model.getValue());
		
	}

}
