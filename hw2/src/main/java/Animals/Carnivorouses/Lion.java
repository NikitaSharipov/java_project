package Animals.Carnivorouses;

import Animals.Animal;
import Animals.Voice;
import Animals.Run;

public class Lion extends Carnivorous implements Voice,Run {
    public Lion(int satiety){
        super(satiety);
    }
    public void run() {
        this.setSatiety(this.getSatiety() - 1);
        System.out.println("lion is running");
    }

    public String voice() {
        this.setSatiety(this.getSatiety() - 1);
        return "RRRRRRR";
    }
}
