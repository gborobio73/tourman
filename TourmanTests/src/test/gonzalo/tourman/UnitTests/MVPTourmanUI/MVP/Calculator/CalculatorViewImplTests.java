package tourman.UnitTests.MVPTourmanUI.MVP.Calculator;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.gonzalo.tourman.MVPTourmanUI.MVP.Calculator.CalculatorComponentsFactory;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

public class CalculatorViewImplTests {
	private TestableCalculatorViewImpl sut;
	private CalculatorComponentsFactory factory;

	@Before
	public void setup()
	{
		factory = mock(CalculatorComponentsFactory.class);
		sut = new TestableCalculatorViewImpl(factory);
	}
	
	@Test
	public void getComponentShouldAddToRoot() {
		TestableCalculatorViewImpl spysut = spy(sut);
		GridLayout layout = mock(GridLayout.class);
		
		when(factory.buildCalculatorLayout(any(Label.class), any(ClickListener.class))).thenReturn(layout);

		spysut.getComponent();
		
		verify(spysut).setCompositionRoot(layout);
	}

}
