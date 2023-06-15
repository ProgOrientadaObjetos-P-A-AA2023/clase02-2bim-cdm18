/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // 1. Crear y presentar un obj de tipo Estudiante Presencial,
        // con datos por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        EstudiantePresencial array[] = new EstudiantePresencial[4];
        int contador = 0;

        while (contador < 4) {
            System.out.println("Ingrese nombre");
            String n = entrada.nextLine();
            System.out.println("Ingrese apellido");
            String ap = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String ced = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese número de créditos");
            int creditos = entrada.nextInt();
            System.out.println("Ingrese costo de créditos");
            double costo = entrada.nextInt();
            System.out.println("");

            array [contador]= new EstudiantePresencial(n, ap, ced,
                    edad, creditos, costo);
            array [contador].calcularMatriculaPresencial();
            
            entrada.nextLine();
            contador++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            System.out.println("-------------------------------------------");
        }
    }
}
