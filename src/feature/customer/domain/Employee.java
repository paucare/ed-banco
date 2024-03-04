package feature.customer.domain;

public class Employee extends Person {

    public final String apellidos;
    public final String numeroSeguridadSocial;

    public Employee(String dni, String nombre, String apellidos, String numeroSeguridadSocial) {
        super(dni, nombre);
        this.apellidos = apellidos;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }
}
