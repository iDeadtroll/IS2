
package Almacen;

import Ordenador.Strategy;
import java.util.Iterator;

//Interfaz de Almacen
public interface Almacen {
    public Strategy Comprar(String nombre, int cantidad);

    public Strategy Reservar(String nombre, int cantidad);

    public Iterator<Strategy> Stock();

    public float encargar(int periferico, int tipo, String color);
}
