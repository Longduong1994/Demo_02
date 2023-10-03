package demo.model;

import org.springframework.stereotype.Component;

@Component
public class Trousers implements IOutfit{
    @Override
    public void wear() {
        System.out.println("trousers");
    }
}
