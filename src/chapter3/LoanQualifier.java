package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void  main(String[] args){
        //get we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //get we don't know
        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years employed");
        double years = scanner.nextDouble();
        scanner.close();

        //make decision
        if(salary >= requiredSalary && years >= requiredYearsEmployed){
                System.out.println("You met the requirements");
        } else {
            System.out.println("You don't met the requirements xD");
        }
    }
}
