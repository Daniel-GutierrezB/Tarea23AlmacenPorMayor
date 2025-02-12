package Almacen;

public class Limpieza  extends Producto{
    private String componentes;
    private double litros;

    public Limpieza(String idProducto, String nombre,
                    double precio, int cantidad, String componentes, double litros) {
        super(idProducto, nombre, precio, cantidad);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public double getLitros() {
        return litros;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", componentes: " + componentes
                + ", litros: " + litros + "L";
    }
}
