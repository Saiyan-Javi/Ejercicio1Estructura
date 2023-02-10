//
// Programa uso del patron 
//     Factory Patron
//

import java.util.Scanner;

public class UsoPatron {
    public static void main(String[] args) {
        NotasExamen Calificaciones = new NotasExamen();
        Scanner teclado = new Scanner (System.in);
        String cadena;
        String menu1 = "Bienvenido, elija una de las siguientes:\n1. Agregar nuevo alumno/nota\n2. Ver notas Aprobados\n3. Ver notas Reprobados";
        int opc1 = 0;
        System.out.println(menu1);
        opc1 = teclado.nextInt();
        teclado.nextLine();
        while(opc1<0 || opc1>3){
            System.out.println("Opcion invalida");
            System.out.println(menu1);
            opc1 = teclado.nextInt();
            teclado.nextLine();
        }
        while(opc1>1 && opc1>4){
            switch(opc1){
                case 1:{
                    System.out.print("Ingrese nota,nombre o nombre nota ");
                    cadena = teclado.nextLine();
                    System.out.println("leyo: "+cadena);
            
                    // instanciar la Factory:
                    NameFactory nfactory = new NameFactory(); 
                     
                     // la Factory instancia la clase adecuada:
                     // a. nombre apellido
                     // b. apellido,nombre
                    Namer namer = nfactory.getNamer(cadena);
                    
                    System.out.println("Nombre alumno: "+ namer.getFirst());
                    System.out.println("Nota: " + namer.getLast());
                    
                    if(Integer.parseInt(namer.getLast()) <= 60){
                        //Calificaciones.agregarEstudiante(0, namer.getFirst(), namer.getLast());
                    }
                    else{
                        //Calificaciones.agregarEstudiante(1, namer.getFirst(), namer.getLast());
                    }
                }
                case 2:{

                }
                case 3:{
                    
                }
            }
        }
    }
}