package com.ertugrul.sfgdi.controllers;

import com.ertugrul.sfgdi.services.GreetingService;
import com.ertugrul.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreetingService() {
        System.out.println(controller.getGreeting());
    }
}