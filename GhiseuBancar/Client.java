package GhiseuBancar;

import java.util.ArrayList;

public class Client {
    private String nume;
    private String adresa;
    private ArrayList<ContBancar> conturi;

    public Client(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
        this.conturi = new ArrayList<>(5);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public ArrayList<ContBancar> getConturi() {
        return conturi;
    }

    @Override
    public String toString() {
        String string = nume + " " + adresa + "\n";
        for (ContBancar contBancar : conturi) {
            string += contBancar.getSuma() + "\n";
        }
        return string;
    }

}
