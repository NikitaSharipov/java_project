import Animals.Animal;
import Animals.Voice;
import Food.Food;
public class Worker {
    void feed(Animal animal, Food food) {
        animal.eat(food);
        System.out.println("Animal get " + food.getSatiety() + " satiety from food named: " + food.getTitle());
    }

    void getVoice(Voice animal) {
        System.out.println(animal.voice());
    }
}
