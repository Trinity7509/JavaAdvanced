package advancedJava.carSalesman;

public class Engine {

    private static String NOT_AVAILABLE="n/a";
    private static int NOT_MENTIONED=-1;

    private String modelEngine;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String modelEngine, int power, String efficiency) {
        this(modelEngine,power,NOT_MENTIONED,efficiency);
    }

    public Engine(String modelEngine, int power, int displacement) {
        this(modelEngine,power,displacement,NOT_AVAILABLE);
    }
    public Engine(String modelEngine,int power) {
        this(modelEngine,power,NOT_MENTIONED);
    }

    public Engine(String modelEngine, int power, int displacement, String efficiency) {
        this.modelEngine = modelEngine;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModelEngine() {
        return modelEngine;
    }

    public void setModelEngine(String modelEngine) {
        this.modelEngine = modelEngine;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        String displacement=this.displacement==NOT_MENTIONED ?"n/a": String.valueOf(this.displacement);
        return String.format("%s: \n" +"Power: %d\n" +
                "Displacement: %s\n" +
                "Efficiency: %s",
                this.modelEngine,this.power,displacement,this.efficiency);
    }
}
