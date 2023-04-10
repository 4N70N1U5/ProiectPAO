package models;

import static constants.Constants.VALOARE_STANDARD_CHIRIE;
import static constants.Constants.VALOARE_STANDARD_CUMPARARE;

public class Apartament extends Locuinta {
    protected int etaj;

    public Apartament(String numeClient, Dezvoltator dezvoltator, Arhitect arhitect, int suprafataUtila, double discount, int etaj) {
        super(numeClient, dezvoltator, arhitect, suprafataUtila, discount);
        this.etaj = etaj;
    }

    public int getEtaj() {
        return etaj;
    }

    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }

    @Override
    public double calculPretChirie(int aplicareDiscount) {
        return VALOARE_STANDARD_CHIRIE * suprafataUtila * (1 - aplicareDiscount * discount / 100);
    }

    @Override
    public double calculPretCumparare(int aplicareDiscount) {
        return VALOARE_STANDARD_CUMPARARE * suprafataUtila * (1 - aplicareDiscount * discount / 100);
    }

    @Override
    public void afisareLocuinta() {
        super.afisareLocuinta();
        System.out.println("Etaj: " + etaj);
    }
}
