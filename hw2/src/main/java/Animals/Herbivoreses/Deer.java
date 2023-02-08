package Animals.Herbivoreses;

import Animals.Herbivoreses.Herbivore;
import Animals.Run;
import Animals.Voice;

public class Deer extends Herbivore implements Run, Voice {
    int satiety;
    public Deer(int satiety){
        super(satiety);
    }
    public void run() {
        this.satiety -= 1;
        System.out.println("Deer is running");
    }

    public String voice() {
        this.satiety -= 1;
        return "Muhuhuhuhuhu";
    }
}
