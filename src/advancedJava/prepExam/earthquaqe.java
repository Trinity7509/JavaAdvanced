package advancedJava.prepExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;


public class earthquaqe {
    public static void main(String[] args) throws IOException {
        // the name of the task is Second nature and is part of the exam on 28th of Aug

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       ArrayDeque<Integer> flowers= new ArrayDeque<>();

       String[] f=reader.readLine().split(" ");

        for (String i:f) {
            flowers.add(Integer.parseInt(i));
            }
        String[] b=reader.readLine().split(" ");

             ArrayDeque<Integer> buckets= new ArrayDeque<>();

        for (String j:
             b) {
            buckets.push(Integer.parseInt(j));

        }
        ArrayDeque<Integer> secondNature= new ArrayDeque<>();

                while (!flowers.isEmpty()&&!buckets.isEmpty()) {
                    int poped = flowers.remove();
                    int picked = buckets.pop();
                    int watered = picked - poped;


                    if(watered==0) {
                        secondNature.add(poped);
                    }

                    if (watered>0) {
                        if(!buckets.isEmpty()) {
                            int next = buckets.pop();
                            next += watered;
                            buckets.push(next);
                        }
                        else
                        {
                            buckets.push(watered);
                         }

                        }

                        if(watered<0)
                        {
                      poped=Math.abs(watered);
                      flowers.add(watered);
        }
        }

        if(flowers.isEmpty())
        {
            while (!buckets.isEmpty())
            {
                System.out.print(buckets.pop() + " ");
            }
        }

        if(buckets.isEmpty())
        {
            while (!flowers.isEmpty())
            {
                System.out.print(flowers.poll() +" ");
            }
        }

        System.out.println();

        if(secondNature.isEmpty())
        {
            System.out.println("None");
        }
        else
        {
            System.out.println(secondNature.poll()+" ");
        }


        }
    }

