package Factory;

//Clase para raton con cable
public class RatonCable implements Raton {
    private String color;
    private float precio;

    public RatonCable(String color, float precio) {
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
    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Raton con conexion por cable" + "\nColor: " + color + "\nPrecio:" + precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } // Si son del mismo tipo de perifericos y conexion y tienen el mismo color de
          // devuelve true
        if (getClass() == obj.getClass() && color.equals(((Raton) obj).getColor())) {
            return true;
        }
        return false;
    }

}
