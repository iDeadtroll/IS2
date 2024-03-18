package EPD4;

import java.util.List;

public class Lector extends Persona {

    List<INoticia> noticias = new ArrayList();
    private IStrategy strategy = new EmailStrategy(super.getEmail());

    public Lector(String nombre, String email, String dni, String telefono) {
        super(nombre, email, dni, telefono);
    }

}
