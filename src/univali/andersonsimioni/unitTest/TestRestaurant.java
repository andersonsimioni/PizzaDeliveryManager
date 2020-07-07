package univali.andersonsimioni.unitTest;

import univali.andersonsimioni.Client;
import univali.andersonsimioni.Pizza;
import univali.andersonsimioni.Restaurant;

import java.util.ArrayList;

public class TestRestaurant {
    public static void run() {
        ArrayList<Pizza> pizzas = Pizza.getPizzasByFile("sources/pizzas.json");

        Restaurant restaurant = new Restaurant("Lele");
        restaurant.addClientsByFile("sources/clients.json");
        restaurant.addOrder(0,pizzas);

        restaurant.getClients().forEach((client -> {
            System.out.printf("ID: %d\n", client.getId());
            System.out.printf("Name: %s\n", client.getName());
            System.out.printf("CPF: %s\n", client.getCPF());
            System.out.printf("Phone: %s\n", client.getPhone());
            System.out.printf("Address: %s\n", client.getAddress());
            System.out.println("--------------------");
        }));

    }
}
