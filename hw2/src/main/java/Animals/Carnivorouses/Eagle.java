package Animals.Carnivorouses;

import Animals.Fly;
import Animals.Voice;

public class Eagle extends Carnivorous implements Fly, Voice {
    int satiety;
    public Eagle(int satiety){
        super(satiety);
    }
    public void fly() {
        System.out.println("Eagle is flying");
        this.satiety -= 1;
    }

    public String voice() {
        this.satiety -= 1;
        return "Arrrrrrrr";
    }
}
