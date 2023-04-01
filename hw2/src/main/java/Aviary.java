import Animals.Animal;

import java.util.HashSet;

public class Aviary <T extends Animal> {
    private int size;
    private HashSet<T> animals = new HashSet<T>();

    Aviary(int size) {
        this.size = size;
    }

    public void AnimalsInside(String name) {
        for (T animal : animals) {
            if (animal.getName().equals(name)) {
                System.out.println(animal);
            } else {
                System.out.println("There is no animal with this name");
            }
        }
    }

    public void AnimalNamesInside() {
        for (T animal : animals) {
            System.out.println(animal.getName());
        }
    }

    public HashSet<T> getAnimals () {
        return animals;
    }

    public void addAnimal(T animal) {
        if (animal.getSize() <= this.size) {
            animals.add(animal);
            System.out.println("Animal has been added");
        } else {
            System.out.println("We can not add this animal to Aviary because of wrong animal size");
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
}
