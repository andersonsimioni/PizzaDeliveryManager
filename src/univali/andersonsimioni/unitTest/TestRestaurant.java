package univali.andersonsimioni.unitTest;

import univali.andersonsimioni.Client;
import univali.andersonsimioni.Pizza;
import univali.andersonsimioni.Restaurant;

import java.util.ArrayList;

public class TestRestaurant {
    ArrayList<Client> clients = Client.getClientsByFile("sources/clients.json");
    ArrayList<Pizza> pizzas = Pizza.getPizzasByFile("sources/pizzas.json");

    Restaurant restaurant = new Restaurant();
    //restaurant.add
}
