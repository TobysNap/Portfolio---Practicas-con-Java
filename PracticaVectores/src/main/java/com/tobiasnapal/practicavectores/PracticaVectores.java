package com.tobiasnapal.practicavectores;

import java.util.Scanner;

/**
 *
 * @author Tobias Napal
 */
public class PracticaVectores {
    public static void main(String[] args) {
    int[] vector = {1, 25, 43};
    int min = vector[0];
    int max = vector[0];
    for (int i = 1; i<vector.length; i++){
       min = Math.min(min, vector[i]);
       max = Math.max(max, vector[i]);
        }
    System.out.println("La menor edad entre los estudiantes es de: " + min + " años");
    System.out.println("La mayor edad entre los estudiantes es de: " + max + " años");
    }
}
