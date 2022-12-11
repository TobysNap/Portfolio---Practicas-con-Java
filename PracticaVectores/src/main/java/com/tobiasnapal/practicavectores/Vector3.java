/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tobiasnapal.practicavectores;

/**
 *
 * @author Tobias Napal
 */
public class Vector3 {
    public static void main(String args[]) {
        int[] dni = {23765786, 94812038, 43654976};
        String[] nombre = {"Juan", "Marcos", "Alexis"};
        String[] apellido = {"Pérez", "González", "Rodríguez"};
        for (int i = 0; i<dni.length; i++) {
            System.out.println("Posición " + i + ": " + dni[i] + " " + nombre[i] + " " + apellido[i]);
        }
    }
}
