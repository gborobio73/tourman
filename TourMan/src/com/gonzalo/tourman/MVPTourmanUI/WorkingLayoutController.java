package com.gonzalo.tourman.MVPTourmanUI;

import com.gonzalo.tourman.Calculator.CalculatorModel;
import com.gonzalo.tourman.Calculator.CalculatorPresenter;
import com.gonzalo.tourman.Calculator.CalculatorViewImpl;
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
		
		view.addPResenter(presenter);
		
		layout.addComponent(view);		
	}

	public void loadUnknown() {
		layout.removeAllComponents();
		Notification.show("Unknown");
		
	}
}
