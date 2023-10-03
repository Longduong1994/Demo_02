package demo.model;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Sports implements IInterest{
    @Override
    public void describe() {
        System.out.println("play football");
    }
}
