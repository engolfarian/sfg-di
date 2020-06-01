package guru.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;

class SetterInjectedControllerTest {
    
    SetterInjectedController controller;

    @BeforeEach
    void setUp() throws Exception {
        controller = new SetterInjectedController();
        controller.setGreetingService(new PropertyInjectedGreetingService());
    }

    @Test
    void testGetGreeting() {
        assertEquals("Hello World", controller.getGreeting());
        //System.out.println(controller.getGreeting());
    }

}
