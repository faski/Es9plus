package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //int[] numeri = new int[3];

        int n = Integer.parseInt(JOptionPane.showInputDialog("Quanti numeri vuoi inserire?"));

        int[] numeri = new int[n];

        for (int i = 0; i < n; i++) {
            numeri[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero:"));
        }

        int max = numeri[0];

        for (int i = 1; i < n; i++){
            if ( max < numeri[i])
                max = numeri[i];
        }


        double media = 0;

        for (int i = 0; i < n; i++){
            media = media + numeri[i];
        }

        media = media / n;

        JOptionPane.showMessageDialog(null, "Il massimo è " + max + " e la media è " + media);
    }
}
