package tourman.UnitTests;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.gonzalo.tourman.UI.TourmanUI;
import com.gonzalo.tourman.UI.Interfaces.IMainUIBuilder;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;

public class TourmanUITests {

	TourmanUI sut ;
	IMainUIBuilder mainUIBuilder;
	
	@Before
    public void setUp() {
		mainUIBuilder = mock(IMainUIBuilder.class);
		when(mainUIBuilder.buildMainLayout()).thenReturn(mock( HorizontalSplitPanel.class) );
        sut = new TourmanUI(mainUIBuilder);
    }
	
	@Test
	public void shouldBuildTourmanUI()
	{
		Component ui = sut.buildContent();
		assertNotNull(ui);
	}
	
	@Test
	public void shouldBuildMainLayout() {
		sut.buildContent();
		
		verify(mainUIBuilder).buildMainLayout();
	}
	
	@Test
	public void shouldCreateNavigationMenu() {
		sut.buildContent();
		
		verify(mainUIBuilder).createWorkingLayout();
	}
	
	@Test
	public void shouldCreateWelcome() {
		sut.buildContent();
		
		verify(mainUIBuilder).createWorkingLayout();
	}

}
