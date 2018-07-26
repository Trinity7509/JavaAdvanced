package advancedJava.carSalesman;

public class Car {

    private static String NOT_AVAILABLE="n/a";
    private static int NOT_MENTIONED=-1;

    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine) {
        this(model,engine,NOT_MENTIONED,NOT_AVAILABLE);
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine,NOT_MENTIONED,color);
    }

    public Car(String model, Engine engine, int weight) {
        this(model,engine,weight,NOT_AVAILABLE);
    }

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String weight=this.weight==NOT_MENTIONED ?"n/a" :String.valueOf(this.weight);
        return String.format("%s:%n%s%n" +
                "Weight: %s%nColor: %s",this.model,this.engine.toString()
                ,weight,this.color);
    }
}
