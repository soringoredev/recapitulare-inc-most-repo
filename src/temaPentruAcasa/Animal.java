package temaPentruAcasa;

public class Animal {
/*
Creați clasa Animal și clasele Câine, Pisică, Cal care o extind.
Clasa Animal conține variabile food, location și metode makeNoise, eat, sleep.
Metoda makeNoise, de exemplu, poate scoate pe consolă „Un astfel de ani
al scoate un sunet”. Câine, pisică, cal fac override metodelor makeNoise si eat.
Adăugați variabile la clasele Câine, Pisică, Cal care caracterizează doar
 aceste animale. Creați o clasă Veterinar în care definiți o metodă void treatAnimal (Animal animal).
Lăsați această metodă să imprime hrana și locația animalului primit.
În metoda principală, creați o matrice de tip Animal, în care scrieți animalele de toate tipurile pe care le aveți.
Trimite-le la veterinar în ciclu (adica cu ajutorul unei bucle)
 */

    protected String food;
    protected String location;

    public Animal(String food, String location) {
        this.food     = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Un astfel de animal scoate un sunet ...");
    }

    public void eat() {
        System.out.println("Animalul mananca " + food);
    }

    public void sleep() {
        System.out.println("Animalul doarme in " + location);
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
