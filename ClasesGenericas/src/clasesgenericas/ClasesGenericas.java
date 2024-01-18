/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesgenericas;

/**
 *
 * @author User
 */
public class ClasesGenericas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Generica<Integer> objetoInt = new Generica(15);
        objetoInt.obtenerTipo();
        Generica<String> objectoString = new Generica("Juan");
        objectoString.obtenerTipo();
    }

}
