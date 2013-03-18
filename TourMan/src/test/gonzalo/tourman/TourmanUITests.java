package test.gonzalo.tourman;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import com.gonzalo.tourman.UI.IMainUIBuilder;
import com.gonzalo.tourman.UI.TourmanUI;
import com.gonzalo.tourman.UI.Components.MainUIBuilder;
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
	public void test() {
		sut.Build();
		
		verify(mainUIBuilder).createNavigationMenu();
		verify(mainUIBuilder).createWelcome();
	}

}
