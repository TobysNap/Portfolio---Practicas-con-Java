package com.tobiasnapal.practicavectores;

import java.util.Scanner;

/**
 *
 * @author Tobias Napal
 */
public class PracticaVectores {
    public static void main(String args[]) {
        int[] dni = {23765786, 94812038, 43654976};
        String[] nombre = {"Juan", "Marcos", "Alexis"};
        String[] apellido = {"Pérez", "González", "Rodríguez"};
        for (int i = 0; i<dni.length; i++) {
            System.out.println("Posición " + i + ": " + dni[i] + " " + nombre[i] + " " + apellido[i]);
        }
    }
}
}