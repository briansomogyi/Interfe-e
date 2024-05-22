package ProiectSoftware;

import java.util.ArrayList;

public abstract class Project implements Risky {
    private String titlu;
    private String obiectiv;
    private long fonduri;
    private ArrayList<Member> members;

    public void addMember(Member m) {
        members.add(m);
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getObiectiv() {
        return obiectiv;
    }

    public void setObiectiv(String obiectiv) {
        this.obiectiv = obiectiv;
    }

    public long getFonduri() {
        return fonduri;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public Project(String titlu, String obiectiv, long fonduri) {
        this.titlu = titlu;
        this.obiectiv = obiectiv;
        this.fonduri = fonduri;
        members = new ArrayList<>();
        members.add(new Manager(40, "Managerul"));
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Project [titlu=" + titlu + ", obiectiv=" + obiectiv + ", fonduri=" + fonduri + ", members=" + members
                + "]";
    }

}
