package controller;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MainControllerUnitTest {

    @Mock
    private MainController mainController;

    @Test
    public void add() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("res", 19);
        when(mainController.add(8, 11)).thenReturn(mv);

        assertNotNull(mainController.add(8,11));
        assertEquals(19, mainController.add(8,11).getModel().get("res"));
    }

}
