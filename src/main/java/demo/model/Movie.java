package demo.model;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.LOWEST_PRECEDENCE)
public class Movie implements IInterest{
    @Override
    public void describe() {
        System.out.println("watch a movie");
    }
}
