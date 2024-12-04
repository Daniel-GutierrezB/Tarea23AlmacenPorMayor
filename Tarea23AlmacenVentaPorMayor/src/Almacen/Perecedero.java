package Almacen;

public class Perecedero extends Producto{
    private double peso;
    private String color;

    public Perecedero(String idProducto, String nombre,
                      double precio, int cantidad, double peso, String color) {
        super(idProducto, nombre, precio, cantidad);
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", peso: " + peso + "gramos"
                + ", color: " + color;
    }
}
