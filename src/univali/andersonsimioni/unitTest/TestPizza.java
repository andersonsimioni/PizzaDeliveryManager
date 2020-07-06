package univali.andersonsimioni.unitTest;

import univali.andersonsimioni.Pizza;

public class TestPizza {
    public static void run(){
        univali.andersonsimioni.Pizza pizza = new Pizza("ALHO E ÓLEO");

        pizza.AddSizePrice("big",16.00);
        pizza.AddSizePrice("medium",18.00);
        pizza.AddSizePrice("small",20.00);

        pizza.AddFlavor("Molho");
        pizza.AddFlavor("Mussarela");
        pizza.AddFlavor("Alho frito no Azeite");
        pizza.AddFlavor("Parmesão");
        pizza.AddFlavor("Azeitonas");

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
}
