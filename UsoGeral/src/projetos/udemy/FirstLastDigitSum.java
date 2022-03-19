package projetos.udemy;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0 )
            return -1;

        int first = number % 10;
        int last = 0;
        int temp = number;
        while (temp > 0){
            last = temp;
            temp /= 10;
        }

        return first + last;

    }
}
