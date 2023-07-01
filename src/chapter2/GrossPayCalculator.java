package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]){

        //1 Get the number of Rovaris
        System.out.println("Informe o nível de azedisse do Rovaris");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the sugar spoons
        System.out.println("Informe a quantidade de colheres de açúcar");
        int rate = scanner.nextInt();

        //3. Get the adjective
        System.out.println("Como você gostaria de adjetivar o seu drink?");
        String adjective = scanner.next();
        scanner.close();

        //3. Make the maths
        double result = hours/rate;
        String phrase = "Seu " + adjective + " está adoçado com " + rate + " colheres de açúcar. Isso dá " + result + " na escala ritcher!";

        //4. Display output
        System.out.println(phrase);
    }
}
