/*
 */
package actividad.pkg2.horarios.parte.pkg3;

import java.util.Scanner;
/**
 *
 * @author Michael Adael Salvador Cocom
 * https://github.com/LightninM
 */
public class Actividad2HorariosParte3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa el numero del mes:");
        int mes=entrada.nextInt();
        switch (mes){
            case 1,2,3 -> System.out.println("PRIMER TRIMESTRE");
            case 4,5,6 -> System.out.println("SEGUNDO TRIMESTRE");
            case 7,8,9 -> System.out.println("TERCER TRIMESTRE");
            case 10,11,12 -> System.out.println("CUARTO TRIMESTRE");
            default -> System.out.println("Numero incorrecto");
                    
        }
        
        
    }
    
}