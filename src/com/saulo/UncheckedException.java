package com.saulo;

import javax.swing.*;

public class UncheckedException {

    public static void main(String[] args) {

        boolean continueLooping = true;

        do {
            String numerador = JOptionPane.showInputDialog("Numerador: ");
            String denominador = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(numerador),Integer.parseInt(denominador));
                System.out.println("Resultado = " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Entrada inválida. Informe um número inteiro." + e.getMessage());
                e.printStackTrace();
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null,
                        "Entrada inválida. Impossível dividor por 0." + e.getMessage());
                e.printStackTrace();

            } finally {
                System.out.println("Entrou no finaly");
            }

        } while(continueLooping);




        System.out.println("O código continua!");
    }

    private static int dividir(int numerador, int denominador) {
        return numerador/denominador;
    }

}
