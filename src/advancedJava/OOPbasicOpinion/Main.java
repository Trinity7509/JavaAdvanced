package advancedJava.OOPbasicOpinion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//Class<Person> personClass=Person.class;
        //Constructor nameAgeCtor = personClass
        //.getDeclaredConstructor(String.class,int.class);


        int n = Integer.parseInt(reader.readLine());
        ArrayList<Person> personsN = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = reader.readLine();

            String[] persons = line.split("\\s+");
            String name = persons[0];
            int age = Integer.valueOf(persons[1]);
         Person person=new Person(name,age);
         personsN.add(person);

            //System.out.printf("%s - %s%n",pN, personsNEW.get(pN));

        }

        personsN.stream().filter(p->p.getAge()>30).sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
        }

        }








