package Animals.Carnivorouses;

import Animals.Swim;

public class Shark extends Carnivorous implements Swim {
    public Shark(int satiety){
        super(satiety);
    }

    public void swim() {
        this.setSatiety(this.getSatiety() - 1);
        System.out.println("Shark is swimming");
    }
}
