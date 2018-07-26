package advancedJava.OOPBasicDefineCl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        Class<Person> personClass = Person.class;
        Constructor<Person> emptyCtor = personClass.getDeclaredConstructor();
        Constructor<Person> ageCtor = personClass.getDeclaredConstructor(int.class);
        Constructor<Person> nameAgeCtor = personClass
                .getDeclaredConstructor(String.class, int.class);

        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        Person basePerson = emptyCtor.newInstance();
        Person personWithAge = ageCtor.newInstance(age);
        Person personFull = nameAgeCtor.newInstance(name, age);

        System.out.printf("%s %s%n", basePerson.getName(), basePerson.getAge());
        System.out.printf("%s %s%n", personWithAge.getName(), personWithAge.getAge());
        System.out.printf("%s %s%n", personFull.getName(), personFull.getAge());
    }


}
