package temaPentruAcasa;

public class ClasaMain {
    public static void main(String[] args) {

        Animal [] animale = new Animal[] {
                new Caine("oase","ograda","Avcearka"),
                new Pisica("peste", "apartament",true)
        };

        Veterinar veterinar = new Veterinar();

        // nu for clasic, dar for each
        for (Animal a: animale) {
            a.makeNoise();
            a.eat();
            a.sleep();
            veterinar.treatAnimal(a);
        }

    }
}
