package EPD4;

public class Persona {
    // Atributos de la clase Persona
    private String nombre;
    private String dni;
    private String email;
    private String tlf;

    // Getter y Setter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para el atributo dni
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // Getter y Setter para el atributo email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter y Setter para el atributo tlf
    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    // Método para imprimir los datos de la persona
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", tlf='" + tlf + '\'' +
                '}';
    }

}
