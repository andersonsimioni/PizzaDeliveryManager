package univali.andersonsimioni;

import java.util.ArrayList;
import java.util.HashMap;

public class Order {
    private final int OrderId;
    private final int ClientId;
    private final HashMap<Integer, String> PizzasId;

    public void AddPizza(){

    }

    public Order(int orderId, int clientId) {
        if(orderId < 0)
            throw new IllegalArgumentException("orderId is smaller than zero");
        if(clientId < 0)
            throw new IllegalArgumentException("clientId is smaller than zero");

        OrderId = orderId;
        ClientId = clientId;
        PizzasId = new HashMap<Integer, String>();
    }
}
