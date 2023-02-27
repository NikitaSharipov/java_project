package Animals.Carnivorouses;

import Animals.Animal;
import Food.Food;
import Food.Meat;

public class Carnivorous extends Animal {
    public Carnivorous(int satiety, String name){
        super(satiety, name);
        this.setType("Carnivorous");
    }

    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Eating meat");
        } else {
            System.out.println("Animal can not eat grass");
        }
    }
}
