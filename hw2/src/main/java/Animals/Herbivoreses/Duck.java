package Animals.Herbivoreses;

import Animals.Fly;
import Animals.Herbivoreses.Herbivore;
import Animals.Voice;
import Animals.Fly;
import Animals.Swim;

public class Duck extends Herbivore implements Fly, Voice, Swim {
    public Duck(int satiety, String name){
        super(satiety, name);
    }
    public void fly() {
        this.setSatiety(this.getSatiety() - 1);
        System.out.println("Duck is flying");
    }

    public String voice() {
        this.setSatiety(this.getSatiety() - 1);
        return "duck duck duck duck";
    }

    public void swim() {
        this.setSatiety(this.getSatiety() - 1);
        System.out.println("Duck is swimming");
    }
}
