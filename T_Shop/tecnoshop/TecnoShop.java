package tecnoshop;

import java.util.Scanner;

public class TecnoShop {

    public static void main(String[] args) {
        Pantalla p = new Pantalla();
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0) {
            System.out.println(
                    "Eliga una opcion:\n1-Comprar Ordenador\n2-Reservar Ordenador\n3-Encargar Periferico\n4-Mostrar Stock de Ordenadores\n0-Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    p.mostrarStock();
                    p.comprarOrdenador();
                    break;
                case 2:
                    p.mostrarStock();
                    p.reservarOrdenador();
                    break;
                case 3:
                    p.encargarPeriferico();
                    break;
                case 4:
                    p.mostrarStock();
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
            }
        }

    }
}
