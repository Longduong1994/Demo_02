package demo.model;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Music implements IInterest {
    @Override
    public void describe() {
        System.out.println("listen to music");
    }
}
