package Almacen;

import java.util.Arrays;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void comprarProducto(Cliente cliente,
                                Vendedor vendedor,
                                Producto ...producto){
        System.out.println("El/La cliente " + cliente
                + "\nha comprado el producto: "
                + Arrays.toString(producto)
                + "\nal vendedor " + vendedor);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre
                + ", apellido: " + apellido
                + ", dni: " + dni;
    }
}
