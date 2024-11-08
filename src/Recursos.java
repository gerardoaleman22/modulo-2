/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gerar
 */
   public class Recursos {

    
    public String mostrarMensaje() {
        return "Programación Orientada a Objetos";
    }

    
    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    
    public int[] generarListaNumeros(int x) {
        int[] lista = new int[x];
        for (int i = 0; i < x; i++) {
            lista[i] = i + 1;
        }
        return lista;
    }
}
 

