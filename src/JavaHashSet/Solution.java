package JavaHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pairs = scanner.nextInt();
        scanner.nextLine();

        int count = 0;

        HashSet<String> set = new HashSet<>();
        while (count < pairs){

            String input = scanner.nextLine();
            set.add(input);
            System.out.println(set.size());

            count++;
        }
    }
}
