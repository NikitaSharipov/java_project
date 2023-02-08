package Animals.Herbivoreses;

import Animals.Herbivoreses.Herbivore;
import Animals.Run;
import Animals.Voice;

public class Cow extends Herbivore implements Run, Voice {
    int satiety;
    public Cow(int satiety){
        super(satiety);
    }
    public void run() {
        this.satiety -= 1;
        System.out.println("Cow is running");
    }

    public String voice() {
        return "MUUUUUUUUUUU";
    }
}
