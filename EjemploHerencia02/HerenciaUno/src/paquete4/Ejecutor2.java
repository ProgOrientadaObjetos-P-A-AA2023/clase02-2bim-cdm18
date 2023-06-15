/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // 1. Crear y presentar un obj de tipo Estudiante Presencial
        String nombre = "Carlos Daniel";
        String apellido = "Mejia Febres";
        String identificacion = "110012";
        int edad = 19;

        EstudiantePresencial estP = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);

        estP.establecerCostoCredito(50.5);
        estP.establecerNumeroCreditos(5);
        estP.calcularMatriculaPresencial();

        System.out.println(estP);

    }
}
