package demo.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dress")
public class Dress implements IOutfit{
    @Override
    public void wear() {
        System.out.println("dress");
    }
}
