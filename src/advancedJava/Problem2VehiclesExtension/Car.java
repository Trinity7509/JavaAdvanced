package advancedJava.Problem2VehiclesExtension;

public class Car extends Vehicle {
    private static double INCREASE_FUEL_CONSUMPTION=0.9;

    protected Car(double fuelQuantity, double fuelConsumptionPerKilometer, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerKilometer, tankCapacity);
    }


    @Override
    protected void setFuelConsumptionPerKilometer(double fuelConsumptionPerKilometer)
    {
        super.setFuelConsumptionPerKilometer(fuelConsumptionPerKilometer+INCREASE_FUEL_CONSUMPTION);
    }
}
