package lesson_ArrayList_JR;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Racer & Moveable> {
    private String name;
    private List<T> racers = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewRacer(T racer) {
        racers.add(racer);
        System.out.println("New racer " + ((Racer)racer).getName() +
                " has been added to the team " + name);
    }

    public void run(Team<T> team) { // == (Team<? extends Racer> team)
        String winner;
        Random random = new Random();
        int i = random.nextInt(2);
        if(i == 0) {
            winner = this.name;
        } else {
            winner = team.name;
        }
        System.out.println("The winner is " + winner);
    }
}
