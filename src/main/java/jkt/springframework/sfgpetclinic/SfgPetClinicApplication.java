package jkt.springframework.sfgpetclinic;

import jkt.springframework.sfgpetclinic.controller.MyController;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.net.ContentHandler;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {

       ConfigurableApplicationContext ctx = SpringApplication.run(SfgPetClinicApplication.class, args);

        MyController myController=(MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello());
    }

}
