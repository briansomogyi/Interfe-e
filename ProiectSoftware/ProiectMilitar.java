package ProiectSoftware;

import java.util.ArrayList;

public class ProiectMilitar extends Project {
    String deadLine;
    String parola;

    public ProiectMilitar(String titlu, String obiectiv, long fonduri, String deadLine, String parola) {
        super(titlu, obiectiv, fonduri);
        this.deadLine = deadLine;
        this.parola = parola;
        ArrayList<Member> members = getMembers();
        members.ensureCapacity(15);
        setMembers(members);
    }

    @Override
    public double getRisk() {
        ArrayList<Member> members = getMembers();
        int numarulMembrilor = members.size();
        int lungimeaParolei = parola.length();
        long fonduri = getFonduri();
        return numarulMembrilor / lungimeaParolei / fonduri;

    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

}
