package ProiectSoftware;

import java.util.ArrayList;

public class ProiectOpenSource extends Project implements Risky {
    private String mailingList;

    public ProiectOpenSource(String titlu, String obiectiv, long fonduri, String mailingList) {
        super(titlu, obiectiv, fonduri);
        this.mailingList = mailingList;
    }

    @Override
    public double getRisk() {
        ArrayList<Member> members = getMembers();
        int numarulMembrilor = members.size();
        long fonduri = getFonduri();
        return numarulMembrilor / fonduri;
    }

}
