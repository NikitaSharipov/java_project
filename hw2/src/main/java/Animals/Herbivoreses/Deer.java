package Animals.Herbivoreses;

import Animals.Herbivoreses.Herbivore;
import Animals.Run;
import Animals.Voice;

public class Deer extends Herbivore implements Run, Voice {
    public Deer(int satiety, String name){
        super(satiety, name);
    }
    public void run() {
        this.setSatiety(this.getSatiety() - 1);
        System.out.println("Deer is running");
    }

    public String voice() {
        this.setSatiety(this.getSatiety() - 1);
        return "Muhuhuhuhuhu";
    }
}
