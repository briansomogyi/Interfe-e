package GhiseuBancar;

import java.util.ArrayList;

public class Banca {
    private ArrayList<Client> clienti;
    private String codBanca;

    public void add(Client c) {
        for (Client client : clienti) {
            if (client.getNume().equals(c.getNume())) {
                System.out.println("Nu pot exista mai multi clienti cu acelasi nume.");
                return;
            }
        }
        clienti.add(c);
    }

    public void afisareClient(String nume) {
        for (Client client : clienti) {
            if (client.getNume().equals(nume)) {
                System.out.println(client);
                return;
            }
        }
        System.out.println("Nu am gasit clientul cerut: " + nume);
    }

    public String getCodBanca() {
        return codBanca;
    }

}
