package univali.andersonsimioni;

import java.util.ArrayList;

public class Restaurant {
    private final ArrayList<Client> Clients;
    private final ArrayList<Pizza> Pizzas;
    private final ArrayList<Order> Orders;

    /**
     * Add new client to restaurant system
     * @param name
     */
    public void addClient(String name){
        if(name.isEmpty())
            throw new IllegalArgumentException("name is empty");

        int id = Clients.size();
        //Clients.add(new Client(id, name));
    }

    public void addClientsByFile(String path){
        Clients.addAll(Client.getClientsByFile(path));
    }

    public  boolean haveClient(int clientId){
        for (Client cl:
             Clients) {
            if(cl.getId() == clientId)
                return true;
        }

        return false;
    }

    public void addOrder(int clientId, ArrayList<Pizza> pizzas){
        if(clientId < 0)
            throw new IllegalArgumentException("client id is smaller than zero");
        if(pizzas == null)
            throw new IllegalArgumentException("pizzas is null");
        if(haveClient(clientId) == false)
            throw new IllegalArgumentException("Client dont exist");

        int id = Orders.size();
        Order order = new Order(id, clientId);
        Orders.add(order);
    }

    public Restaurant(ArrayList<Client> clients, ArrayList<Pizza> pizzas, ArrayList<Order> orders) {
        Clients = clients;
        Pizzas = pizzas;
        Orders = orders;
    }

    @Override
    public String toString() {
        String str = "Restaurant{" +
                "Clients=";
        for (Client c:
             Clients) {
            str += c.toString() + ",\n";
        }
        str+="\n, Pizzas=";
        for (Pizza c:
                Pizzas) {
            str += c.toString() + ",\n";
        }
        str+="\n, Orders=";
        for (Order c:
                Orders) {
            str += c.toString() + ",\n";
        }

        str+="\n}";

        return str;
    }

    public Restaurant() {
        Clients = new ArrayList<Client>();
        Pizzas = new ArrayList<Pizza>();
        Orders = new ArrayList<Order>();
    }
}
