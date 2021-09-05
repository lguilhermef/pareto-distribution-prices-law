package main.java.org.javaprojects.paretodistributionpriceslaw;

import main.java.org.javaprojects.paretodistributionpriceslaw.utils.Randomizer;

public class ParetoDistribution implements Playable {

    private Person[] people;

    public ParetoDistribution (Person[] people) {
        this.people = people;
    }

    public void startGame() {

        while(!isGameOver()) {

            Person personA = this.getRandomPerson();
            Person personB  = this.getRandomPerson();


            if (personA == personB) {
                continue;
            }
            System.out.println(personA.getResource());
            System.out.println(personB.getResource());

            this.trade(personA, personB);
        }
    }

    public void trade(Person personA, Person personB) {
        boolean isTails = Randomizer.headOrTails();

        if (isTails) {
            personA.setResource(personA.getResource() - 1);
            personB.setResource(personB.getResource() + 1);

        } else {
            personA.setResource(personA.getResource() + 1);
            personB.setResource(personB.getResource() - 1);
        }
    }

    public Person getRandomPerson() {

        Person randomPerson = this.people[Randomizer.getRandomNumberWithinRange(0, this.people.length - 1)];
        return randomPerson.getResource() >= 0 ? randomPerson : getRandomPerson();
    }

    public boolean isGameOver() {

        for(Person p : people) {
            if(p.getResource() == 0) {
                return false;
            }
        }

        return false;
    }
}
