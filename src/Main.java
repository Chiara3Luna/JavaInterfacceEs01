public class Main {
    public static void main(String[] args) {

        //creazione oggetto rettangolo

        Rettangolo rettangolo = new Rettangolo(5, 10);

        //stampo area rettangolo

        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());

        //crea oggetto triangolo

        Triangolo triangolo = new Triangolo(6, 8);

        //stampo area triangolo

        System.out.println("Area del triangolo: " + triangolo.calcolaArea());
    }
}