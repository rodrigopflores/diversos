package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();

    private Client client;


    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public List<OrderItem> getItems(){
        return items;
    }

    public Double total() {
        Double sum = 0.0;
        for (OrderItem i : items) {
            sum += i.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status);
        sb.append("\nClient: ");
        sb.append(client.getName());
        sb.append(" " + sdf.format(client.getBirthDate()));
        sb.append(" - " + client.getEmail());
        sb.append("\n Order items:\n");

        for (OrderItem i : items) {
            sb.append(i.getProduct().getName());
            sb.append(", $");
            sb.append(String.format("%.2f", i.getPrice()));
            sb.append(", Quantity: ");
            sb.append(i.getQuantity());
            sb.append(", Subtotal: $");
            sb.append(String.format("%.2f\n", i.subTotal()));

        }
        sb.append("Total price: $");
        sb.append(this.total());

        return sb.toString();
    }


}
