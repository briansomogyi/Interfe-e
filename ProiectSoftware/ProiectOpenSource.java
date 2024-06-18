package ProiectSoftware;

import java.util.ArrayList;

public class ProiectOpenSource extends Project {
    private String mailingList;

    public String getMailingList() {
        return mailingList;
    }

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
