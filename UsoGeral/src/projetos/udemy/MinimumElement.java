package projetos.udemy;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger(){
        Scanner scanner1 = new Scanner(System.in);
        int numberOfElements = scanner1.nextInt();
        return numberOfElements;
    }

    private static int[] readElements(int numberOfElements){
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[numberOfElements];
        for(int i = 0; i < numberOfElements; i++)
            intArray[i] = scanner.nextInt();

        return intArray;
    }

    private static int findMin(int[] intArray){
        int min = intArray[0];
        for(int i = 0; i < intArray.length; i++)
            if (intArray[i] < min) min = intArray[i];

        return min;
    }
}
