package basicJava;

import java.util.Scanner;

public class izpit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weightKG = Double.parseDouble(scanner.nextLine());
        String terms = scanner.nextLine();
        double leghtKM = Double.parseDouble(scanner.nextLine());

        double price =0;
        double costad =0;
        double costw =0;
        double costl =0;

        if(terms.equals("standard")) {
            if ((weightKG < 1)&&(weightKG>0)) {
                price = leghtKM * 0.03;
            } else if ((weightKG > 1) && (weightKG < 10)) {
                price = leghtKM * 0.05;
            } else if ((weightKG > 11) && (weightKG < 40)) {
                price = leghtKM * 0.1;
            } else if ((weightKG > 41) && (weightKG < 90)) {
                price = leghtKM * 0.15;
            } else if ((weightKG > 91) && (weightKG < 150)) {
                price = leghtKM * 0.2;
            }
        }else if(terms.equals("express")) {
            if ((weightKG < 1)&&(weightKG>0)) {
                costad=(0.03*8)/100;
                costw =weightKG*costad;
                costl =costw*leghtKM;
                price = (leghtKM * 0.03) + costl;
            } else if ((weightKG > 1) && (weightKG < 10)) {
                costad=(0.05*4)/100;
                costw =weightKG*costad;
                costl =costw*leghtKM;
                price = (leghtKM * 0.05) + costl;
            } else if ((weightKG > 11) && (weightKG < 40)) {
                costad=(0.1*5)/100;
                costw =weightKG*costad;
                costl =costw*leghtKM;
                price = (leghtKM * 0.1) + costl;
           } else if ((weightKG > 41) && (weightKG < 90)) {
                costad=(0.15*2)/100;
                costw =weightKG*costad;
                costl =costw*leghtKM;
                price = (leghtKM * 0.15) + costl;
            } else if ((weightKG > 91) && (weightKG < 150)) {
                costad=(0.2*1)/100;
                costw =weightKG*costad;
                costl =costw*leghtKM;
                price = (leghtKM * 0.2) + costl;
            }
        }
            System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",weightKG,price);
                }
            }













