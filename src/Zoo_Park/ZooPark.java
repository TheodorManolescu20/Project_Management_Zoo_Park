package Zoo_Park;

import Zoo_Park.Animal.Animal;
import Zoo_Park.Bird.*;
import Zoo_Park.Employee.*;
import Zoo_Park.Fish.*;
import Zoo_Park.Insect.*;
import Zoo_Park.Mammal.*;
import Zoo_Park.Reptile.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ZooPark {
    public static void main(String[] args) {
        Bird bird = new Bird("owl", 27, 4, "Black", "owl1", 5);
        Fish fish = new Fish("crab", 36, 10, "littleCrab", 3, "grey");
        Insect insect = new Insect("Butterfly", 1, 1, "butterfly1", 1, "multicolour");
        Mammal mammal = new Mammal("Kangaroo", 190, 70, "Kangaroo1", 13, "brown");
        Reptile reptile = new Reptile("turtle", 10, 3, "turtle1", "grey", 3);
        Dove dove = new Dove("type1", 12, 3, "black", "dove1", 3, true);
        Duck duck = new Duck("type2", 15, 4, "black", "Duckyie", 5, true);
        Eagle eagle = new Eagle("Type3", 30, 12, "brown", "eagle", 4, 2);
        Owl owl = new Owl("type0", 20, 10, "black", "owl", 10, true);
        Parrot parrot = new Parrot("1", 20, 2, "red", "Parrot", 10, true);
        Bluefish bluefish = new Bluefish("type4", 15, 15, "Blue", 10, "blue", true);
        Crab crab = new Crab("type1", 20, 7, "Crabbie", 2, "grey", 0);
        Salmon salmon = new Salmon("type2", 10, 10, "Salmon", 10, "orange", true);
        Shark shark = new Shark("type3", 10, 8, "Shark", 3, "grey", 100);
        Tuna tuna = new Tuna("type5", 3, 3, "Tuna", 3, "black", false);
        Ant ant = new Ant("type1", 0, 0.3, "Ant", 4, "brown", true);
        Bee bee = new Bee("type2", 0, 0.2, "Bee", 3, "yellow", true);
        Butterfly butterfly= new Butterfly("type3", 3, 2, "Butterfly", 3, "multicolour", true);
        Ladybug ladybug = new Ladybug("1", 1, 2, "ladybug", 2, "red", 4);
        Mosquito mosquito = new Mosquito("2", 3, 0.5, "Mosquito", 3, "black", true);
        Cat cat = new Cat("2", 2, 3, "cat", 2, "grey", true);
        Dog dog = new Dog("2", 30, 20, "Dog", 3, "brown", true);
        Dolphin dolphin = new Dolphin("4", 20, 20, "Dolphin", 3, "grey", 10);
        Kangaroo kangaroo = new Kangaroo("1", 170, 10, "Kangaroo", 4, "brown", true);
        Whale whale = new Whale("2", 1000, 2000, "Whale", 12, "grey", true);
        Chameleon chameleon = new Chameleon("1", 12, 3, "Chameleon", "multi", 30, true);
        Crocodile crocodile = new Crocodile("1", 120, 80, "Crocodile", "green", 12, 4);
        Lizard lizard = new Lizard("1", 12, 10, "Lizard", "grey", 10, 4);
        Snake snake = new Snake("2", 12, 3, "Snake", "brown", 10, 0);
        Turtle turtle = new Turtle("2", 2, 3,"Turtle", "brown", 12, true);
        Cashier cashier = new Cashier("Marina", 25, 170, true);
        Janitor janitor = new Janitor("Marcel", 29, 180, true);
        Security security = new Security("Michael", 39, 100, true);
        Vet vet = new Vet("Ana", 40, 160, 20);

        ArrayList<Bird> birds = new ArrayList<>(Arrays.asList(dove, duck, eagle, owl, parrot));
        for (Bird item :birds)
        {
            item.beDangerous();

        }
        ArrayList<Fish> fishes = new ArrayList<>(Arrays.asList(bluefish, crab, salmon, shark, tuna));
        for (Fish item :fishes)
        {
            item.beDangerous();

        }
        ArrayList<Insect> insects = new ArrayList<>(Arrays.asList(ant, bee, butterfly, ladybug, mosquito));
        for (Insect item :insects)
        {
            item.beDangerous();

        }
        ArrayList<Mammal> mammals = new ArrayList<>(Arrays.asList(cat, dog, dolphin, kangaroo, whale));
        for (Mammal item :mammals)
        {
            item.beDangerous();

        }
        ArrayList<Reptile> reptiles = new ArrayList<>(Arrays.asList(crocodile, chameleon, lizard, snake, turtle));
        for (Reptile item :reptiles)
        {
            item.beDangerous();


        }
        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(cashier, janitor, security, vet));
        for (Employee item :employees)
        {
            item.work();
            item.workTogether();

        }
    }
}
