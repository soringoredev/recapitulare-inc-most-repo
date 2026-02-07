package temaPentruAcasa;

public class Pisica extends Animal {

    private boolean toarce;

    public Pisica(String food, String location, boolean toarce) {
        super(food, location);
        this.toarce = toarce;
    }

    @Override
    public void makeNoise() {
        System.out.println("Pisica face miau ...MIAAAU");
    }

    @Override
    public void eat() {
        System.out.println("Pisica mananca" + food);
    }

    public boolean isToarce() {
        return toarce;
    }
}
