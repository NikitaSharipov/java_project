package Animals.Carnivorouses;

import Animals.Fly;
import Animals.Voice;

public class Eagle extends Carnivorous implements Fly, Voice {
    public Eagle(int satiety, String name, int size){
        super(satiety, name, size);
    }
    public void fly() {
        System.out.println("Eagle is flying");
        this.setSatiety(this.getSatiety() - 1);
    }

    public String voice() {
        this.setSatiety(this.getSatiety() - 1);
        return "Arrrrrrrr";
    }
}
