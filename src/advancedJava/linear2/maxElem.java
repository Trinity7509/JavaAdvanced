package advancedJava.linear2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class maxElem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int comand = Integer.parseInt(scanner.nextLine());

        Deque<Integer> stack = new ArrayDeque<>();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < comand; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String commandType=tokens[0];


                if (Integer.valueOf(tokens[0]) == 1) {

                    stack.push(Integer.valueOf(tokens[1]));
                } else if (Integer.valueOf(tokens[0]) == 2) {
                    stack.pop();
                } else if (Integer.valueOf(tokens[0]) == 3) {
                    for (Integer integer : stack) {


                        if (integer > max) {
                            max = integer;
                        }

                    }
                    System.out.printf("%d%n", max);
                }

            }
        }
    }
