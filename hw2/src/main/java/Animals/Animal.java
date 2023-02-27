package Animals;

import Food.Food;

public abstract class Animal {
    private int satiety;
    private String name;
    private String type;

    public Animal(int satiety, String name){
        this.satiety = satiety;
        this.name = name;
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
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type =  type;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =  name;
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
