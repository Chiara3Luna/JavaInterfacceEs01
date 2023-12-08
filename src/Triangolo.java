public class Triangolo implements Forma {
    private double base;
    private double altezza;

    //costruttore per la base e l'altezza del triangolo
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    //implemento metodo per calcolare area triangolo
    @Override
    public double calcolaArea() {
        return (base * altezza) / 2;
    }
}
