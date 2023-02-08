package Animals;

import Food.Food;

public class Animal {
    int satiety;

    public Animal(int satiety){
        this.satiety = satiety;
    }
    public void eat (Food food) {
    }
    public int getSatiety() {
        return satiety;
    }

    private

    boolean satietyCheck() {
        if(this.satiety>0) {
            return true;
        }else{
            return false;
        }
    }
}
