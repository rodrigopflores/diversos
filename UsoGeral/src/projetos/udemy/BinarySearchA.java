package projetos.udemy;

import java.util.ArrayList;

public class BinarySearchA {

    public static int binarySearch(ArrayList<Integer> lista, int elemento) {

        int high = lista.size() - 1;
        int low = 0;
        int media = (high - low) / 2;

        while (elemento != lista.get(media)) {

            if (elemento > lista.get(media)) {
                low = media;
                media = (high - low) / 2;

            } else {
                high = media;
                media = (high - low) / 2;
            }

        }
        return media;
    }
}
