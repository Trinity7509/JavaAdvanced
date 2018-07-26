package advancedJava.pokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int numberOfBadges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.setName(name);
        this.setPokemons(new ArrayList<>());
        this.setNumberOfBadges(0);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    private void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
    public void increaseBadges() {
        this.setNumberOfBadges(this.getNumberOfBadges() + 1);
    }
    public void addPokemon(Pokemon pokemon) {
        this.getPokemons().add(pokemon);
    }
    public void attackPokemons() {
        List<Pokemon> attackedPokemons = new ArrayList<>();
        for (Pokemon pokemon : this.getPokemons()) {
            pokemon.attackPokemon();

            if (pokemon.getHealth() > 0) {
                attackedPokemons.add(pokemon);
            }
        }

        this.setPokemons(attackedPokemons);
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getNumberOfBadges() + " " + this.getPokemons().size();
    }
}
