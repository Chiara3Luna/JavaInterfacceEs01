public class Rettangolo implements Forma {
    private double base;
    private double altezza;

    //costruttore per la base e l'altezza del rettangolo
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    //implemento metodo per calcolare area rettangolo
    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}
