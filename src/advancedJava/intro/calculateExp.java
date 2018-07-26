package advancedJava.intro;

import java.util.Scanner;

public class calculateExp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String line=scanner.nextLine();
        String[] token=line.split("\\s+");

        double a=Double.parseDouble(token[0]);
        double b=Double.parseDouble(token[1]);
        double c=Double.parseDouble(token[2]);


        double sumPlus=((Math.pow(a,2)+Math.pow(b,2))/(Math.pow(a,2)-Math.pow(b,2)));
        double sumRootOne=(a+b+c)/Math.sqrt(c);
        double f1=Math.pow(sumPlus,sumRootOne);

        double f2=Math.pow((Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,3)),(a-b));
        double diff=Math.abs(((a+b+c)/3)-((f1+f2)/2));


        System.out.printf("F1 result: %.2f;",f1);
        System.out.printf(" F2 result: %.2f;",f2);
        System.out.printf(" Diff: %.2f",diff);


    }

    public static class charchterMultiplyer {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String first=scanner.next();
            String second=scanner.next();

            Integer minLenght=Math.min(first.length(),second.length());

            long result=0;
            for(int i=0;i<minLenght;i++)
            {
                result+=first.charAt(i)*second.charAt(i);

            }

            String longer="";

            if(first.length()>second.length())
            {
                longer=first;
            }
            else
            {
                longer=second;
            }
            for(int i=minLenght;i<longer.length();i++)
            {
                result+=longer.charAt(i);
            }
            System.out.printf("%d",result);
        }
    }

    public static class triangleArea {

        static void PrintArea(int aX, int aY,int bx, int bY,int cX,int cY)
        {
            int area= Math.abs((aX*(bY-cY)+bx*(cY-aY)+cX*(aY-bY))/2);
            System.out.println(area);
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int aX = scanner.nextInt();
            int aY = scanner.nextInt();
            scanner.nextLine();
            int bX = scanner.nextInt();
            int bY = scanner.nextInt();
            scanner.nextLine();
            int cX = scanner.nextInt();
            int cY = scanner.nextInt();
            scanner.nextLine();

            if((aX==bX&&bX==cX)||(aY==bY&&bY==cY) ){
                System.out.println("0");
            }
            else
            {
                PrintArea(aX,aY,bX,bY,cX,cY);
            }

        }
    }
}
