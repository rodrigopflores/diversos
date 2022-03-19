package projetos.udemy;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {

        return temperature > 24 && (temperature < 36 || (summer && temperature < 46));

    }
}
