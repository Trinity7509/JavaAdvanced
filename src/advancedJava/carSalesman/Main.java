package advancedJava.carSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Character.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<Car> carNew = new ArrayList<>();

        Map<String, Engine> engineNEW = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String[] engines = reader.readLine().split("\\s+");
            Engine engine = null;

            String engineModel = engines[0];
            int enginePower = Integer.parseInt(engines[1]);
            if (engines.length == 2) {
                engine = new Engine(engineModel, enginePower);
            } else if (engines.length == 3) {
                if (Character.isDigit(engines[2].charAt(0))) {
                    int engineDisplacement = Integer.parseInt(engines[2]);
                    engine = new Engine(engineModel, enginePower, engineDisplacement);
                } else {
                    String engineEfficiency = engines[2];
                    engine = new Engine(engineModel, enginePower, engineEfficiency);
                }
            } else if (engines.length == 4) {
                int engineDisplacement = Integer.parseInt(engines[2]);
                String engineEfficiency = engines[3];
                engine = new Engine(engineModel, enginePower, engineDisplacement, engineEfficiency);
            }
            engineNEW.put(engineModel, engine);
        }


        int m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < m; i++) {
            String[] cars = reader.readLine().split("\\s+");
            Car car=null;

            String carModel = cars[0];

            Engine engine = engineNEW.get(cars[1]);

            if (cars.length == 2) {
                 car = new Car(carModel, engine);
            } else if (cars.length == 4) {
                int carWeight = Integer.parseInt(cars[2]);
                String carColor = cars[3];
                 car = new Car(carModel, engine, carWeight, carColor);

            } else if (cars.length == 3 && Character.isDigit(cars[2].charAt(0))) {


                int carWeight = Integer.parseInt(cars[2]);
                 car = new Car(carModel, engine, carWeight);
            } else if (cars.length == 3 && !Character.isDigit(cars[2].charAt(0))) {
                String carColor = cars[2];
                 car = new Car(carModel, engine, carColor);
            }

            carNew.add(car);
        }


        StringBuilder sb = new StringBuilder();
        for (Car car : carNew
                ) {
            sb.append(car).append(System.lineSeparator());


        }
        System.out.println(sb);
    }
}

