package advancedJava.google;

import javafx.scene.web.HTMLEditorSkin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
      HashMap<String,Person> people=new HashMap<>();
          //List<Person> people=new ArrayList<>();
        String line=reader.readLine();

        while(!"End".equalsIgnoreCase(line))
        {
            String[]input=line.split("\\s+");

            //for(int i=0;i<input.length;i++) {


                String name = input[0];
                String command = input[1];
               Person person=null;

if(!people.containsKey(name))
{
    person=new Person(name);
}
else
{
    person=people.get(name);
}
                switch (command) {
                    case"company":
                        String companyName=input[2];
                        String departmentName=input[3];
                        double salary=Double.valueOf(input[4]);
                        Company company=new Company(companyName,departmentName,salary);
                        //person=new Person(name,company);
                        person.setCompany(company);
                        break;
                    case"pokemon":
                        String pokemonName=input[2];
                        String pokemonType=input[3];
                        Pokemon pokemon=new Pokemon(pokemonName,pokemonType);
                        //person=new Person(name,pokemon);
                        person.setPokemon(pokemon);
                        break;
                    case"parents":
                        String parentsName=input[2];
                        String parentsBirthday=input[3];
                        Parents parents=new Parents(parentsName,parentsBirthday);
                        //person=new Person(name,parents);
                        person.setParent(parents);
                        break;
                    case"children":
                        String kidsName=input[2];
                        String kidsBirthday=input[3];
                        Children children=new Children(kidsName,kidsBirthday);
                       //person=new Person(name,children);
                        person.setChild(children);
                        break;
                    case"car":
                        String carModel=input[2];
                        int carSpeed=Integer.parseInt(input[3]);
                        Car car=new Car(carModel,carSpeed);
                        //person=new Person(name,car);
                        person.setCar(car);
                        break;
                }
               // people.add(person);

                people.put(name,person);
            //}

            line = reader.readLine();
        }
       String searchedName=reader.readLine();
        Person person=people.get(searchedName);
        System.out.println(person);


        //System.out.println("Company:");
        //if(person.getCompany()!=null)
        {
            //System.out.println(person.getCompany());
        }
        //System.out.println("Car:");
        //if(person.getCar()!=null)
        {
            //System.out.println(person.getCar());
        }
        //System.out.println("Pokemon:");
       // if(person.getPokemon().size()>0)
        {
           // for (Pokemon pokemon:person.getPokemon()) {
                //System.out.println(pokemon);
            }
        }
        //System.out.println("Parents:");
        //if(person.getParent().size()>0)
        {
            //for (Parents parent:person.getParent())
            {
                //System.out.println(parent);
            }
        }
        //System.out.println("Children:");
        //if(person.getChild().size()>0)
        {
            //for (Children child:
                 //person.getChild()) {
                //System.out.println(child);

            }
        }

    //}
//}
