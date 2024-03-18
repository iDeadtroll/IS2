package EPD4;

public class Noticia implements INoticia {
    private String titulo;
    private String autor;
    private String contenido;

    // Getter y Setter para el atributo titulo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter y Setter para el atributo autor
    public String getAutor() {
        return autor;
    }

    public void setAurot(String autor) {
        this.autor = autor;
    }

    // Getter y Setter para el atributo descripcion
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", contenido='" + contenido + '\'' +
                '}';
    }
}
