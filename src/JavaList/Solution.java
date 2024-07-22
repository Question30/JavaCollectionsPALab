package JavaList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        Integer[] arr = new Integer[L];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        int Q = scanner.nextInt();
        int count = 0;
        while (count < Q){
            String query = scanner.nextLine();
            if(query.equals("Delete")){
                int index = scanner.nextInt();
                list.remove(index);
                count++;
            }else if(query.equals("Insert")){
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(index, value);
                count++;
            }
        }

        for(Integer num : list){
            System.out.print(num + " ");
        }

    }
}
