package univali.andersonsimioni;

import java.util.ArrayList;
import java.util.HashMap;

public class Pizza {
    private final String Name;
    private final ArrayList<String> Flavors;
    private final HashMap<String, Double> SizesPrices;

    /**
     * Add flavor to pizza
     */
    public void AddFlavor(String name){
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
    public void AddSizePrice(String sizeName, Double price){
        if(sizeName.isEmpty())
            throw new IllegalArgumentException("Empty pizza size name");
        if(price <= 0)
            throw new IllegalArgumentException("Invalid pizza size price");
        if(SizesPrices.containsKey(sizeName))
            throw new IllegalArgumentException("Pizza already have this size");

        SizesPrices.put(sizeName, price);
    }

    /**
     * Load pizza data info from file
     * @param sizeCount
     * @param data
     * @return
     */
    public static Pizza LoadFromFileStringData(int sizeCount, String data){
        String[] lines = (String[]) data.lines().toArray();

        return null;
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
}