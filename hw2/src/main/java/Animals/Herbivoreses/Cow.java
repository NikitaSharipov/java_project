package Animals.Herbivoreses;

import Animals.Herbivoreses.Herbivore;
import Animals.Run;
import Animals.Voice;

public class Cow extends Herbivore implements Run, Voice {
    public Cow(int satiety, String name, int size){
        super(satiety, name, size);
    }
    public void run() {
        this.setSatiety(this.getSatiety() - 1);
        System.out.println("Cow is running");
    }

    public String voice() {
        return "MUUUUUUUUUUU";
    }
}
