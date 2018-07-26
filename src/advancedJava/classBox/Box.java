package advancedJava.classBox;

import java.text.DecimalFormat;

public class Box {

    private static final String NO_NEGATIVE_WIDTH="Width cannot be zero or negative. ";
    private static final String NO_NEGATIVE_HEIGHT="Height cannot be zero or negative. ";
    private static final String NO_NEGATIVE_LENGTH="Length cannot be zero or negative. ";

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getLength() {
        return length;
    }

    private void setLength(double length) throws IllegalArgumentException{
        {
            if(length<=0)
            {
                throw new IllegalArgumentException(NO_NEGATIVE_LENGTH);
            }
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    private void setWidth(double width) throws IllegalArgumentException{
        if(width<=0)
        {
            throw new IllegalArgumentException(NO_NEGATIVE_WIDTH);
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

   private void setHeight(double height) throws IllegalArgumentException{
        if(height<=0)
        {
            throw new IllegalArgumentException(NO_NEGATIVE_HEIGHT);
        }
        this.height = height;
    }
  private double getSurfaceArea()
    {
    double surfaceArea= ((2*length*width) + (2*length*height) + (2*width*height));
    return surfaceArea;
   }

   private double getLateralSurfaceArea()
   {
       double lateralSurfaceArea=((2*length*height) + (2*width*height));
       return lateralSurfaceArea;
   }

   private double getVolume()
   {
       double volume=length*width*height;
       return volume;
   }

    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("0.00");
        StringBuilder sb=new StringBuilder();
        sb.append("Surface Area - ").append(String.format("%s",df.format(this.getSurfaceArea())))
                .append(System.lineSeparator())
                .append("Lateral Surface Area - ").append(String.format("%s",df.format(this.getLateralSurfaceArea())))
                .append(System.lineSeparator())
                .append("Volume - ").append(String.format("%s",df.format(this.getVolume())));

        return sb.toString();
    }
}
