package temaPentruAcasa;

public class Caine extends Animal {

    private String rasa;

    public Caine(String food, String location, String rasa) {
        super(food, location);
        this.rasa = rasa;
    }

    @Override
    public void makeNoise() {
        System.out.println("Cainele face HAM HAM!!!");

    }

    @Override
    public void eat() {
        System.out.println("Cainele de rasa " + rasa + " mananca " + food);
    }

    public String getRasa() {
        return rasa;
    }
}
