package univali.andersonsimioni.unitTest;

import univali.andersonsimioni.Pizza;

import java.util.ArrayList;

public class TestPizza {
    public static void testAPizza(){
        univali.andersonsimioni.Pizza pizza = new Pizza("ALHO E ÓLEO");

        pizza.addSizePrice("big",16.00);
        pizza.addSizePrice("medium",18.00);
        pizza.addSizePrice("small",20.00);

        pizza.addFlavor("Molho");
        pizza.addFlavor("Mussarela");
        pizza.addFlavor("Alho frito no Azeite");
        pizza.addFlavor("Parmesão");
        pizza.addFlavor("Azeitonas");

        System.out.printf("Name: %s\n", pizza.getName());
        System.out.println("-----------");
        for (String flavor : pizza.getFlavors()) {
            System.out.printf("Flavor: %s\n", flavor);
        }
        System.out.println("-----------");
        System.out.printf("Big %f\n", pizza.getSizePrice("big"));
        System.out.printf("medium %f\n", pizza.getSizePrice("medium"));
        System.out.printf("Small %f\n", pizza.getSizePrice("small"));

    }

    public static void testArray(){
        ArrayList<Pizza> pizzas = Pizza.getPizzasByFile("sources/pizzas.json");
        System.out.println(pizzas.get(1).getName());
    }
}
