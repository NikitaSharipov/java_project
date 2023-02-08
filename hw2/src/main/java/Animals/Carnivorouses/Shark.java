package Animals.Carnivorouses;

import Animals.Swim;

public class Shark extends Carnivorous implements Swim {
    int satiety;
    public Shark(int satiety){
        super(satiety);
    }

    public void swim() {
        this.satiety -= 1;
        System.out.println("Shark is swimming");
    }
}
