import Animals.Animal;
import Animals.Voice;
import Food.Food;
public class Worker {
    void feed(Animal animal, Food food) {
        animal.eat(food);
    }

    void getVoice(Voice animal) {
        if (animal instanceof Voice) {
            System.out.println(animal.voice());
        } else {
            System.out.println("Animal do not have voice ");
        }
    }
}
