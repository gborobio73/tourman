package com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu;

import com.gonzalo.tourman.MVPTourmanUI.Interfaces.IMainMenuListener;
import com.gonzalo.tourman.MVPTourmanUI.Interfaces.IMainMenuPresenter;
import com.gonzalo.tourman.MVPTourmanUI.Interfaces.IWorkingLayoutController;


public class MainMenuPresenter implements IMainMenuListener, IMainMenuPresenter{

	private IWorkingLayoutController workingLayoutPresenter;

	public void menuOptionSelected(String optionName) {
		
		if(optionName == "Calculator")
		{
			workingLayoutPresenter.loadCalculator();
		}
		else if(optionName == "Erika")
		{
			workingLayoutPresenter.loadFakDat();
		}
		else
		{
			workingLayoutPresenter.loadUnknown();
		}
	}

	public void setWorkingLayoutController(IWorkingLayoutController workingLayoutPresenter) {
		this.workingLayoutPresenter = workingLayoutPresenter;
		
	}

}
