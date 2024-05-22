package ProiectSoftware;

import java.util.ArrayList;

public class ProiectComercial extends Project implements Risky {
    private String deadLine;
    private long fonduriDeMarketing;
    private int numarDeEchipe;
    private int numarDeMembri;

    public ProiectComercial(String titlu, String obiectiv, long fonduri, String deadLine) {
        super(titlu, obiectiv, fonduri);
        this.deadLine = deadLine;
        ArrayList<Member> members = getMembers();
        members.ensureCapacity(15);
        setMembers(members);
    }

    public static ProiectComercial createProiectComercial(String titlu, String obiectiv, long fonduri, String deadLine,
            ArrayList<Member> members, int numarDeMembri, int numarDeEchipe) {
        if (numarDeMembri > 15) {
            System.out.println("Proiectele comerciale au un numar maxim de 15 membri.");
            return null;
        } else {
            if (numarDeEchipe > numarDeMembri) {
                System.out.println("Proiectele comerciale au un numar de echipe mai mic decat numarul de membri.");
                return null;
            } else {
                ProiectComercial proiectComercial = new ProiectComercial(titlu, obiectiv, fonduri, deadLine);
                proiectComercial.setMembers(members);
                proiectComercial.setNumarDeMembri(numarDeMembri);
                long fonduriDeMarketing = (1 / 2) * fonduri;
                proiectComercial.setFonduriDeMarketing(fonduriDeMarketing);
                proiectComercial.setNumarDeEchipe(numarDeEchipe);
                return proiectComercial;
            }
        }
    }

    public long getFonduriDeMarketing() {
        return fonduriDeMarketing;
    }

    public void setFonduriDeMarketing(long fonduriDeMarketing) {
        this.fonduriDeMarketing = fonduriDeMarketing;
    }

    public int getNumarDeEchipe() {
        return numarDeEchipe;
    }

    public void setNumarDeEchipe(int numarDeEchipe) {
        this.numarDeEchipe = numarDeEchipe;
    }

    public String getDeadLine() {
        return deadLine;
    }

    @Override
    public double getRisk() {
        long fonduri = getFonduri();
        return numarDeEchipe * 3 / numarDeMembri / fonduri - fonduriDeMarketing;
    }

    public int getNumarDeMembri() {
        return numarDeMembri;
    }

    public void setNumarDeMembri(int numarDeMembri) {
        this.numarDeMembri = numarDeMembri;
    }

}
