package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.spring6di.services.GreetingServiceImpl;

class ConstructorInjectedControllerTest {

  ConstructorInjectedController constructorInjectedController;

  @BeforeEach
  void setUp() throws Exception {
    constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
  }

  @Test
  void sayHello() {
    System.out.println(constructorInjectedController.sayHello());
  }

}
