package demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class Human {

    @Autowired
    @Qualifier("dress")
    private IOutfit outfit;
    @Resource
    private IAnimal animal;
    @Autowired
    private List<IInterest> iInterests;

    public Human() {
    }

    public Human(IOutfit outfit, IAnimal animal, List<IInterest> iInterests) {
        this.outfit = outfit;
        this.animal = animal;
        this.iInterests = iInterests;
    }

    public List<IInterest> getIInterests() {
        return iInterests;
    }

    public void setIInterests(List<IInterest> iInterests) {
        this.iInterests = iInterests;
    }

    public IAnimal getAnimal() {
        return animal;
    }

    public void setAnimal(IAnimal animal) {
        this.animal = animal;
    }

    public IOutfit getOutfit() {
        return outfit;
    }

    public void setOutfit(IOutfit outfit) {
        this.outfit = outfit;
    }
}
