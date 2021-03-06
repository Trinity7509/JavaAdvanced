package advancedJava.straemAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;

import java.util.List;
import java.util.OptionalDouble;

import java.util.stream.DoubleStream;

public class minEvenDouble {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        List<String> numbers=Arrays.asList(reader.readLine().split("\\s+"));

                 OptionalDouble min= numbers.stream()
                .filter(x -> !x.isEmpty())
                .mapToDouble(Double::parseDouble)
                .filter(x->x%2==0)
                .sorted()
                .findFirst();

             if(min.isPresent())
             {
                 System.out.printf("%.2f",min.getAsDouble());
             }
             else
             {
                 System.out.println("No match");
             }







    }


}
