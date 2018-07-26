package animalFarm;

import java.text.DecimalFormat;

public class Chicken {
    private final String NO_NAME="Name cannot be empty.";
    private final String NO_AGE="Age should be between 0 and 15.";

    private String chickenName;
    private int chickenAge;

    private static double chickenLifeExp=15;
    //private static double daysPerYear=365;

    public Chicken(String chickenName, int chickenAge) {
        this.setChickenName(chickenName);
        this.setChickenAge(chickenAge);
    }

    public String getChickenName() {
        return chickenName;
    }

    private void setChickenName(String chickenName) throws IllegalArgumentException {
        if((chickenName.equalsIgnoreCase(""))
                ||chickenName.length()<1||chickenName.equalsIgnoreCase(" "))

        {
            throw new IllegalArgumentException(NO_NAME);
        }
        this.chickenName = chickenName;
    }

    public int getChickenAge() {
        return chickenAge;
    }

    private void setChickenAge(int chickenAge) throws IllegalArgumentException {
        if(chickenAge<0||chickenAge>chickenLifeExp)
        {
            throw new IllegalArgumentException(NO_AGE);
        }
        this.chickenAge = chickenAge;
    }

    private double getProductPerDay()
    {
        double productPerDay=0;
        if(chickenAge<6)
        {
            productPerDay=2;
            //return productPerDay;
        }
        else if((chickenAge>=6)&& (chickenAge<=11))
        {
           productPerDay=1;
        }
        else if((chickenAge>11)&&(chickenAge<chickenLifeExp))
        {
            productPerDay=0.75;
        }
        return productPerDay;
    }



    @Override
    public String toString() {
        DecimalFormat dfOne=new DecimalFormat("#.##");
        StringBuilder sb=new StringBuilder();
        sb.append("Chicken ").append(this.getChickenName())
                .append(String.format(" (age %d) ",this.getChickenAge()))
                .append(String.format("can produce %s eggs per day.",dfOne.format(this.getProductPerDay())));

        return sb.toString();
    }
}
