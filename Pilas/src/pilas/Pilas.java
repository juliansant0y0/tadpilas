/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;

import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {
        Stack<Integer> bateria = new Stack();
        bateria.push(6);
        bateria.push(4);
        bateria.push(9);
        bateria.push(7);
        bateria.push(8);
        System.out.println(bateria);
        System.out.println("La longitud de la pila es: " + bateria.size());
        System.out.println("La posicion 1 de la pila es: " + bateria.get(1));
        System.out.println("El indice 0 es: " + bateria.elementAt(0));
        System.out.println("Posicion del 9 es: " + bateria.search(9));
        System.out.println("Devuelve el elemento superior de la pila sin eliminarlo: " + bateria.peek());
    }
    
}
