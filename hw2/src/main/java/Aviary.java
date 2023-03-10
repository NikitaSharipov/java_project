import Animals.Animal;

import java.util.HashSet;

public class Aviary <T extends Animal> {
    String type;
    private int size;
    private HashSet<T> animals = new HashSet<T>();

    Aviary(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public void typeAnimalsInside(String name) {
        for (T animal : animals) {
            if (animal.getName().equals(name)) {
                System.out.println(animal);
            } else {
                System.out.println("There is no animal with this name");
            }
        }
    }

    public void typeAnimalsNamesInside() {
        for (T animal : animals) {
            System.out.println(animal.getName());
        }
    }

    public HashSet<T> getAnimals () {
        return animals;
    }

    public void addAnimal(T animal) {
        if (typeCheck(animal.getType())) {
            if (sizeCheck(animal.getSize())) {
                animals.add((T) animal);
                System.out.println("Animal has been added");
            } else {
                System.out.println("We can not add this animal to Aviary because of wrong animal size");
            }
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

    private boolean sizeCheck(int animalSize) {
        if (animalSize <= this.size) {
            return true;
        } else {
            return false;
        }
    }
}
