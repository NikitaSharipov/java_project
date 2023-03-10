package Animals.Carnivorouses;

import Animals.Animal;
import Food.Food;
import Food.Meat;
import Food.WrongFoodException;

public class Carnivorous extends Animal {
    public Carnivorous(int satiety, String name, int size){
        super(satiety, name, size);
        this.setType("Carnivorous");
    }

    public void eat(Food food) {
        try {
            if (food instanceof Meat) {
                System.out.println("Eating meat");
                this.setSatiety(this.getSatiety() + food.getSatiety());
            } else {
                throw new WrongFoodException("WrongFood");
            }
        }
        catch (WrongFoodException ex) {
            System.out.println("Wrong type of food. Animal can not eat grass");
        }
    }
}
