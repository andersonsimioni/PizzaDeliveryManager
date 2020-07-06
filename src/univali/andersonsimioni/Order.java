package univali.andersonsimioni;

import java.util.ArrayList;
import java.util.HashMap;

public class Order {
    private final int OrderId;
    private final int ClientId;
    private final ArrayList<Integer> PizzasId;

    public void AddPizza(int pizzaId){
        PizzasId.add(pizzaId);
    }

    public void RemovePizza(int pizzaId){
        
    }

    public Order(int orderId, int clientId) {
        if(orderId < 0)
            throw new IllegalArgumentException("orderId is smaller than zero");
        if(clientId < 0)
            throw new IllegalArgumentException("clientId is smaller than zero");

        OrderId = orderId;
        ClientId = clientId;
        PizzasId = new ArrayList<Integer>();
    }
}
