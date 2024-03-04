package feature.customer.domain;

public class Customer extends Person {
    public final String apellidos;
    public final String direccion;

    public final String poblacion;
    public final String codigoPostal;

    public Customer(String dni, String nombre, String apellidos, String direccion, String poblacion, String codigoPostal) {
        super(dni, nombre);
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.codigoPostal = codigoPostal;
    }
}
