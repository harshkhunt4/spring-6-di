package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.spring6di.services.GreetingServiceImpl;

class SetterInjectedControllerTest {

  private SetterInjectedController setterInjectedController;

  @BeforeEach
  void setUp() throws Exception {
    setterInjectedController = new SetterInjectedController();
    setterInjectedController.setGreetingService(new GreetingServiceImpl());
  }

  @Test
  void sayHello() {
    System.out.println(setterInjectedController.sayHello());
  }

}
