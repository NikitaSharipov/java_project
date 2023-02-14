package Animals;

import Food.Food;

public abstract class Animal {
    private int satiety;

    public Animal(int satiety){
        this.satiety = satiety;
    }
    public void eat (Food food) {
        this.satiety += food.getSatiety();
    }
    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety =  satiety;
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
