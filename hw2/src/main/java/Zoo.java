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
        Lion lion = new Lion(5, "lion_name", Size.Big.count);
        Eagle eagle = new Eagle(5, "eagle_name", Size.Small.count);
        Shark shark = new Shark(5, "shark_name", Size.Medium.count);

        Cow cow = new Cow(5, "cow_name", Size.Medium.count);
        Deer deer = new Deer(5, "deer_name", Size.Medium.count);
        Duck duck = new Duck(5, "duck_name", Size.Tiny.count);

        Grass grass = new Grass(1, "Usual grass");
        Meat meat = new Meat(6, "Unusual meat");

        Worker worker = new Worker();

        worker.feed(lion, meat);
        worker.feed(lion, grass);
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

        Aviary сarnivorousAviary = new Aviary("Carnivorous", 3);
        System.out.println(cow.getType());

        сarnivorousAviary.addAnimal(cow);
        сarnivorousAviary.addAnimal(lion);
        сarnivorousAviary.addAnimal(eagle);

        сarnivorousAviary.typeAnimalsNamesInside();
        сarnivorousAviary.typeAnimalsInside("lion_name");

        сarnivorousAviary.deleteAnimal("lion_name");

        сarnivorousAviary.typeAnimalsNamesInside();
        сarnivorousAviary.typeAnimalsInside("lion_name");

//        AviarySize size = AviarySize.Big;
        System.out.println(cow.getSize());
    }
}
