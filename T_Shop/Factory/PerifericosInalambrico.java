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
//Clase factoria para perifericos inalambricos. Se llamara a esta clase para crear objetos inalambricos
public class PerifericosInalambrico implements PerifericosFactory{

    @Override
    public Raton createRaton(String color, float precio) {
        return new RatonInalambrico(color, precio);
    }

    @Override
    public Cascos createCasco(String color, float precio) {
        return new CascosInalambrico(color, precio);
    }
    
}
