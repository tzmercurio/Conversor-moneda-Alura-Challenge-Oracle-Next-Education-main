/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_conversor_de_moneda;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author Mauricio Echeverria
 */
public class ConvertirTemperatura {

    DecimalFormat decimales = new DecimalFormat("00.000");

    public ConvertirTemperatura(double grados) {
        String opciones = (JOptionPane.showInputDialog(null, "Elige la Temperatura que Deseas Convertir: ", "temperatura",
        JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Farenheit A Celsius", "Farenheit A Kelvin", "Celsius A Farenheit", "Celsius A Kelvin", "Kelvin A Celsius", "Kelvin A Farenheit"}, "Farenheit A Celsius")).toString();

        switch (opciones) {
            case "Farenheit A Celsius":
                farenheitACelsius(grados);
                break;
            case "Farenheit A Kelvin":
                farenheitAKelvin(grados);
                break;
            case "Celsius A Farenheit":
                celsiusAFarenheit(grados);
                break;
            case "Celsius A Kelvin":
                celsiusAKelvin(grados);
                break;
            case "Kelvin A Celsius":
                kelvinACelsius(grados);
                break;
            case "Kelvin A Farenheit":
                kelvinAFarenheit(grados);
                break;
        }
    }

    public void farenheitACelsius(double grados) {
        imprimirResultado(decimales.format(((grados - 32) / 1.8)) + " °C");
    }

    public void farenheitAKelvin(double grados) {
        imprimirResultado(decimales.format(((grados - 32) / 1.8) + 273) + " °K");
    }

    public void celsiusAFarenheit(double grados) {
        imprimirResultado(decimales.format(((1.8 * grados) + 32)) + " °F");
    }

    public void celsiusAKelvin(double grados) {
        imprimirResultado(decimales.format(grados + 273.15) + " °K");
    }

    public void kelvinACelsius(double grados) {
        imprimirResultado(decimales.format(grados - 273.15) + " °C");
    }

    public void kelvinAFarenheit(double grados) {
        imprimirResultado(decimales.format(((grados - 273.15) * 1.8) + 32) + " °F");
    }
    
    public void imprimirResultado(String resultado){
        JOptionPane.showMessageDialog(null,"Tienes "+resultado);
    }
}
