package Animals.Herbivoreses;

import Animals.Fly;
import Animals.Herbivoreses.Herbivore;
import Animals.Voice;
import Animals.Fly;
import Animals.Swim;

public class Duck extends Herbivore implements Fly, Voice, Swim {
    int satiety;

    public Duck(int satiety){
        super(satiety);
    }
    public void fly() {
        this.satiety -= 1;
        System.out.println("Duck is flying");
    }

    public String voice() {
        this.satiety -= 1;
        return "duck duck duck duck";
    }

    public void swim() {
        this.satiety -= 1;
        System.out.println("Duck is swimming");
    }
}
