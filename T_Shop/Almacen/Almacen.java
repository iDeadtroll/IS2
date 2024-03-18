/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen;

import Ordenador.Strategy;
import java.util.Iterator;

/**
 *
 * @author pilar
 */
//Interfaz de Almacen
public interface Almacen {
    public Strategy Comprar(String nombre, int cantidad);
    public Strategy Reservar(String nombre, int cantidad);
    public Iterator Stock();
    public float encargar(int periferico, int tipo, String color);
}
