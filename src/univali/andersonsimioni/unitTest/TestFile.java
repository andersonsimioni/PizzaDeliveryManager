package univali.andersonsimioni.unitTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import univali.andersonsimioni.Client;
import univali.andersonsimioni.File;

public class TestFile {

    public static void saveClients(){
        Client client1 = new Client(1, "willian");
        Client client2 = new Client(2, "anderson");

        ArrayList<Client> clients = new ArrayList();
        clients.add(client1);
        clients.add(client2);

        if(File.saveClients(clients, "sources/clients.dat")){
            System.out.println("Saved");
        } else {
            System.out.println("Error on save clients");
        }
    }

    public static void readClients(){
        ArrayList<Client> clients = File.readClients("sources/clients.dat");
        if(clients != null) {
            System.out.println(clients.get(1).getName());
        } else {
            System.out.println("file not recovered");
        }
    }
}
