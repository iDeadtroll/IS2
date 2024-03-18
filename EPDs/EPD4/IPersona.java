package EPD4;

public interface IPersona {
    // Getter y Setter para el atributo nombre
    String getNombre();

    void setNombre(String nombre);

    // Getter y Setter para el atributo dni
    String getDni();

    void setDni(String dni);

    // Getter y Setter para el atributo email
    String getEmail();

    void setEmail(String email);

    // Getter y Setter para el atributo tlf
    String getTlf();

    void setTlf(String tlf);

    // Método para imprimir los datos de la persona
    @Override
    String toString();
}
