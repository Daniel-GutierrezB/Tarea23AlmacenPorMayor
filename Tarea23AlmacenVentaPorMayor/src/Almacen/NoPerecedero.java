package Almacen;

public class NoPerecedero extends Producto{
    private String contenido;
    private int calorias;

    public NoPerecedero(String idProducto, String nombre,
                        double precio, int cantidad, String contenido, int calorias) {
        super(idProducto, nombre, precio, cantidad);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public String getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", contenido: " + contenido
                + ", calorias: " +  calorias + "Kcal";
    }
}
