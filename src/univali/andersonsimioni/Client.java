package univali.andersonsimioni;

import java.io.Serializable;

public class Client {
    private final int Id;
    private final String Name;

    public Client(int id, String name) {
        Id = id;
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }
}
