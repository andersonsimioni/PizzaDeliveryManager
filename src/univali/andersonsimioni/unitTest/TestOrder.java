package univali.andersonsimioni.unitTest;

import univali.andersonsimioni.Order;

/**
 * function to test Order class
 */
public class TestOrder {
    public static void newOrder() {
        Order order = new Order(1, 1);
        order.AddPizza(1, "small");
        order.AddPizza(1, "medium");
        
        for(int i=0; i<order.getPizzasIds().size(); i++){
            System.out.printf("pizza id %d, size: %s\n", order.getPizzaIdByIndex(i), order.getPizzaSizeByIndex(i));
        }
    }
}
