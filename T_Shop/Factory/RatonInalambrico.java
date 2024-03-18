/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.util.Objects;

/**
 *
 * @author pilar
 */
//clase para raton inalambrico
public class RatonInalambrico implements Raton{
    
    private String color;
    private float precio;

    public RatonInalambrico(String color, float precio) {
        this.color = color;
        this.precio = precio;
    }
    
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
    
    @Override
    public float getPrecio(){
        return precio;
    }

    @Override
    public String toString() {
        return "Raton Inalambrico" + "\nColor: " + color + "\nPrecio:" + precio;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }//Si son del mismo tipo de perifericos y conexion y tienen el mismo color de devuelve true
        if (getClass() == obj.getClass() && color.equals(((Raton)obj).getColor())) {
            return true;
        }
        return false;
    }
    
}
