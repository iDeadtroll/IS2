package Factory;

//Factoria para perifericos con cable. Se llamara a esta clase para crear un objeto con cable
public class PerifericosCable implements PerifericosFactory {

    @Override
    public Raton createRaton(String color, float precio) {
        return new RatonCable(color, precio);
    }

    @Override
    public Cascos createCasco(String color, float precio) {
        return new CascosCable(color, precio);
    }

}
