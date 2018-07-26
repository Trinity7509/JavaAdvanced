package advancedJava.Ferrari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException, IllegalClassFormatException {

        Class[] ferrariInterfaces = Ferrari.class.getInterfaces();

        if (Arrays.asList(ferrariInterfaces).contains(Car.class)) {
            Method[] fields = Car.class.getDeclaredMethods();

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String name=reader.readLine();
            Car car =new Ferrari(name);



            System.out.printf("%s/%s/%s/%s",car.getModel(),car.pushGas(),car.gasPedal(),car.getNameDriver());



        }
    }
}
