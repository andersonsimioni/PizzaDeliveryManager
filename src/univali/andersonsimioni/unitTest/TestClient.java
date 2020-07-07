package univali.andersonsimioni.unitTest;

import univali.andersonsimioni.Client;

import java.io.*;
import java.util.ArrayList;

public class TestClient {

    /**
     * function to test Client class
     */
    public static void addClient(){
        Client client = new Client(1, "Willian de Souza", "1232", "asdasd", "123");
        System.out.printf("Id: %d\n", client.getId());
        System.out.printf("Name: %s", client.getName());
    }

    public static void realClientByFile(){
        ArrayList<Client> clients = Client.getClientsByFile("sources/clients.json");
        clients.forEach((client)->{
            System.out.printf("id: %d\n", client.getId());
            System.out.printf("Name: %s\n", client.getName());
            System.out.printf("Phone: %s\n", client.getPhone());
            System.out.printf("CPF: %s\n", client.getCPF());
            System.out.printf("Address: %s\n", client.getAddress());
            System.out.println("-----------------");
        });

    }

}
