package advancedJava.shoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new HashMap<>();
        try {
            addPeople(reader, people);
            addProducts(reader, products);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        for (String line = reader.readLine(); !line.equals("END"); line = reader.readLine()) {
            String[] tokens = line.split(" ");
            String personName = tokens[0];
            String productName = tokens[1];
            Person person = people.get(personName);
            Product product = products.get(productName);
            try {
                person.buy(product);
                System.out.printf("%s bought %s%n", personName, productName);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        for (Person person : people.values()) {
            System.out.println(person);
        }
    }

    private static void addProducts(BufferedReader reader, Map<String, Product> products) throws IOException {
        String[] productsData = reader.readLine().split(";");
        for (String productData : productsData) {
            String[] tokens = productData.split("=");
            String name = tokens[0];
            int cost = Integer.parseInt(tokens[1]);
            Product product = new Product(name, cost);
            products.put(product.getNameProduct(), product);
        }
    }

    private static void addPeople(BufferedReader reader, Map<String, Person> people) throws IOException {
        String[] peopleData = reader.readLine().split(";");
        for (String personData : peopleData) {
            String[] tokens = personData.split("=");
            String name = tokens[0];
            int money = Integer.parseInt(tokens[1]);
            Person person = new Person(name, money);
            people.put(person.getNamePerson(), person);
        }
    }

}
