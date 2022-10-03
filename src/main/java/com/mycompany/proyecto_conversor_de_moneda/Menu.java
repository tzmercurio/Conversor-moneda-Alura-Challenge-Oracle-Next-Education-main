/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_conversor_de_moneda;

import javax.swing.JOptionPane;
/**
 *
 * @author Mauricio Echeverria Rodriguez
 */
public class Menu {
    
    public static void main(String[] args) {
    //Start Function
        String opciones = ""; //Almacena la Opcion del Usuario
        double cantidad = 0; //Almacena la cantidad ingresada por el usuario
        boolean menu = true; //Mantiene al usuario dentro del bucle de ejecucion del programa
        boolean cantidadCorrecta = false; //Mantiene al usuario dentro del bucle de validacion de cantidad

        while (menu) {
            cantidadCorrecta = false; //setea la variable cada que se reinicia el bucle
            opciones = (JOptionPane.showInputDialog(null, "Seleccione una Opcion de Conversion: ", "moneda",
                    JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moneda", "Conversor de Temperatura"}, "Conversor de Moneda")).toString();

            while (!cantidadCorrecta) {//si la cantidad no es true
                try {
                    cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Cantidad: "));
                    cantidadCorrecta = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Cantidad Incorrecta");
                }
            }

            if (opciones.equals("Conversor de Moneda")) {
               ConvertirMoneda conversorMoneda = new ConvertirMoneda(cantidad);
            } else if (opciones.equals("Conversor de Temperatura")) {
               ConvertirTemperatura conversorTemperatura = new ConvertirTemperatura(cantidad);
            }

            int deseaSalir = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");

            if (deseaSalir == 1 || deseaSalir == 2) {
                JOptionPane.showMessageDialog(null, "Programa Terminado \n Gracias Por Usar Nuestro Conversor Alura");
                menu = false; //Salir del bucle de Ejecucion del programa
            }
        }
     //End Function
    }
}
