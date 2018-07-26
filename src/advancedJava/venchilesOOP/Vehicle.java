package advancedJava.venchilesOOP;

import java.text.DecimalFormat;

public abstract class Vehicle {



    private double fuelQuantity;
    private double fuelConsumptionPerKilometer;

    protected Vehicle(double fuelQuantity, double fuelConsumptionPerKilometer) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumptionPerKilometer(fuelConsumptionPerKilometer);


    }

    protected void setFuelQuantity(double fuelQuantity) {

        this.fuelQuantity = fuelQuantity;
    }



    protected void setFuelConsumptionPerKilometer(double fuelConsumptionPerKilometer) {
        this.fuelConsumptionPerKilometer =
              fuelConsumptionPerKilometer;
    }



    public boolean drive(double distance)
    {
        double maxDriveDistance=fuelQuantity/fuelConsumptionPerKilometer;
        if(maxDriveDistance>distance)
        {

            this.fuelQuantity-=distance*fuelConsumptionPerKilometer;
            return true;
        }
        else
        {

            return false;
        }

    }


    public void refuel(double fuelQuantity)
    {
        this.fuelQuantity+=fuelQuantity;

    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(String.format("%s: %.2f",this.getClass().getSimpleName(),
                this.fuelQuantity)).append(System.lineSeparator());
        return sb.toString();
    }
}
