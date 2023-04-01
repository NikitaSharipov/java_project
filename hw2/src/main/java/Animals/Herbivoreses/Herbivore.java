package Animals.Herbivoreses;

import Animals.Animal;
import Food.Food;
import Food.Grass;

public class Herbivore extends Animal {

    public Herbivore(int satiety){
        super(satiety);
    }
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Eating grass");
        } else {
            System.out.println("Animal can not eat meat");
        }
    }
}
