public class ContBancar {

    private double sold; // ascuns

    public ContBancar(double soldInitial) {
        this.sold = soldInitial;
    }

    // getter / citeste / ia acces
    public double getSold() {
        return sold;
    }

    // setter - da posibilitate de modificare
    public void depunere(double suma) {
        if (suma > 0) {
            sold += suma;  //  sold = sold + suma
        } else {
            System.out.println("Nu puteti depune 0 lei sau minus 0 lei");
        }
    }

    // un atribut privat poate avea mai mult
    // decat un setter
    public void retragere(double suma) {
        if (suma > 0 && suma <= sold) {
            sold -= suma;  //  sold = sold - suma
        } else {
            System.out.println("Nu puteti retrage 0 lei sau mai putin deat este pe cont");
        }
    }




}
