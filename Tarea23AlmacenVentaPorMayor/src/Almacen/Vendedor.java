package Almacen;

public class Vendedor extends Persona {
    private String idVendedor;

    public Vendedor(String nombre, String apellido, String dni,  String idVendedor) {
        super(nombre, apellido, dni);
        this.idVendedor = idVendedor;
    }

    public String getIdVendedor() {
        return idVendedor;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", idVendedor: " + idVendedor;
    }
}
