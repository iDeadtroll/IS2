package Factory;

//Interfaz para las factorias
public interface PerifericosFactory {
    public Raton createRaton(String color, float precio);

    public Cascos createCasco(String color, float precio);
}
