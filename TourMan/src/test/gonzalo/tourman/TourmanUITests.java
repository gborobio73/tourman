package test.gonzalo.tourman;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import com.gonzalo.tourman.UI.Interfaces.IMainUIBuilder;
import com.gonzalo.tourman.UI.TourmanUI;
import com.vaadin.ui.UI;

public class TourmanUITests {

	TourmanUI sut ;
	IMainUIBuilder mainUIBuilder;
	
	@Before
    public void setUp() {
		UI ui = mock(UI.class);
		mainUIBuilder = mock(IMainUIBuilder.class);
        sut = new TourmanUI(ui, mainUIBuilder);
    }
	
	@Test
	public void shouldCreateNavigationMenu() {
		sut.Build();
		
		verify(mainUIBuilder).createWelcome();
	}
	
	@Test
	public void shouldCreateWelcome() {
		sut.Build();
		
		verify(mainUIBuilder).createWelcome();
	}

}
