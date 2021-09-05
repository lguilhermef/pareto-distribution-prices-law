package main.java.org.javaprojects.paretodistributionpriceslaw;

public class World {


    private Person[] population;
    private int WORLD_POPULATION = 10;
    private Playable game;

    public World() {
        this.population = new Person[WORLD_POPULATION];
        this.game = new ParetoDistribution(population);
        this.populateWorld();
    }

    public void startSimulation() {
        this.game.startGame();
    }

    private void populateWorld () {

        for(int i = 0; i < this.population.length; i++) {
            this.population[i] = new Person(10, "Person " + i);
        }
    }
}
