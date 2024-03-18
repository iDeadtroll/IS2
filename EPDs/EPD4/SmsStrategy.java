package EPD4;

// Implementamos la estrategia de notificación por SMS
public class SmsStrategy implements NotificationStrategy {
    private String tlf;

    public SmsStrategy(String tlf) {
        this.tlf = tlf;
    }

    // Getter para el atributo tlf
    public String getTlf() {
        return tlf;
    }

    // Setter para el atributo tlf
    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    @Override
    public String toString() {
        return "TlfStrategy{" +
                "tlf='" + tlf + '\'' +
                '}';
    }

    @Override
    public void notifyUser() {
        System.out.println("Enviando notificación por SMS a " + tlf + "...");
    }
}
