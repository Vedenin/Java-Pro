package lesson_ArrayList_JR;

public class Solution {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Mars");
        Cat cat2 = new Cat("Venera");
        Cat cat3 = new Cat("Neptun");
        Cat cat4 = new Cat("Saturn");

        Dog dog1 = new Dog("Kawtanka");
        Dog dog2 = new Dog("Bim");
        Dog dog3 = new Dog("Pluto");
        Dog dog4 = new Dog("Goofy");

        Rabbit rabbit1 = new Rabbit("Banny");
        Rabbit rabbit2 = new Rabbit("Rojer");

        Team<Cat> catTeam1 = new Team("Cats1");
        catTeam1.addNewRacer(cat1);
        catTeam1.addNewRacer(cat2);

        Team<Cat> catTeam2 = new Team("Cats2");
        catTeam2.addNewRacer(cat3);
        catTeam2.addNewRacer(cat4);

        Team<Dog> dogTeam1 = new Team("Dogs1");
        dogTeam1.addNewRacer(dog1);
        dogTeam1.addNewRacer(dog2);

        Team<Dog> dogTeam2 = new Team("Dogs1");
        dogTeam2.addNewRacer(dog3);
        dogTeam2.addNewRacer(dog4);

        Team<Rabbit> rabbitTeam = new Team("Rabbits1");
        rabbitTeam.addNewRacer(rabbit1);
        rabbitTeam.addNewRacer(rabbit2);

        catTeam1.run(catTeam2);
        catTeam2.run(catTeam1);

        dogTeam1.run(dogTeam2);

    }
}
