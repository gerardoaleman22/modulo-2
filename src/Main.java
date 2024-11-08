/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gerar
 */
    public class Main {

    public static void main(String[] args) {
        
        Recursos recursos = new Recursos();
        
        
        System.out.println(recursos.mostrarMensaje());

       
        int edad = 20; 
        System.out.println("Edad: " + edad + " - " + recursos.verificarEdad(edad));

        
        int num1 = 5;
        int num2 = 3;
        System.out.println("Multiplicación de " + num1 + " y " + num2 + ": " + recursos.multiplicar(num1, num2));

        
        int x = 10;
        int[] listaNumeros = recursos.generarListaNumeros(x);
        System.out.print("Lista de números del 1 al " + x + ": ");
        for (int num : listaNumeros) {
            System.out.print(num + " ");
        }
    }
}


