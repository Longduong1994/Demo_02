package demo.model;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Primary
@Service
@Scope("prototype")
public class Cat implements IAnimal{
    @Override
    public void speak() {
        System.out.println("meow");
    }
}
