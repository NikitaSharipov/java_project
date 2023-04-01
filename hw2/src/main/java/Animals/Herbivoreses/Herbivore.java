package Animals.Herbivoreses;

import Animals.Animal;
import Food.Food;
import Food.Grass;
import Food.WrongFoodException;

public class Herbivore extends Animal {
    private int satiety;

    public Herbivore(int satiety, String name, int size){
        super(satiety, name, size);
        this.setType("Herbivore");
    }
    public void eat(Food food) {
        try {
            if (food instanceof Grass) {
                System.out.println("Eating grass");
                this.setSatiety(this.getSatiety() + food.getSatiety());
            } else {
                throw new WrongFoodException("WrongFood");
            }
        }
        catch (WrongFoodException ex) {
            System.out.println("ERROR" + ex.toString());
        }
    }

    public int getSatiety() {
        return satiety;
    }
}
