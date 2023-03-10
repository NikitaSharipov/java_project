package Food;

public class Meat extends Food{
    public Meat(int satiety, String title){

        this.satiety = satiety;
        this.title = title;
    }

    public int getSatiety() {
        return satiety;
    }
}
