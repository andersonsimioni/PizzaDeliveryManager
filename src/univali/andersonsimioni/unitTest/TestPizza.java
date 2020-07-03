package univali.andersonsimioni.unitTest;

import univali.andersonsimioni.Pizza;

public class TestPizza {
    public static void run(){
        univali.andersonsimioni.Pizza pizza = new Pizza("Sweet home pizza");
        pizza.AddSizePrice("big", (float) 46.99);
        pizza.AddSizePrice("medium", (float) 36.99);
        pizza.AddSizePrice("small", (float) 26.99);
        pizza.AddSizePrice("tiny", (float) 16.99);
        pizza.AddFlavor("Chicken");
        pizza.AddFlavor("Cheese");

        System.out.printf("Name: %s\n", pizza.getName());
        System.out.println("-----------");
        for (String flavor : pizza.getFlavors()) {
            System.out.printf("Flavor: %s\n", flavor);
        }
        System.out.println("-----------");
        System.out.printf("Big %f\n", pizza.getSizePrice("big"));
        System.out.printf("Small %f\n", pizza.getSizePrice("small"));
        System.out.printf("Tiny %f\n", pizza.getSizePrice("tiny"));

    }
}
