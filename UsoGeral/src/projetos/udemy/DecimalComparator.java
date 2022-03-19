package projetos.udemy;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double var1, double var2){
        int intv1 = (int) var1;
        int intv2 = (int) var2;

        int c1var1 = (int)((var1*10) % 10);
        int c1var2 = (int)((var2*10) % 10);

        int c2var1 = (int)((var1*100) % 10);
        int c2var2 = (int)((var2*100) % 10);

        int c3var1 = (int)((var1*1000) % 10);
        int c3var2 = (int)((var2*1000) % 10);

        if (intv1 == intv2 && c1var1 == c1var2 && c2var1 == c2var2 && c3var1 == c3var2)
            return true;
        else
            return false;
    }
}
