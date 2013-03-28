package com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu;

import com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator.CalculatorComponentsFactory;
import com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator.CalculatorModel;
import com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator.CalculatorPresenter;
import com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator.CalculatorViewImpl;

public class ViewsFactory implements IViewsFactory
{
	public  CalculatorViewImpl buildCalculatorView() 
	{
		CalculatorModel model = new CalculatorModel();
		CalculatorViewImpl view = new CalculatorViewImpl(new CalculatorComponentsFactory());
		CalculatorPresenter presenter = new CalculatorPresenter(model, view);
		
		view.addPresenter(presenter);
		return view;
	}

}
