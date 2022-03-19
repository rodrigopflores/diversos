package application;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        Integer n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            Character ic = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            sc.nextLine();

            if(ic == 'i'){

                System.out.print("Health expenditures: ");
                Double healthExp = sc.nextDouble();
                sc.nextLine();
                list.add(new PessoaFisica(name,anualIncome,healthExp));
            } else {
                System.out.print("Number of employees: ");
                Integer numOfEmp = sc.nextInt();
                sc.nextLine();
                list.add(new PessoaJuridica(name, anualIncome,numOfEmp));
            }
        }
        System.out.println("\nTAXES PAID: ");

        Double total = 0.0;
        for(Contribuinte c : list){
            System.out.println(c.toString());
            total += c.imposto();
        }

        System.out.print("\nTOTAL TAXES: $ " + String.format("%.2f", total));

    }
}
