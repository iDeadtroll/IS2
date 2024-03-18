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
//Factoria para perifericos con cable. Se llamara a esta clase para crear un objeto con cable
public class PerifericosCable implements PerifericosFactory{

    @Override
    public Raton createRaton(String color, float precio) {
        return new RatonCable(color, precio);
    }

    @Override
    public Cascos createCasco(String color, float precio) {
        return new CascosCable(color, precio);
    }
    
}
