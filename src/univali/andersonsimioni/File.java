package univali.andersonsimioni;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.ArrayList;

public class File {

    /**
     * class responsible for saving an ArrayList to a file
     * @param clients ArrayList of Client
     * @param path Path file where the object will be saved
     * @return true if save if, false if not
     */
    public static boolean saveClients(ArrayList<Client> clients, String path){
        try {
            FileOutputStream file = new FileOutputStream(path);
            ObjectOutputStream clientsFile = new ObjectOutputStream(file);
            clientsFile.writeObject(clients);
            clientsFile.flush();
            clientsFile.close();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Class responsible for read file and converto do ArrayList of Client
     * @param path Path file where object was saved
     * @return ArrayList<Client> or null if can't read file
     */
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
