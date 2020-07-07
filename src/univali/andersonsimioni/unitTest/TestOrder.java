package univali.andersonsimioni.unitTest;

import univali.andersonsimioni.Order;

/**
 * function to test Order class
 */
public class TestOrder {
    public static void newOrder() {
        Order order = new Order(1, 1, false);
        order.addPizza(1, "small");
        order.addPizza(1, "medium");

        System.out.printf("Is confirmed: %s\n", order.isConfirmed());
        for(int i=0; i<order.getPizzasIds().size(); i++){
            System.out.printf("pizza id %d, size: %s\n", order.getPizzaIdByIndex(i), order.getPizzaSizeByIndex(i));
        }

        order.setConfirmed(true);
        System.out.printf("Is confirmed: %s\n", order.isConfirmed());
        for(int i=0; i<order.getPizzasIds().size(); i++){
            System.out.printf("pizza id %d, size: %s\n", order.getPizzaIdByIndex(i), order.getPizzaSizeByIndex(i));
        }
    }
}
