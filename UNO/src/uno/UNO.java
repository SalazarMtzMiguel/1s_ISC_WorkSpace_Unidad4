/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;
import java.util.*;
/**
 *
 * @author Mikec
 */
public class UNO {
        
        public int Arr[]=new int[10];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LlenarArreglo Lle = new LlenarArreglo();
        BuscarArreglo Bu = new BuscarArreglo();
        OrdenarArreglo Or = new OrdenarArreglo();
        SumarColumnas Su = new SumarColumnas();
        int E=0;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
            
                System.out.println("¿Que deseas hacer?"
                        + "\n1.-Llenar Arreglo 10*1"
                        + "\n2.-Buscar en el Arreglo"
                        + "\n3.-Ordenar Arreglo"
                        + "\n4.-Sumar datos"
                        + "\n5.-Finalizar ejecucion"
                        + "\n");
                E=sc1.nextInt();
                switch(E){
                    case 1 :{Lle.Llenar();}
                    case 2 :{Bu.Buscar();}
                    case 3 :{Or.Ordenar();}
                    case 4 :{Su.Sumar();}
                    
                }
            
            
    }
    
}
