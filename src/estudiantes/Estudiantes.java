/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiantes;

/**
 *
 * @author Usuario
 */
public class Estudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        {
        String[] estudiantes = {"Daniel", "Monica"};
        int[] notas = {65, 89};

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Nombre: " + estudiantes[i]);
            System.out.println("Nota: " + notas[i]);
            if (notas[i] >= 70) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }
            System.out.println("------------------------");
        }
     
    }
    
