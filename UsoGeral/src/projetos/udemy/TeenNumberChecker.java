package projetos.udemy;

public class TeenNumberChecker {
    public static boolean hasTeen (int firstP, int secondP, int thirdP){
        return isTeen(firstP) || isTeen(secondP) || isTeen(thirdP);

    }

    public static boolean isTeen (int par){
        return par >= 13 && par <= 19;
    }
}
