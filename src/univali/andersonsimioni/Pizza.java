package univali.andersonsimioni;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.print.DocFlavor;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class Pizza {
    private final String Name;
    private final ArrayList<String> Flavors;
    private final HashMap<String, Double> SizesPrices;

    /**
     * Add flavor to pizza
     */
    public void addFlavor(String name){
        if(name.isEmpty())
            throw new IllegalArgumentException("Empty pizza flavor name");
        if(Flavors.contains(name))
            throw new IllegalArgumentException("Pizza already have this flavor");

        Flavors.add(name);
    }

    /**
     * Add new pizza size and set price
     * @param sizeName
     * @param price
     */
    public void addSizePrice(String sizeName, Double price){
        if(sizeName.isEmpty())
            throw new IllegalArgumentException("Empty pizza size name");
        if(price <= 0)
            throw new IllegalArgumentException("Invalid pizza size price");
        if(SizesPrices.containsKey(sizeName))
            throw new IllegalArgumentException("Pizza already have this size");

        SizesPrices.put(sizeName, price);
    }

    public String getName() {
        return Name;
    }

    public ArrayList<String> getFlavors() {
        return Flavors;
    }

    public Double getSizePrice(String size) {
        return SizesPrices.get(size);
    }

    public Pizza(String name) {
        if(name.isEmpty())
            throw new IllegalArgumentException("Name is empty");

        Name = name;
        Flavors = new ArrayList<String>();
        SizesPrices = new HashMap<String, Double>();
    }

    @Override
    public String toString() {
        String str = "Pizza{" +
                "Name='" + Name + '\'' +
                ", Flavors=";

        for (String s:Flavors) {
            str += s + ", ";
        }
        str += "\n";

        str += "Sizes prices= ";
        for (Double d:SizesPrices.values()) {
            str += d + ", ";
        }

        return str;
    }

    public static ArrayList<Pizza> getPizzasByFile(String path){
        ArrayList<Pizza> pizzas = new ArrayList();

        try {
            FileReader file = new FileReader(path);
            Object obj = new JSONParser().parse(file);
            JSONObject pizzaFile = (JSONObject) obj;

            pizzaFile.forEach((key, value) -> {
                Pizza pizza = new Pizza(key.toString());

                try {
                    JSONObject values = (JSONObject) new JSONParser().parse(value.toString());
                    values.forEach((type, info) -> {
                        if(type.toString().equals("flavors")){
                            try {
                                JSONArray flavors = (JSONArray) new JSONParser().parse(info.toString());
                                flavors.forEach(name -> {
                                    pizza.addFlavor(name.toString());
                                });

                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        } else if(type.toString().equals("prices")){
                            try {
                                JSONObject prices = (JSONObject) new JSONParser().parse(info.toString());
                                pizza.addSizePrice("small", (Double) prices.get("small"));
                                pizza.addSizePrice("medium", (Double) prices.get("medium"));
                                pizza.addSizePrice("large", (Double) prices.get("large"));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                pizzas.add(pizza);
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pizzas;
    }
}