package Almacen;

public class EjemploAlmacen {
    public static void main(String[] args) {

        Vendedor juan = new Vendedor("Juan","Ruiz", "75645634Z", "V1");
        Vendedor gerson = new Vendedor("Gerson","Suarez", "13456243B", "V2");

        Cliente raquel = new Cliente("Raquel", "Camino", "75635869M", "C1");
        Cliente beatriz = new Cliente("Beatriz", "Velasco", "72345987M", "C2");

        Perecedero naranja = new Perecedero("Prod1", "Naranja", 1.5, 6, 900, "Naranja");
        NoPerecedero pasta = new NoPerecedero("Prod2", "Macarrones", 1, 1, "Macarrones de caracol", 500);
        Limpieza fairy = new Limpieza("Prod3", "Fairy", 2.2, 1, "Ftalatos y almizcles sintéticos", 1);

        raquel.comprarProducto(raquel, gerson, naranja);
        System.out.println();
        beatriz.comprarProducto(beatriz, juan, pasta, fairy);


     }
}
