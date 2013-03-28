package com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu;

import com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator.CalculatorViewImpl;

public interface IViewsFactory {
	public  CalculatorViewImpl buildCalculatorPresenter() ;

}
