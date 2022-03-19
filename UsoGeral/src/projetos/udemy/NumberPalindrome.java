package projetos.udemy;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){

        int num = number;
        int num2 = number;
        int reverse = 0;
        int count = 0;
        while(Math.abs(num2) > 9){
            count++;
            num2 /= 10;
        }

        while (Math.abs(num) > 0){

            reverse = reverse + ((num % 10) * (int)(Math.pow(10,count)));
            count--;
            num /= 10;
        }
        System.out.println(num + " " + reverse + " " + number);
        return number == reverse;
    }
}
