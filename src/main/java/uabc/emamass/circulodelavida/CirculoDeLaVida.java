/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uabc.emamass.circulodelavida;
import java.awt.Color; 
/**
 *
 * @author poppe
 */
public class CirculoDeLaVida {

    public static void main(String[] args) {
        ListaCirculos lc = new ListaCirculos();
        System.out.println("Vamos a ver si existen circulos dentro de la lista");
        System.out.println(lc.mostrarCirculos());
        lc.llenarAleatorio(3);
        System.out.println("Se genero 3 circulos aleatoriamente");
        System.out.println(lc.mostrarCirculos());
        lc.agregarCirculo(new Circulo(23.0,"red",100,200));
        System.out.println("Se agrego un nuevo circulo");
        System.out.println(lc.mostrarCirculos());
        lc.cambiarCirculo(1, new Circulo(10.0,"azul",400,200));
        System.out.println("Se cambio el circulo en posicion 2");
        System.out.println(lc.mostrarCirculos());
        lc.eliminarCirculo(1);
        System.out.println("Se elimino el circulo en posicion 2");
        System.out.println(lc.mostrarCirculos());
        System.out.println("Calculo de las areas de todos los circulos");
        System.out.println(lc.calcularAreaPromedio());
        lc.borrarLista();
        System.out.println("Se elimino todos los circulos de la lista");
        System.out.println(lc.mostrarCirculos());
        lc.llenarAleatorio(1);
        System.out.println("Se agrego un nuevo circulo aleatorio");
        System.out.println(lc.mostrarCirculos());
        
    }
}
