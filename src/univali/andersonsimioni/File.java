package univali.andersonsimioni;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class File {
    public static void getPizzasByFile(String path){
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
                                    pizza.AddFlavor(name.toString());
                                });

                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        } else if(type.toString().equals("prices")){
                            try {
                                JSONObject prices = (JSONObject) new JSONParser().parse(info.toString());
                                System.out.println(prices.get("small"));
                                //pizza.AddSizePrice("small", (Double) prices.get("small"));
                                //pizza.AddSizePrice("medium", (float) prices.get("medium"));
                                //pizza.AddSizePrice("large", (float) prices.get("large"));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                //System.out.println(pizza.getFlavors());
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
