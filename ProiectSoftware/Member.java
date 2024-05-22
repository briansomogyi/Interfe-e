package ProiectSoftware;

public abstract class Member {
    private int varsta;
    private String nume;

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Member(int varsta, String nume) {
        this.varsta = varsta;
        this.nume = nume;
    }

}
