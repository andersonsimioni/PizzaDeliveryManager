package univali.andersonsimioni;

import java.io.Serializable;


/**
 * Object to store pizzeria customers
 */
public class Client implements Serializable {
    private final int Id;
    private final String Name;

    /**
     * Contructor of object
     * @param id Integer and unique client identificator
     * @param name Name of client
     */
    public Client(int id, String name) {
        Id = id;
        Name = name;
    }

    /**
     * Function to get client if
     * @return integer, client id
     */
    public int getId() {
        return Id;
    }

    /**
     * Function to get client name
     * @return String with client name
     */
    public String getName() {
        return Name;
    }
}
