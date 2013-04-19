package test.gonzalo.tourman.UnitTests;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

import com.gonzalo.tourman.UI.UIManager;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.VerticalLayout;


public class UIManagerTests {

	private UIManager sut;

	@Before
    public void setUp() {
		sut = new UIManager();
    }
	
	@Test
	public void shouldRemoveAllComponents() {
		VerticalLayout layout = mock(VerticalLayout.class);
		sut.setWorkingLayout(layout);
		
		sut.openForm(mock(FormLayout.class));
		
		verify(layout).removeAllComponents();
		
	}
	
	@Test
	public void shouldAddFormWhenOpeningForm() {
		VerticalLayout layout = mock(VerticalLayout.class);
		sut.setWorkingLayout(layout);
		
		FormLayout formToOpen = mock(FormLayout.class);
		sut.openForm(formToOpen);
		
		verify(layout).addComponent(formToOpen);
		
	}

}
