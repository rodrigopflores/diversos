package projetos.udemy;

public class Main {

    public static void main(String[] args) {
        try {
            func(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("main");
        }
    }

    public static int func(int a, int b) {
        try {
            return func2(a, b);
        } catch (ArithmeticException e) {
            System.out.println("func");
            throw e;

        }
    }

    public static int func2(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("func2");
            throw e;
        }
    }

}



