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
public class Menu10x1 {
    
    
    
    public static void Menu10(){
        Acc10 A10=new Acc10();
    
    Scanner sc2 = new Scanner(System.in);
    int R =0;
        do{
        System.out.println("ARREGLO 10*1"
                        + "\n¿Que deseas hacer?"
                        + "\n1.-Llenar Arreglo 10*1"
                        + "\n2.-Ordenar Arreglo"
                        + "\n3.-Eliminar Registro"
                        + "\n4.-Buscar"
                        
                        + "\n5.-Menu inicial"
                        + "\n");
                    R=sc2.nextInt();
                            
                    switch (R){
                        case 1:{A10.Llenar10(); break;}
                        case 2:{A10.Ordenar10();break;}
                        case 3:{A10.Eliminar10();break;}
                        case 4:{A10.Buscar10();break;}
                        case 5:{Arreglo10x1Y4x4.MenuP();;break;}
                        default:{System.out.println("Ingresa una opcion valida");break;}
                        
                    }}while(R!=1&&R!=2&&R!=3&&R!=4);
    }
}
