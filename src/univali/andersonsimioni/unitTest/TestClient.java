package univali.andersonsimioni.unitTest;

import univali.andersonsimioni.Client;

import java.io.*;

public class TestClient {

    /**
     * function to test Client class
     */
    public static void addClient(){
        Client client = new Client(1, "Willian de Souza");
        System.out.printf("Id: %d\n", client.getId());
        System.out.printf("Name: %s", client.getName());
    }

}
