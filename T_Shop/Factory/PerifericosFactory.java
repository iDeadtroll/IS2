/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author pilar
 */
//Interfaz para las factorias
public interface PerifericosFactory {
    public Raton createRaton(String color, float precio);
    public Cascos createCasco(String color, float precio);
}
