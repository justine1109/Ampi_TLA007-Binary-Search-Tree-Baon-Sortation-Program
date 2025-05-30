package com.mycompany.ampi_tla7;

import java.util.Scanner;

public class Ampi_TLA7 {

    public static void main(String[] args) {
        BaonBST tree = new BaonBST();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Please enter student name: ");
            String inputName = sc.nextLine();

            System.out.println("Enter Student's \"Baon\": ");
            int inputBaon = sc.nextInt();
            sc.nextLine(); 

            tree.insert(new Student(inputName, inputBaon));
        }

        System.out.println("\nStudents sorted by baon (Highest to Lowest):");
        tree.printDescending();
    }
}
         
  

