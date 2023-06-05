/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.circulodelavida;
import java.util.ArrayList;
import java.util.Random;

/*
 *
 * @author poppe
 */
public class ListaCirculos {
    ArrayList<Circulo> misCirculos;
    ArrayList<String> colores;
    public ListaCirculos(){
        misCirculos = new ArrayList();
        colores = new ArrayList<String>(){
            {
                add("red");
                add("green");
                add("blue");
                add("orange");
                add("yellow");
            }
        };
    }
    
    public void llenarAleatorio(int cantidad){
        Random rmd =  new Random();
        for(int i = 0; i < cantidad; i++){
            misCirculos.add(new Circulo(rmd.nextDouble()*10,colores.get(rmd.nextInt(5)),rmd.nextInt(500),rmd.nextInt(500)));
        }
    }
    
    public void agregarCirculo(Circulo cr){
        misCirculos.add(cr);
    }
    
    public void cambiarCirculo(int posicion, Circulo cr){
        misCirculos.set(posicion, cr);
    }
    
    public void eliminarCirculo(int posicion){
        misCirculos.remove(posicion);
    }
    
    public void borrarLista(){
        misCirculos.clear();
    }
    
    public String calcularAreaPromedio(){
        double area = 0.0;
        String output;
        for(int i = 0; i < misCirculos.size(); i++){
            area += misCirculos.get(i).getRadio();
        }
        area = area / misCirculos.size();
        output = String.valueOf(area);
        output = String.format("%.2f", area);
        return output;
    }
    
    public String mostrarCirculos(){
        String cadena = "";
        for(int i = 0; i < misCirculos.size(); i++){
            cadena += (i+1)+". "+misCirculos.get(i).toString()+"\n";
        }
        if(misCirculos.size() == 0){
            cadena = "No existen circulos en la lista";
        }
        return cadena;
    }
}
