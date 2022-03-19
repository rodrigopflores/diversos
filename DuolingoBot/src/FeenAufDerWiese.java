import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class FeenAufDerWiese {

    public static void one(Robot robo) {

        robo.mouseWheel(4000);
        robo.mouseMove(880, 150);
        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        while (true) {
            if (robo.getPixelColor(1320, 980).toString().equals("java.awt.Color[r=88,g=204,b=2]") || robo.getPixelColor(1320, 980).toString().equals("java.awt.Color[r=28,g=176,b=246]")) {

                robo.mouseMove(1320, 980);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(1320, 600);

            } else if (robo.getPixelColor(658, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(850, 610);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            } else if (robo.getPixelColor(800, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(720, 595);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(720, 660);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


            } else if (robo.getPixelColor(895, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(720, 580);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(720, 640);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            } else if (robo.getPixelColor(1205,124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(800, 550);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(800, 630);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            } else if (robo.getPixelColor(1335,124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(720, 580);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(715, 645);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);



            } else if (robo.getPixelColor(1164, 423).toString().equals("java.awt.Color[r=248,g=151,b=0]")) {
                break;
            }

        }
    }

    public static void two(Robot robo) {

        robo.mouseWheel(4000);
        robo.mouseMove(1020, 150);
        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        while (true) {
            if (robo.getPixelColor(1320, 980).toString().equals("java.awt.Color[r=88,g=204,b=2]") || robo.getPixelColor(1320, 980).toString().equals("java.awt.Color[r=28,g=176,b=246]")) {

                robo.mouseMove(1320, 980);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(1320, 600);

            } else if (robo.getPixelColor(710, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(710, 620);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(710, 690);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            } else if (robo.getPixelColor(1000, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(1150, 600);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            } else if (robo.getPixelColor(1150, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(1000, 570);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(1000, 650);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            } else if (robo.getPixelColor(1220,124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(750, 640);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            } else if (robo.getPixelColor(1335,124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(720, 600);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(720, 680);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


            } else if (robo.getPixelColor(1164, 423).toString().equals("java.awt.Color[r=248,g=151,b=0]")) {
                break;
            }

        }
    }

    public static void three(Robot robo) {

        robo.mouseWheel(4000);
        robo.mouseMove(1200, 150);
        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        while (true) {
            if (robo.getPixelColor(1320, 980).toString().equals("java.awt.Color[r=88,g=204,b=2]") || robo.getPixelColor(1320, 980).toString().equals("java.awt.Color[r=28,g=176,b=246]")) {

                robo.mouseMove(1320, 980);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(1320, 600);

            } else if (robo.getPixelColor(675, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(800, 650);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            } else if (robo.getPixelColor(860, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(1000, 600);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(1000, 660);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            } else if (robo.getPixelColor(1000, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(700, 560);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(700, 620);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            } else if (robo.getPixelColor(1335,124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(700, 595);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(700, 660);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            } else if (robo.getPixelColor(1164, 423).toString().equals("java.awt.Color[r=248,g=151,b=0]")) {
                break;
            }

        }
    }

    public static void four(Robot robo) {

        robo.mouseWheel(4000);
        robo.mouseMove(700, 400);
        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        while (true) {
            if (robo.getPixelColor(1320, 980).toString().equals("java.awt.Color[r=88,g=204,b=2]") || robo.getPixelColor(1320, 980).toString().equals("java.awt.Color[r=28,g=176,b=246]")) {

                robo.mouseMove(1320, 980);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(1320, 600);

            } else if (robo.getPixelColor(650, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(1000, 570);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(1000, 630);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            } else if (robo.getPixelColor(798, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(700, 590);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(700, 650);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            } else if (robo.getPixelColor(1010, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(700, 580);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(700, 650);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            } else if (robo.getPixelColor(1285,124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(700, 610);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(700, 680);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


            } else if (robo.getPixelColor(1345,124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(700, 580);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(700, 660);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


            } else if (robo.getPixelColor(1164, 423).toString().equals("java.awt.Color[r=248,g=151,b=0]")) {
                break;
            }

        }
    }

    public static void five(Robot robo) {


        robo.mouseWheel(4000);
        robo.mouseMove(880, 400);
        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        while (true) {
            if (robo.getPixelColor(1320, 980).toString().equals("java.awt.Color[r=88,g=204,b=2]") || robo.getPixelColor(1320, 980).toString().equals("java.awt.Color[r=28,g=176,b=246]")) {

                robo.mouseMove(1320, 980);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(1320, 600);
            } else if (robo.getPixelColor(649, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]") ||
                    robo.getPixelColor(665, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(1000, 550);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(1000, 590);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(1000, 680);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(1320, 600);

            } else if (robo.getPixelColor(745, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]") ||
                    robo.getPixelColor(770, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(760, 600);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(860, 600);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(950, 600);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(1040, 600);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(1130, 600);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(1320, 600);

            } else if (robo.getPixelColor(1000, 650).toString().equals("java.awt.Color[r=247,g=247,b=247]")) {
                robo.mouseMove(1000, 650);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


                robo.keyPress(KeyEvent.VK_W);
                robo.keyPress(KeyEvent.VK_A);
                robo.keyPress(KeyEvent.VK_H);
                robo.keyPress(KeyEvent.VK_R);
                robo.keyPress(KeyEvent.VK_E);
                robo.keyPress(KeyEvent.VK_N);
                robo.keyPress(KeyEvent.VK_D);
                robo.keyPress(KeyEvent.VK_SPACE);
                robo.keyPress(KeyEvent.VK_E);
                robo.keyPress(KeyEvent.VK_U);
                robo.keyPress(KeyEvent.VK_R);
                robo.keyPress(KeyEvent.VK_E);
                robo.keyPress(KeyEvent.VK_R);
                robo.keyPress(KeyEvent.VK_SPACE);
                robo.keyPress(KeyEvent.VK_P);
                robo.keyPress(KeyEvent.VK_A);
                robo.keyPress(KeyEvent.VK_R);
                robo.keyPress(KeyEvent.VK_T);
                robo.keyPress(KeyEvent.VK_Y);
                robo.keyPress(KeyEvent.VK_S);

            } else if (robo.getPixelColor(914, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(710, 560);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(710, 625);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(710, 690);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(1320, 600);

            } else if (robo.getPixelColor(1000, 600).toString().equals("java.awt.Color[r=247,g=247,b=247]")) {
                robo.mouseMove(1000, 600);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                robo.keyPress(KeyEvent.VK_I);
                robo.keyPress(KeyEvent.VK_C);
                robo.keyPress(KeyEvent.VK_H);
                robo.keyPress(KeyEvent.VK_SPACE);
                robo.keyPress(KeyEvent.VK_S);
                robo.keyPress(KeyEvent.VK_E);
                robo.keyPress(KeyEvent.VK_H);
                robo.keyPress(KeyEvent.VK_E);
                robo.keyPress(KeyEvent.VK_SPACE);
                robo.keyPress(KeyEvent.VK_E);
                robo.keyPress(KeyEvent.VK_U);
                robo.keyPress(KeyEvent.VK_C);
                robo.keyPress(KeyEvent.VK_H);


            } else if (robo.getPixelColor(1160, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]") ||
                    robo.getPixelColor(1132, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(1060, 610);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(1320, 600);
            } else if (robo.getPixelColor(1310, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]") ||
                    robo.getPixelColor(1300, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {

                robo.mouseMove(710, 540);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(710, 600);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(710, 660);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(1320, 600);


            } else if (robo.getPixelColor(1355, 124).toString().equals("java.awt.Color[r=88,g=204,b=2]")) {
                robo.mouseMove(710, 550);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(710, 630);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(710, 700);
                robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robo.mouseMove(1320, 600);

            } else if (robo.getPixelColor(1164, 423).toString().equals("java.awt.Color[r=248,g=151,b=0]")) {
                break;
            }

        }

    }

}
