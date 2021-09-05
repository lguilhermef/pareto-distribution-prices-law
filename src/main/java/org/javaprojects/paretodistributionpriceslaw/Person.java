package main.java.org.javaprojects.paretodistributionpriceslaw;

public class Person {

    private int resource;
    private String name;

    public Person (int money, String name) {

        this.resource = money;
        this.name = name;
    }

    public int getResource() {
        return resource;
    }

    public String getName() {
        return name;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public void setName(String name) {
        this.name = name;
    }
}
