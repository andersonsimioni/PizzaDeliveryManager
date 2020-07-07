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
        restaurant.addOrder(1,pizzas);

        restaurant.getClients().forEach((client -> {
            System.out.printf("ID: %d\n", client.getId());
            System.out.printf("Name: %s\n", client.getName());
            System.out.printf("CPF: %s\n", client.getCPF());
            System.out.printf("Phone: %s\n", client.getPhone());
            System.out.printf("Address: %s\n", client.getAddress());
            restaurant.getOrders().forEach(order -> {
                if(((Integer) client.getId()).equals((Integer) order.getClientId())){
                    System.out.printf("Is confirmed: %s\n", order.isConfirmed());
                    for(int i=0; i<order.getPizzasIds().size(); i++){
                        System.out.printf("pizza id %d, size: %s\n", order.getPizzaIdByIndex(i), order.getPizzaSizeByIndex(i));
                    }
                }
            });
            System.out.println("-----------------");
        }));

    }
}
