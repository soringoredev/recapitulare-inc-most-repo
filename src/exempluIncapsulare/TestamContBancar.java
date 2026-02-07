package exempluIncapsulare;

public class TestamContBancar {
    public static void main(String[] args) {

//        exempluIncapsulare.ContBancar contulLuiSorin = new exempluIncapsulare.ContBancar(100.0);  // MDL
//        exempluIncapsulare.ContBancar contulLuiCristi = new exempluIncapsulare.ContBancar(250.0); // MDL

        ContBancar cont = new ContBancar(1000);

        cont.depunere(500);
        cont.retragere(200);

        System.out.println(cont.getSold());

    }
}
