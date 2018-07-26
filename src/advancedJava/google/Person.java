package advancedJava.google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private List<Pokemon> pokemon;
    private List<Parents> parent;
    private List<Children> child;
    private Car car;

    public Person(String name) {
        this.name = name;

        this.pokemon = new ArrayList<>();
        this.parent = new ArrayList<>();
        this.child = new ArrayList<>();

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public boolean setPokemon(Pokemon pokemon) {
        return this.getPokemon().add(pokemon);
    }

    public List<Parents> getParent() {
        return parent;
    }

    public boolean setParent(Parents parent) {
        return this.getParent().add(parent);
    }

    public List<Children> getChild() {
        return child;
    }

    public boolean setChild(Children child) {
       return this.getChild().add(child);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name)
                .append(System.lineSeparator());

                sb.append("Company:")
                .append(System.lineSeparator());
        if (this.company != null) {
            sb.append(this.company).append(System.lineSeparator());
        }
       sb.append("Car:").append(System.lineSeparator());
        if (this.car != null) {
            sb.append(this.car).append(System.lineSeparator());
        }
        sb.append("Pokemon:").append(System.lineSeparator());
        for (Pokemon pokemon : this.pokemon) {
            sb.append(pokemon).append(System.lineSeparator());
        }
        sb.append("Parents:").append(System.lineSeparator());
        for (Parents parent : this.parent) {
            sb.append(parent).append(System.lineSeparator());
        }
        sb.append("Children:").append(System.lineSeparator());
        for (Children child : this.child) {
            sb.append(child).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
