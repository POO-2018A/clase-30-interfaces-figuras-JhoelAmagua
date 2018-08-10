/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author SERVER
 */
public class Cuadrado implements Interfaz{

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculararea() {
        return (lado*lado);
    }

    @Override
    public double calcularperimetro() {
        return (4*lado);
    }
    
}
