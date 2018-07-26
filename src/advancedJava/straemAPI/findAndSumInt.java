package advancedJava.straemAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.*;

public class findAndSumInt {
    public static void main(String[] args) throws IOException {

        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

        List<String> num=Arrays.asList(reader.readLine().split(" "));

        ArrayList<String> nums=new ArrayList<>(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));

                Optional<Integer> sum=
                        num.stream().
                filter(x->!x.isEmpty()).


                  map(Integer::valueOf).

                                reduce((x,y)->x+y);

        System.out.println(sum.isPresent()?sum.get():"No match");



    }
}
