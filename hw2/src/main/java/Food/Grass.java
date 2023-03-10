package Food;

public class Grass extends Food{
    public Grass(int satiety, String title){
        this.satiety = satiety;
        this.title = title;
    }

    public int getSatiety() {
        return satiety;
    }
}
