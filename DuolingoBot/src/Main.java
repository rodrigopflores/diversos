
import java.awt.*;

public class Main extends Object {

    public static void main(String[] args) throws Exception {

        Robot robo = new Robot();

        System.out.println(robo.getPixelColor(1345, 124));
        robo.mouseMove(1200,150);
        robo.setAutoDelay(200);

        int counter = 0;


        while (true) {
            if (robo.getPixelColor(1164, 423).toString().equals("java.awt.Color[r=248,g=151,b=0]")) {


                switch (counter) {
                    case 0:
                        FeenAufDerWiese.one(robo);
                        break;
                    case 1:
                        FeenAufDerWiese.two(robo);
                        break;
                    case 2:
                        FeenAufDerWiese.three(robo);
                        break;
                    case 3:
                        FeenAufDerWiese.four(robo);
                        break;
                    case 4:
                        FeenAufDerWiese.five(robo);
                        break;
                }
                counter = (++counter % 5);

            }

        }
    }
}


