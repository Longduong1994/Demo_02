package demo;

import demo.model.Cat;
import demo.model.Human;
import demo.model.IAnimal;
import demo.model.IInterest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo02Application {

    public static void main(String[] args) {

       ApplicationContext context = SpringApplication.run(Demo02Application.class, args);
       Human human =  context.getBean(Human.class);
        System.out.println(human);
        human.getAnimal().speak();
        human.getOutfit().wear();
        for (IInterest i: human.getIInterests()) {
            i.describe();
        }


        Cat cat1 = context.getBean(Cat.class);
        Cat cat2 = context.getBean(Cat.class);

        System.out.println(cat1);
        System.out.println(cat2);
    }

}
