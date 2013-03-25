package com.gonzalo.tourman.MVPTourmanUI.MVP.MainMenu;

import com.gonzalo.tourman.MVPTourmanUI.Interfaces.IWorkingLayoutController;
import com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator.CalculatorModel;
import com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator.CalculatorPresenter;
import com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator.CalculatorViewImpl;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

public class WorkingLayoutController implements IWorkingLayoutController{

	private VerticalLayout layout;

	public WorkingLayoutController(VerticalLayout workingLayout)
	{
		this.layout = workingLayout;
	}

	public void loadCalculator() {
		
		layout.removeAllComponents();
		
		CalculatorModel model = new CalculatorModel();
		CalculatorViewImpl view = new CalculatorViewImpl();
		
		CalculatorPresenter presenter = new CalculatorPresenter(model, view);
		
		view.addPresenter(presenter);
		
		layout.addComponent(view);		
	}

	public void loadUnknown() {
		layout.removeAllComponents();
		Notification.show("Unknown");
		
	}

	public void loadFakDat() {
		layout.removeAllComponents();
		Notification.show("That is Erika's button");
	}
}
