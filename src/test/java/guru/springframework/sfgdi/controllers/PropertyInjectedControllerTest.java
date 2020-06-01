package guru.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;
    
    @BeforeEach
    void setUp()
    {
        controller = new PropertyInjectedController();
        controller.greetingService = new PropertyInjectedGreetingService();
    }
    
    @Test
    void testGetGreeting() {
        assertEquals("Hello World", controller.getGreeting());
        //System.out.println(controller.getGreeting());
    }

}
