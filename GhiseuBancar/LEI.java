package GhiseuBancar;

public class LEI extends ContBancar implements SumaTotala {

    public LEI(String numarCont, float suma) {
        super(numarCont, suma);
    }

    public void transfer(ContBancar contDestinatie, float suma) {
        if (contDestinatie instanceof LEI) {
            float sumaTotala = getSumaTotala();
            float sumaTotalaDestinatie = ((LEI) contDestinatie).getSumaTotala();
            sumaTotala -= suma;
            setSuma(sumaTotala);
            sumaTotalaDestinatie += suma;
            setSuma(sumaTotalaDestinatie);
        } else {
            System.out.println("Pot exista transferuri intre conturile in LEI si numai intre ele.");
        }
    }

    @Override
    public float getSumaTotala() {
        float suma = getSuma();
        return suma;
    }

}
