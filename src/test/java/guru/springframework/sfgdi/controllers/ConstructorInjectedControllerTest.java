package guru.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    
    @BeforeEach
    void setUp() throws Exception {
        controller = new ConstructorInjectedController(new PropertyInjectedGreetingService());
    }

    @Test
    void testGetGreeting() {
        assertEquals("Hello World", controller.getGreeting());
        //System.out.println(controller.getGreeting());
    }

}
