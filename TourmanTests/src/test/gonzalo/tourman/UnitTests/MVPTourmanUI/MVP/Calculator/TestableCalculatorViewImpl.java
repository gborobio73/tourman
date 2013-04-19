package tourman.UnitTests.MVPTourmanUI.MVP.Calculator;

import com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator.CalculatorComponentsFactory;
import com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator.CalculatorViewImpl;
import com.vaadin.ui.Component;

@SuppressWarnings("serial")
public class TestableCalculatorViewImpl extends CalculatorViewImpl{

	public TestableCalculatorViewImpl(CalculatorComponentsFactory factory) {
		super(factory);
	}

	@Override
	public void setCompositionRoot(Component component) {
	}
}
