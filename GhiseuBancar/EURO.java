package GhiseuBancar;

public class EURO extends ContBancar implements SumaTotala {

    public EURO(String numarCont, float suma) {
        super(numarCont, suma);
    }

    public float getDobanda() {
        float dobanda;
        float suma = getSuma();
        if (suma > 500) {
            dobanda = (float) 0.3;
        } else {
            dobanda = 0;
        }
        return dobanda;
    }

    @Override
    public float getSumaTotala() {
        float suma = getSuma();
        return suma * 36000;
    }

}
