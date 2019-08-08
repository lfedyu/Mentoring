package controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import config.ProjConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ProjConfig.class })
@WebAppConfiguration
public class GreetControllerIntegrationTest {

    @Test
    public void integrationTest(){

    }
}
