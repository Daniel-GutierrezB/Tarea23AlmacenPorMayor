package Almacen;

public class Cliente extends Persona{
    private String idCliente;

    public Cliente(String nombre, String apellido, String dni, String idCliente) {
        super(nombre, apellido, dni);
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", idCliente: " + idCliente;
    }
}
