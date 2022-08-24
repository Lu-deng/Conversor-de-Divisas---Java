/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LaComputadoraDeEma
 */
public class Operaciones {
    private double valor;
    private int divisa, divisaFinal;
    private double resultado;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getDivisaFinal() {
        return divisaFinal;
    }

    public void setDivisaFinal(int divisaFinal) {
        this.divisaFinal = divisaFinal;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    // Contructor
    
    public Operaciones() {
    }
    
    // operaciones
    
    public double convertir(){
        if(divisaFinal == 0){
          resultado = valor * 292; 
        } else if (divisaFinal == 1){
            resultado = valor * 301;
        } else if (divisaFinal == 2){
            resultado = valor * 1.1;
        } else if (divisaFinal == 3){
            resultado = valor * 0.9;
        }
     return resultado;
    }
}
