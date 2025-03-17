package guru.springframework.spring6di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import guru.springframework.spring6di.controllers.MyController;

@SpringBootTest
class Spring6DiApplicationTests {

  @Autowired
  private ApplicationContext context;

  @Autowired
  private MyController myController;

  @Test
  void testAutowiredOfController() {
    System.out.println(myController.sayHello());
  }

  @Test
  void testGetControllerFromCntx() {
    MyController myController = context.getBean(MyController.class);

    System.out.println(myController.sayHello());
  }

}
