package Almacen;

public class Producto {
    private String idProducto;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String idProducto, String nombre,
                    double precio, int cantidad) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "idProducto: " + idProducto
                + ", nombre: " + nombre
                + ", precio: " + precio
                + ", cantidad: " + cantidad;
    }
}
