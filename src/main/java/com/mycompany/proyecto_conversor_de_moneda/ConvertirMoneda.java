/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.proyecto_conversor_de_moneda;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author Mauricio Echeverria Rodriguez
 */
public class ConvertirMoneda{
    DecimalFormat decimales = new DecimalFormat("####.####");
    TasaDeCambio moneda = new TasaDeCambio();

    public ConvertirMoneda(double cantidad) {
        String opciones = (JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir tu dinero: ", "moneda",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Pesos A Dolares", "Pesos A Euros", "Pesos a Libras Esterlinas", "Pesos A Yen Japones", "Pesos a Won Coreano",
                    "Dolares A Pesos", "Euros A Pesos", "Libras Esterlinas A Pesos", "Yen Japones A Pesos", "Won Coreano A Pesos"}, "Pesos A Dolares")).toString();

        switch (opciones) {
            case "Pesos A Dolares":
                convertirAPeso(moneda.getDolar(), "Dolares", cantidad);
                break;
            case "Pesos A Euros":
                convertirAPeso(moneda.getEuro(), "Euros", cantidad);
                break;
            case "Pesos a Libras Esterlinas":
                convertirAPeso(moneda.getLibra(), "Libras Esterlinas", cantidad);
                break;
            case "Pesos A Yen Japones":
                convertirAPeso(moneda.getYen(), "Yen Japones", cantidad);
                break;
            case "Pesos a Won Coreano":
                convertirAPeso(moneda.getWon(), "Won Coreno", cantidad);
                break;
            case "Dolares A Pesos":
                convertirPesoA(moneda.getDolar(), cantidad);
                break;
            case "Euros A Pesos":
                convertirPesoA(moneda.getEuro(), cantidad);
                break;
            case "Libras Esterlinas A Pesos":
                convertirPesoA(moneda.getLibra(), cantidad);
                break;
            case "Yen Japones A Pesos":
                convertirPesoA(moneda.getYen(), cantidad);
                break;
            case "Won Coreano A Pesos":
                convertirPesoA(moneda.getWon(), cantidad);
                break;
        }
    }

    public void convertirAPeso(double tasaDeCambio, String moneda, double monto) {
        JOptionPane.showMessageDialog(null, "Tienes $" + decimales.format(monto * 1 / tasaDeCambio) + " " + moneda);
    }

    public void convertirPesoA(double tasaDeCambio, double monto) {
        JOptionPane.showMessageDialog(null, "Tienes $" + decimales.format(tasaDeCambio * monto / 1) + " Pesos Colombianos");
    }
}
