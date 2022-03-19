public class Hello {

    public static void main(String[] args){

        byte var1 = 100;
        short var2 = 10_000;
        int var3 = 100_000;

        long var4 = 50_000L + (10 * (var1 + var2 + var3));

        System.out.println(var4);
    }
}
