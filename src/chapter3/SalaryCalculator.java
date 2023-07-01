package chapter3;

/*
IF Statement.
Um Rovaris adulto custa 500 reais em Marlboro por mês.
Se comprar cigarro em boxe fechado direto no archer sai por 400 (precisa ser pra pelo menos 6 meses).
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String args[]){
        //Init know values
        int salary = 500;
        int bonus = 400;

        //Get the unknow values
        System.out.println("Por quantos meses de permanência você vai querer ficar?");
        Scanner scanner = new Scanner(System.in);
        int months = scanner.nextInt();
        scanner.close();

        //Make a decision
        if(months >= 6){
            int valueBigTime = months * bonus;
            System.out.println("Vai sair na bagatela de " + valueBigTime + " pilas meu jovem.");
        } else {
        int valueSmallTime = months * salary;
        //Show output
        System.out.println("Vais pagar " + valueSmallTime + " pilas meu jovem, não se se vale a pena.");
        }
    }
}
