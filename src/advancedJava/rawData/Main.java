package advancedJava.rawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(reader.readLine());

        List<Car> cars =new ArrayList<>();



        for(int i=0;i<n;i++)
        {
            String[] namedCars=reader.readLine().split("\\s+");
            //Car car =new Car(model,cargo,tire);
            String model=namedCars[0];
            int engineSpeed=Integer.parseInt(namedCars[1]);
            int enginePower=Integer.parseInt(namedCars[2]);
                    Engine engine=new Engine(engineSpeed,enginePower);
                    int cargoWeight=Integer.parseInt(namedCars[3]);
                    String cargoType=namedCars[4];
                    Cargo cargo=new Cargo(cargoWeight,cargoType);
                    Tire[] tires=new Tire[4];
                    int index=0;
                    for(int j=5;j<namedCars.length;j+=2)
                    {
                        double tiresPressure=Double.parseDouble(namedCars[j]);
                        int tiresAge=Integer.parseInt(namedCars[j+1]);
                        Tire tire=new Tire(tiresPressure,tiresAge);
                        tires[index++]=tire;

                    }

             Car car=new Car(model,engine,cargo,tires);
             cars.add(car);
        }

        String command= reader.readLine();


        cars.stream()
                .filter(c->c.getCargo().getType().equalsIgnoreCase(command))
                .filter(c->
                {
                    if("fragile".equalsIgnoreCase(command))
                    {
                        return Arrays.stream(c.getTires()).anyMatch(t->t.getPressure()<1);
                    }else
                    {
                        return c.getEngine().getPower()>250;
                    }

    })
.forEach(car->System.out.println(car.getModel()));


    }
}
