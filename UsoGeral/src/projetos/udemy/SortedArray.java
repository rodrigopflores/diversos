package projetos.udemy;

import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int numberOfIntegers) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[numberOfIntegers];

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Type in #" + (i + 1));
            intArray[i] = scanner.nextInt();
        }

        return intArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println("Element " + i + " contents " + array[i]);
    }

    public static int[] sortIntegers(int[] array2) {
        int[] array = array2;

        for(int j = array.length ; j > 1; j--){
            for (int i = 0; i < (array.length-1); i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }

        }
        return array;
    }
}
