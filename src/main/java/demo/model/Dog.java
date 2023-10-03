package demo.model;

import org.springframework.stereotype.Component;

@Component
public class Dog implements IAnimal{
    @Override
    public void speak() {
        System.out.println("grow");
    }
}
