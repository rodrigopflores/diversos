package projetos.seriespack;

public class Series {

    public static int nSum(int n){
        int result = 0;
        for (int i = 0; i <= n; i++){
            result += i;
        }
        return result;
    }

    public static int factorial(int n){

        if (n > 1)
            return n * factorial(n - 1);

        return n;
    }

    public static int fibonacci(int n){
        if (n < 2)
            return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
