import Animals.Carnivorouses.Eagle;
import Animals.Carnivorouses.Lion;
import Animals.Carnivorouses.Shark;
import Animals.Herbivoreses.Cow;
import Animals.Herbivoreses.Deer;
import Animals.Herbivoreses.Duck;
import Animals.Swim;
import Food.Grass;
import Food.Meat;
import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion(5);
        Eagle eagle = new Eagle(5);
        Shark shark = new Shark(5);

        Cow cow = new Cow(5);
        Deer deer = new Deer(5);
        Duck duck = new Duck(5);

        Grass grass = new Grass(1, "Usual grass");
        Meat meat = new Meat(6, "Unusual meat");

        Worker worker = new Worker();

        worker.feed(lion, meat);
        worker.feed(eagle, grass);
        worker.feed(deer, meat);
        worker.feed(duck, grass);

        worker.getVoice(cow);
        worker.getVoice(duck);

        ArrayList<Swim> lake = new ArrayList<Swim>();
        lake.add(shark);
        lake.add(duck);

        for(int i=0; i<lake.size(); i++) {
            lake.get(i).swim();
        }

        cow.run();
        System.out.println(cow.getSatiety());
    }
}
