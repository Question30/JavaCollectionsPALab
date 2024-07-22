package JavaMap;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int query = scanner.nextInt();
        scanner.nextLine();

        int count = 0;

        HashMap<String, String> map = new HashMap<>();

        while (count < query){
            String name = scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            map.put(name, phoneNumber);
            count++;
        }


        int count2 = 0;

        while (count2 < query){
            String q = scanner.nextLine();
            if(map.containsKey(q)){
                System.out.println(q + "=" + map.get(q));
            }else{
                System.out.println("Not found");
            }
            count2++;
        }

        scanner.close();
    }
}
