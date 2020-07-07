package univali.andersonsimioni;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;


/**
 * Object to store pizzeria customers
 */
public class Client implements Serializable {
    private final int Id;
    private final String Name;
    private final String Phone;
    private final String CPF;
    private final String Address;

    /**
     * Contructor of object
     * @param id Integer and unique client identificator
     * @param name Name of client
     */
    public Client(int id, String name, String phone, String cpf, String address) {
        Id = id;
        Name = name;
        Phone = phone;
        CPF = cpf;
        Address = address;
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

    public String getPhone() {
        return Phone;
    }

    public String getCPF() {
        return CPF;
    }

    public String getAddress() {
        return Address;
    }

    public static ArrayList<Client> getClientsByFile(String path){
        ArrayList<Client> clients = new ArrayList();

        try {
            FileReader file = new FileReader(path);
            Object obj = new JSONParser().parse(file);
            JSONObject clientFile = (JSONObject) obj;


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clients;
    }
}
