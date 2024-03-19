package tecnoshop;

import Almacen.Almacen;
import Almacen.AlmacenImp;
import Ordenador.Ordenador;
import Ordenador.OrdenadorReserva;
import Ordenador.Strategy;
import java.util.Iterator;

public class Controladora {

    // comprar, reservar, encargar periferico
    private Almacen almacen;

    public Controladora() {
        almacen = AlmacenImp.getInstance(); // Creamos el almacén y aplicamos Patron Singleton
    }

    public float comprarOrdenador(String nombre, int cantidad) {
        float total = 0;

        Strategy pedido = almacen.Comprar(nombre, cantidad);
        if (pedido != null) {
            Ordenador ordenador = (Ordenador) pedido;
            total += ordenador.getCantidad() * ordenador.getPrecio();
        } else {
            total = -2;
        }

        return total;
    }

    float reservarOrdenador(String nombre, int cantidad) { // cantidad de dias de reserva
        Strategy reserva = almacen.Reservar(nombre, cantidad);
        float total = 0;

        if (reserva != null) {
            Ordenador ordenador = (Ordenador) reserva;
            ((OrdenadorReserva) ordenador).setDias(cantidad);
            total += cantidad * (ordenador.getPrecio() / 15);
        } else {
            total = -2;
        }

        return total;

    }

    float encargarPeriferico(int periferico, int tipo, String color) {
        float encargo = almacen.encargar(periferico, tipo, color);

        return encargo;
    }

    Iterator<Strategy> mostrarStock() {
        return almacen.Stock();
    }
}
