package advancedJava.Problem2VehiclesExtension;

public abstract class Vehicle {
    private static String NO_FUEL="Fuel must be a positive number";
    private static String OVERFILLED="Cannot fit fuel in tank";

    private double fuelQuantity;
    private double fuelConsumptionPerKilometer;
    private double tankCapacity;

    protected Vehicle(double fuelQuantity, double fuelConsumptionPerKilometer, double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumptionPerKilometer(fuelConsumptionPerKilometer);
        this.setTankCapacity(tankCapacity);
    }


    protected void setFuelQuantity(double fuelQuantity) throws IllegalArgumentException{
        if(fuelQuantity<=0)
        {
            throw new IllegalArgumentException(NO_FUEL);
        }

        this.fuelQuantity = fuelQuantity;
    }



    protected void setFuelConsumptionPerKilometer(double fuelConsumptionPerKilometer) {
        this.fuelConsumptionPerKilometer =
                fuelConsumptionPerKilometer;
    }
    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
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
        if(fuelQuantity>tankCapacity)
        {
            throw new IllegalArgumentException(OVERFILLED);

        }
         else
        {
            this.fuelQuantity+=fuelQuantity;
        }


    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(String.format("%s: %.2f",this.getClass().getSimpleName(),
                this.fuelQuantity)).append(System.lineSeparator());
        return sb.toString();
    }
}
