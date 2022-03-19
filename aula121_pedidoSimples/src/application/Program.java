package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        //definindo local e formato de data e inic scanner
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        //instanciando cliente pelo scanner
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.nextLine());

        Client client = new Client(name, email,birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine());
        Order order = new Order(new Date(), orderStatus,client);

        System.out.print("How many items to this order? ");
        Integer quantity = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= quantity; i++){
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            sc.nextLine();

            Product product = new Product(productName,productPrice);

            System.out.print("Quantity: ");
            Integer productQuantity = sc.nextInt();
            sc.nextLine();

            OrderItem item = new OrderItem(productQuantity, product);
            order.addItem(item);
        }

        System.out.println(order.getItems().get(0).getProduct().getName());
        sc.close();
    }
}
