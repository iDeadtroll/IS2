/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnoshop;
//Clase Main
import Ordenador.Ordenador;
import Ordenador.OrdenadorReserva;
import Ordenador.OrdenadorVenta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pilar
 */
public class TecnoShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pantalla p = new Pantalla();
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        while(opcion != 0){
            System.out.println("Eliga una opcion:\n1-Comprar Ordenador\n2-Reservar Ordenador\n3-Encargar Periferico\n4-Mostrar Stock de Ordenadores\n0-Salir");
            opcion = sc.nextInt();
            switch(opcion){
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
