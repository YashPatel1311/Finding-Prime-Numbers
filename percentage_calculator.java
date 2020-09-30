package com.company;
import java.util.Scanner;

public class percentage_calculator {
    public static void main(String[] args) {
        System.out.println("This is the percentage calculator of the CBSE Board for 5 subjects: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Marks of the subject 'English': ");
        int marks1 = scan.nextInt();
        System.out.println("Enter the Marks of the subject 'Mathematics': ");
        int marks2 = scan.nextInt();
        System.out.println("Enter the Marks of the subject 'Science': ");
        int marks3 = scan.nextInt();
        System.out.println("Enter the Marks of the subject 'Social Science': ");
        int marks4 = scan.nextInt();
        System.out.println("Enter the Marks of the subject 'Marathi': ");
        int marks5 = scan.nextInt();
        float total = marks1 + marks2 + marks3 + marks4 + marks5;
        System.out.println("The total of the marks is: "+total);
        float percentage = (total/500)*100;
        System.out.println("The percentage of the student according to the scored marks is: "+percentage);
    }
}
