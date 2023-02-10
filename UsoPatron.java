//
// Programa uso del patron 
//     Factory Patron
//

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class UsoPatron {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String cadena;
   
        System.out.print("Ingrese apellido,nombre o nombre apellido ");
        cadena = teclado.nextLine();
        System.out.println("leyo: "+cadena);

        // instanciar la Factory:
        NameFactory nfactory = new NameFactory(); 
         
         // la Factory instancia la clase adecuada:
         // a. nombre apellido
         // b. apellido,nombre
         Namer namer = nfactory.getNamer(cadena);
         
        
        System.out.println("Nombre: "+ namer.getFirst());
        System.out.println("Nota: " + namer.getLast());

        ArrayList<Integer> arr = new ArrayList();

    /*arr.sort(arr) {
        ArrayList<Integer> sortedNumbers = new ArrayList<>();
        sortedNumbers.addAll(numbers);*/

        }
    }
