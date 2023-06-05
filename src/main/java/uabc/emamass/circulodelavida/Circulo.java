/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.circulodelavida;
import java.awt.Color;
/**
 *
 * @author poppe
 */
public class Circulo {
    
    double radio;
    String color;
    int posicionX;
    int posicionY;
    
    public Circulo(double rad, String colour, int x, int y){
        this.radio = rad;
        this.color = colour;
        this.posicionX = x;
        this.posicionY = y;
    }
    
    public double getRadio(){
        return this.radio;
    }
    
    @Override
    public String toString(){
        String output;
        output = String.valueOf(radio);
        output = String.format(" %.2f",radio);
        return "Radio = "+output+", Color = "+color+", Posicion X = "+posicionX+", Posicion Y = "+posicionY;
    }
}
