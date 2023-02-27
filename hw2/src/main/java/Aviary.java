import Animals.Animal;

import java.util.HashSet;

public class Aviary <T extends Animal> {
    String type;
    private HashSet<T> animals = new HashSet<T>();

    public void typeAnimalsNamesInside() {
        System.out.println(animals);
    }

    public HashSet<T> getAnimals () {
        return animals;
    }
    Aviary(String type) {
        this.type = type;
    }

    public void addAnimal(Animal animal) {
        if (typeCheck(animal.getType())) {
            animals.add((T) animal);
        } else {
            System.out.println("We can not add this animal to Aviary because of wrong animal type");
        };
    }

    public void deleteAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void deleteAnimal(String name) {
        for (T animal : animals) {
            if (animal.getName().equals(name)) {
                animals.remove(animal);
            }
        }
    }

    private boolean typeCheck(String animalType) {
       return type.equals(animalType);
    }
}
