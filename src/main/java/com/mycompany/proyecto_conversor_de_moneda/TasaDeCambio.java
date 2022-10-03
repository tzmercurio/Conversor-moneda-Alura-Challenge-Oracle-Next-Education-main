/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_conversor_de_moneda;

/**
 *
 * @author Mauricio Echeverria Rodriguez
 */
public class TasaDeCambio {
    //Valores por Defecto
    private double dolar = 4375.28;
    private double euro = 4391.14;
    private double libra = 5171.24;
    private double yen = 31.9413;
    private double won = 3.27512;
    
    //Dolar Estadounidense
    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }
   //Euros
    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }
    //Libras Esterlinas
    public double getLibra() {
        return libra;
    }

    public void setLibra(double libra) {
        this.libra = libra;
    }
   //Yen Japones
    public double getYen() {
        return yen;
    }

    public void setYen(double yen) {
        this.yen = yen;
    }
    //Won Coreano
    public double getWon() {
        return won;
    }    

    public void setWon(double won) {
        this.won = won;
    }
    
}
