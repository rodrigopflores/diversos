package projetos.udemy;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10) return -1;

        int remainder = 1;

        while (remainder > 0){
            remainder = first % second;
            first = second;
            second = remainder;
        }
        return first;
    }
}
