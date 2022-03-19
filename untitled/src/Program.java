import java.util.Locale;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Integer[][] old = new Integer[9][9];
        Integer[][] newA = new Integer[9][9];

        old[5][5] = 7;
        newA[5][5] = 3;

        for(int i = 0; i < 9; i++){
            newA[i] = old[i].clone();
        }

        System.out.println(old[5][5]);
        System.out.println(newA[5][5]);

        newA[5][5] = 8;
        System.out.println(old[5][5]);
        System.out.println(newA[5][5]);
    }

}

