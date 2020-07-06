package univali.andersonsimioni.unitTest;

public class Pizza {

    private static univali.andersonsimioni.Pizza createExamplePizza(){
        return new univali.andersonsimioni.Pizza("Pepperoni");
    }

    public static void testAddFlavor(){
        univali.andersonsimioni.Pizza example = createExamplePizza();
        example.AddFlavor("Cheese");
        System.out.println(example.toString());
    }

    public static void testAddSizePrice(){
        univali.andersonsimioni.Pizza example = createExamplePizza();
        example.AddSizePrice("Small", 10f);
        System.out.println(example.toString());
    }
}
