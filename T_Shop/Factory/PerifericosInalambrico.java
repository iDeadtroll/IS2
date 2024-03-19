package Factory;

// Clase factoria para perifericos inalambricos. Se llamara a esta clase para
// crear objetos inalambricos
public class PerifericosInalambrico implements PerifericosFactory {

    @Override
    public Raton createRaton(String color, float precio) {
        return new RatonInalambrico(color, precio);
    }

    @Override
    public Cascos createCasco(String color, float precio) {
        return new CascosInalambrico(color, precio);
    }

}
