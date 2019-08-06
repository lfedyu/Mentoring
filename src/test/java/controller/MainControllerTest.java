package controller;

import org.junit.*;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MainControllerTest {

    MainController test;

    @Before
    public void setUp() throws Exception {
        test = mock(MainController.class);
    }

    @Test
    public void add() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("res", 19);
        when(test.add(8, 11)).thenReturn(mv);

        assertNotNull(test.add(8,11));
        assertEquals(test.add(8,11).getModel().get("res"), 19);
    }

}
