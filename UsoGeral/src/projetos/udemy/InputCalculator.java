package projetos.udemy;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 1;

        while (true){
            boolean isValid = scanner.hasNextInt();
            if (!isValid)
                break;
            sum += scanner.nextInt();
            scanner.nextLine();
            count++;
        }

        long average = Math.round((double)sum / (double)(count-1));
        System.out.println("SUM = "+ sum + " AVG = "+ average);
        scanner.close();
    }
}
