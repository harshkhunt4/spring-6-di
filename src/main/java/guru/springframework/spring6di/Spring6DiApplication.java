package guru.springframework.spring6di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.spring6di.controllers.MyController;

@SpringBootApplication
public class Spring6DiApplication {

  public static void main(String[] args) {
    ApplicationContext run = SpringApplication.run(Spring6DiApplication.class, args);

    MyController controller = run.getBean(MyController.class);

    System.out.println("In Main Method");

    System.out.println(controller.sayHello());

  }

}
