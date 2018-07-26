package advancedJava.venchilesOOP;

public class Car extends Vehicle {

   private static double INCREASE_FUEL_CONSUMPTION=0.9;

   public Car(double fuelQuantity, double fuelConsumptionPerKilometer) {
      super(fuelQuantity, fuelConsumptionPerKilometer);
   }

    @Override
    protected void setFuelConsumptionPerKilometer(double fuelConsumptionPerKilometer)
    {
        super.setFuelConsumptionPerKilometer(fuelConsumptionPerKilometer+INCREASE_FUEL_CONSUMPTION);
    }
}


