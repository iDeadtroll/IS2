package Ordenador;

//Interfaz estrategia. se tomaran objetos estrategia y de inicializaran a OrdenadorVenta u OrdenadorReserva segun
//los intereses del cliente
public interface Strategy {
    Strategy solicitar(int cantidad);

    String getStrategy();
}
