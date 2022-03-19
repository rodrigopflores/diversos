import java.io.*;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String source = "C:\\Users\\rodri\\IdeaProjects\\aula183\\out\\in.csv";
        String target = "C:\\Users\\rodri\\IdeaProjects\\aula183\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(source))) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(target))) {
                String nl = br.readLine();
                while (nl != null) {
                    String[] produto = nl.split(",");
                    bw.write(produto[0] + "," + String.format("%.2f", (Double.parseDouble(produto[1]) * Double.parseDouble(produto[2]))));
                    bw.newLine();
                    nl = br.readLine();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
