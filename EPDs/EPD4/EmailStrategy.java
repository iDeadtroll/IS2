package EPD4;

// Implementamos la estrategia de notificación por correo electrónico
public class EmailStrategy implements NotificationStrategy {
    private String email;

    public EmailStrategy(String email) {
        this.email = email;
    }

    // Getter para el atributo email
    public String getEmail() {
        return email;
    }

    // Setter para el atributo email
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmailStrategy{" +
                "email='" + email + '\'' +
                '}';
    }

    @Override
    public void notifyUser() {
        System.out.println("Enviando notificación por correo electrónico a " + email + "...");
    }
}
