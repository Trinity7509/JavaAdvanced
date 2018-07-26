package advancedJava.setsAndmaps;

import java.util.*;

public class softUniWar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayList<String> numbers=new ArrayList<>(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));

        HashSet<String> vip=new HashSet<>();
        TreeSet<String> regular=new TreeSet<>();

        while(true)
        {
            String input=scanner.nextLine();

            if("PARTY".equals(input))
            {
                break;
            }

           String symbol=Character.toString(input.charAt(0));

            if(numbers.contains(symbol))
            {
                vip.add(input);
            }
          else
            {
                regular.add(input);
            }

    }
    while (true)
    {
        String input=scanner.nextLine();
        if("END".equals(input))
        {
            break;
        }
        String symbol=Character.toString(input.charAt(0));
        if(numbers.contains(symbol))
        {
            vip.remove(input);
        }
        else
        {
           regular.remove(input);
        }
    }
    regular.addAll(vip);

        System.out.println(regular.size());

        for (String gueast:
             regular) {
            System.out.println(gueast);
        }




}
}