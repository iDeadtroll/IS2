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
//Interfaz para clase ordenador
public interface Ordenador {
    public String getNombre();
    public void setNombre(String Nombre);
    public int getCantidad();
    public void setCantidad(int cantidad);
    public float getPrecio();
}
