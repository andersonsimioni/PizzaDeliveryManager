package univali.andersonsimioni;

public class Client {
    private final int Id;
    private final String Name;

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public Client(int id, String name) {
        Id = id;
        Name = name;
    }
}
