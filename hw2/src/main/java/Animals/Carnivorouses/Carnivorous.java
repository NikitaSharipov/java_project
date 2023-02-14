package Animals.Carnivorouses;

import Animals.Animal;
import Food.Food;
import Food.Meat;

public class Carnivorous extends Animal {
    public Carnivorous(int satiety){
        super(satiety);
    }

    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Eating meat");
        } else {
            System.out.println("Animal can not eat grass");
        }
    }
}
