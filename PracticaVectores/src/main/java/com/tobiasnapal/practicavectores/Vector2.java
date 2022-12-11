package com.tobiasnapal.practicavectores;

/**
 *
 * @author Tobias Napal
 */
public class Vector2 {
    public static void main(String[] args) {
        int[] vector = new int[15];
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
