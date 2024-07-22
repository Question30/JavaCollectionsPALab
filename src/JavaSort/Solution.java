package JavaSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();

        int count = 0;

        while (count < num){
            int id = scanner.nextInt();
            String name = scanner.next();
            double gpa = scanner.nextDouble();
            Student student = new Student(id, name, gpa);
            students.add(student);
            count++;
        }

        Collections.sort(students);
        for(Student st : students){
            System.out.println(st);
        }
    }

}
