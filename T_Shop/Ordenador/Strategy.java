/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenador;

/**
 *
 * @author pilar
 */
//Interfaz estrategia. se tomaran obgetor estrategia y de inicializaran a OrdenadorVenta u OrdenadorReserva segun
//los intereses del cliente
public interface Strategy {
    Strategy solicitar(int cantidad);
    String getStrategy();
}
