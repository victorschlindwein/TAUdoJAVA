package chapter3;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String args[]){
        //values we know
        int quota = 10;

        //get values we dont know
        System.out.println("Enter the number of sales of this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //make decision
        if(sales >= quota){
            System.out.println("Congrats!");
        } else {
            System.out.println("So fucking bad, piece of shit!");
        }
    }
}
