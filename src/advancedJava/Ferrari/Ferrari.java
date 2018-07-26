package advancedJava.Ferrari;

public  class Ferrari implements Car{

    private  String model;
    private String nameDriver;

    public Ferrari(String nameDriver) {
        this.model = "488-Spider";
        this.nameDriver = nameDriver;
    }

    @Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        this.nameDriver = nameDriver;
    }
    @Override
    public String pushGas()
    {
        return "Brakes!";
    }

    @Override
    public String gasPedal()
    {
        return "Zadu6avam sA!";
    }



}
