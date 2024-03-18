package EPD4;

import java.util.ArrayList;
import java.util.List;

public class Periodico {
    List<IObservador> observadores;
    List<INoticia> noticias;
    private static Periodico instance; // Para aplicar patron Singleton o no

    public Periodico() {
        this.observadores = new ArrayList();
        this.noticias = new ArrayList<>();
    }

    public List<INoticia> getNoticias() {
        return noticias;
    }

    public void setNoticias(List<INoticia> noticias) {
        this.noticias = noticias;
    }

    public List<IObservador> getObservador() {
        return observadores;
    }

    public void setObservadores(List<IObservador> observador) {
        this.observadores = observador;
    }

}
