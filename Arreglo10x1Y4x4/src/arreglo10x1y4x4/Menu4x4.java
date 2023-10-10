/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo10x1y4x4;

import java.util.*;

/**
 *
 * @author Mikec
 */
public class Menu4x4 {
    
    
    public static void Menu4(){
        Acc4 A4=new Acc4();
    Arreglo10x1Y4x4 MP = new Arreglo10x1Y4x4();
    Scanner sc3 = new Scanner(System.in);
    int R=0;
        do{
        System.out.println("\nARREGLO 4*4"
                        + "\n¿Que deseas hacer?"
                        + "\n1.-Llenar Arreglo 4*4"
                        + "\n2.-Buscar"
                        + "\n3.-Eliminar Registro"
                        + "\n4.-Suma de datos primos"
                        
                        + "\n5.-Menu Inicial"
                        + "\n");
                    R=sc3.nextInt();
                    switch (R){
                        case 1:{A4.Llenar4(); break;}
                        case 2:{A4.Buscar4(); break;}
                        case 3:{A4.Eliminar4(); break;}
                        case 4:{A4.SumPrimos(); break;}
                        case 5:{Arreglo10x1Y4x4.MenuP();;break;}
                        default:{System.out.println("Ingresa una opcion valida");break;}
                        
                    }}while(R!=1&&R!=2&&R!=3&&R!=4);
    }
}
