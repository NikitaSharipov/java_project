package model;
public class Kotic {
    int prettiness;
    String name;
    int weight;
    String meow;
    int satiety;
    public static int count = 0;

    public Kotic(int prettiness, String name, int weight, String meow, int satiety){
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.satiety = satiety;
        count++;
    }

    public Kotic(){
    }

    public void setKotic(int prettiness, String name, int weight, String meow, int satiety) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.satiety = satiety;
    }

    public void liveAnotherDay() {
        for(int i=0; i<25; i++) {
            int n = (int) (Math.random() * 5 + 1);
            switch (n) {
                case 1:
                    eat(3);
                    break;
                case 2:
                    sleep();
                    break;
                case 3:
                    chaseMouse();
                    break;
                case 4:
                    jump();
                    break;
                case 5:
                    play();
                    break;
            }
        }
    }

    public int getPrettiness() {
        return prettiness;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
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

    void eat(int satietyCount) {
        this.satiety += satietyCount;
        System.out.println("The Cat is eating");
    }

    void eat(int satietyCount, String foodName) {
        this.satiety += satietyCount;
        System.out.println("The Cat is eating");
    }

    void eat() {
        eat(3,"pizza");
    }

    boolean play() {
        if (satietyCheck() == true) {
            System.out.println("The Cat is playing");
            return true;
        }
        else {
            System.out.println("The cat can\'t play until he eat.");
            return false;
        }
    }

    boolean sleep() {
        if (satietyCheck() == true) {
            System.out.println("The Cat is sleeping");
            return true;
        }
        else {
            System.out.println("The cat can\'t sleep until he eat.");
            return false;
        }
    }

    boolean chaseMouse() {
        if (satietyCheck() == true) {
            System.out.println("The Cat is chasing a mouse");
            return true;
        }
        else {
            System.out.println("The cat can\'t chase until he eat.");
            return false;
        }
    }

    boolean jump() {
        if (satietyCheck() == true) {
            System.out.println("The Cat is jumping");
            return true;
        }
        else {
            System.out.println("The cat can\'t jump until he eat.");
            return false;
        }
    }
}
