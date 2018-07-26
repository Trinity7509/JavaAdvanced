package advancedJava.pokemonTrainer;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<String, Trainer> trainerByName = new LinkedHashMap<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        getTrainers();

        getPokemonElement();

        print();
    }

    private static void getTrainers() {
        String command = scan.nextLine();
        while (!"Tournament".equals(command)) {
            String[] tokens = command.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            if (!trainerByName.containsKey(trainerName)) {
                Trainer trainer = new Trainer(trainerName);
                trainer.addPokemon(pokemon);
                trainerByName.put(trainerName, trainer);

            } else {
                Trainer trainer = trainerByName.get(trainerName);
                trainer.addPokemon(pokemon);
                trainerByName.put(trainerName, trainer);
            }


            command = scan.nextLine();
        }
    }

    private static void getPokemonElement() {
        String element = scan.nextLine();
        while (!"End".equals(element)) {
            checkPokemonsElement(element);
            element = scan.nextLine();
        }
    }

    private static void checkPokemonsElement(String element) {
        for (Trainer trainer : trainerByName.values()) {
            List<Pokemon> pokemons = trainer.getPokemons();

            boolean hasFound = false;
            for (Pokemon pokemon : pokemons) {
                if (pokemon.getElement().equals(element)) {
                    hasFound = true;
                    break;
                }
            }

            if (hasFound) {
                trainer.increaseBadges();
            } else {
                trainer.attackPokemons();
            }
        }
    }

    private static void print() {
        trainerByName.
                values()
                .stream()
                .sorted((t1, t2) -> Integer.compare(t2.getNumberOfBadges(), t1.getNumberOfBadges()))
                .forEach(System.out::println);
    }
}
