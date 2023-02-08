package Animals.Carnivorouses;

import Animals.Animal;
import Animals.Voice;
import Animals.Run;

public class Lion extends Carnivorous implements Voice,Run {
    int satiety;
    public Lion(int satiety){
        super(satiety);
    }
    public void run() {
        this.satiety -= 1;
        System.out.println("lion is running");
    }

    public String voice() {
        this.satiety -= 1;
        return "RRRRRRR";
    }
}
