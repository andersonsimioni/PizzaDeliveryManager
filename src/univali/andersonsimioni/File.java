package univali.andersonsimioni;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.ArrayList;

public class File {

    public static void saveClients(ArrayList<Client> clients, String path){
        try {
            FileOutputStream file = new FileOutputStream(path);
            ObjectOutputStream clientsFile = new ObjectOutputStream(file);
            clientsFile.writeObject(clients);
            clientsFile.flush();
            clientsFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Client> readClients(String path){
        try {
            FileInputStream file = new FileInputStream(path);
            ObjectInputStream clients = new ObjectInputStream(file);

            return (ArrayList<Client>) clients.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
