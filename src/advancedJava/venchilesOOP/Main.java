package advancedJava.venchilesOOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));



        String[] carDetails=reader.readLine().split("\\s+");
        String typeVehicle=carDetails[0];

       String[] trackDetails=reader.readLine().split("\\s+");
     String typeVehicleTwo=trackDetails[0];

     Vehicle car=new Car(Double.parseDouble(carDetails[1]),Double.parseDouble(carDetails[2]));
     Vehicle truck =new Truck(Double.parseDouble(trackDetails[1]),Double.parseDouble(trackDetails[2]));

       Map<String,Vehicle> vehicles=new LinkedHashMap<>();

        vehicles.put(typeVehicle,car);
        vehicles.put(typeVehicleTwo,truck);

        int countCommands=Integer.parseInt(reader.readLine());

        while(countCommands-->0)
        {

            String[]command=reader.readLine().split("\\s+");
            String typeCommand=command[0];
            String vehicleType=command[1];
            Double distance=Double.parseDouble(command[2]);
            switch(typeCommand)
            {
                case"Drive":
                    boolean IsTraveled=vehicles.get(vehicleType).drive(distance);
                    if(IsTraveled)
                    {
                        DecimalFormat df=new DecimalFormat("#.##");
                        System.out.printf("%s travelled %s km%n",
                                vehicleType,df.format(distance));


                    }
                    else
                    {
                        System.out.printf("%s needs refueling%n",vehicleType);
                    }
                    break;
                case"Refuel":
                    vehicles.get(vehicleType).refuel(distance);
                    break;


            }






        }
        vehicles.values().forEach(vehicle-> System.out.print(vehicle));

        
    }
}
