package com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu;

import com.gonzalo.tourman.MVPTourmanUI.Interfaces.IMainMenuListener;
import com.gonzalo.tourman.MVPTourmanUI.Interfaces.IMainMenuPresenter;
import com.gonzalo.tourman.MVPTourmanUI.Interfaces.IWorkingLayoutController;


public class MainMenuPresenter implements IMainMenuListener, IMainMenuPresenter{

	private IWorkingLayoutController workingLayoutPresenter;

	public void menuOptionSelected(String optionName) {
			
		//if(button == "Calculator") workingLayoutPresenter.load(formFactory.buildCalculator());
		if(optionName == "Calculator") workingLayoutPresenter.loadCalculator();
		else workingLayoutPresenter.loadUnknown() ;
		//workingLayout.removeAllComponents();
		//workingLayout.addComponent(new CalculatorView());
	}

	public void setWorkingLayoutController(IWorkingLayoutController workingLayoutPresenter) {
		this.workingLayoutPresenter = workingLayoutPresenter;
		
	}

}
