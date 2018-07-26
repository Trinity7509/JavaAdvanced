package advancedJava.Problem2VehiclesExtension;

public class Truck extends Vehicle {
    private static double INCREASE_FUEL_CONSUMPTION=1.6;
    private static double INCREASE_FUEL_QUANTITY=0.95;

    protected Truck(double fuelQuantity, double fuelConsumptionPerKilometer, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerKilometer, tankCapacity);
    }


    @Override
    protected void setFuelConsumptionPerKilometer(double fuelConsumptionPerKilometer)
    {
        super.setFuelConsumptionPerKilometer(fuelConsumptionPerKilometer+INCREASE_FUEL_CONSUMPTION);
    }

    @Override
    public void refuel(double fuelQuantity)
    {
        super.refuel(fuelQuantity*INCREASE_FUEL_QUANTITY);
    }
}
