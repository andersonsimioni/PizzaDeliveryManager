package univali.andersonsimioni;

import java.util.ArrayList;

public class Order {

    private enum pizzaSize{
        small("small"),
        medium("medium"),
        large("large");

        private String size;

        pizzaSize(String size) {
            this.size = size;
        }

        public String getSize(){
            return this.size;
        }
    }

    private final int OrderId;
    private final int ClientId;
    private final ArrayList<Integer> PizzasId;
    private final ArrayList<pizzaSize> PizzasSizes;

    private boolean confirmed;

    public void addPizza(int pizzaId, String size){
        if(pizzaId < 0)
            throw new IllegalArgumentException("Pizza id is smaller than zero");

        switch (size) {
            case "small" -> PizzasSizes.add(pizzaSize.small);
            case "medium" -> PizzasSizes.add(pizzaSize.medium);
            case "large" -> PizzasSizes.add(pizzaSize.large);
            default -> throw new IllegalArgumentException("Invalid pizza size, accepted: small, medium, large");
        }

        PizzasId.add(pizzaId);
    }

    public ArrayList<Integer> getPizzasIds(){
        return PizzasId;
    }

    public String getPizzaSizeByIndex(Integer index){
        return PizzasSizes.get(index).toString();
    }

    public Integer getPizzaIdByIndex(Integer index){
        return PizzasId.get(index);
    }

    public void RemovePizza(int pizzaId){
        if(pizzaId < 0)
            throw new IllegalArgumentException("Pizza id is smaller than zero");

        for (Integer p: PizzasId) {
            if(p == pizzaId){
                PizzasId.remove(p);
                PizzasSizes.remove(p);
                return;
            }
        }
    }

    public String toString() {
        String str = "Order{" +
                "OrderId=" + OrderId +
                ", ClientId=" + ClientId;
                str += ", PizzasId=\n";
        for (Integer i:
             PizzasId) {
            str += i + ", ";
        }

        return str;
    }

    public Order(int orderId, int clientId, boolean confirmed) {
        if(orderId < 0) {
            throw new IllegalArgumentException("orderId is smaller than zero");
        }
        if(clientId < 0) {
            throw new IllegalArgumentException("clientId is smaller than zero");
        }

        OrderId = orderId;
        ClientId = clientId;
        PizzasId = new ArrayList<Integer>();
        PizzasSizes = new ArrayList<pizzaSize>();
        this.confirmed = confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public int getClientId() {
        return ClientId;
    }
}
