/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuv;
import java.util.*;
/**
 *
 * @author Mikec
 */
public class Menu3 {
    
    public static void M3(){
        int E=0,R=0;
        Scanner sc1 = new Scanner(System.in);
        
        do{
            System.out.println("MENU ARREGLO 3X3"
                    + "\n¿Que tipo de datos quieres usar?"
                        + "\n1.-Enteros (int)"
                        + "\n2.-Double(double)"
                        + "\n3.-Menu inicial");
                
                E=sc1.nextInt();
                switch(E){
                    case 1 :{
                    Acc3I.M3I();
                    break;}
                    case 2 :{
                    Acc3D.M3D();
                    break;}
                    case 3 :{
                    ExamenUV.MenuP();
                    break;}
                    default:{System.out.println("Ingresa una opcion valida");break;}
                    
                }}while(E!=1&&E!=2&&E!=3);
    }
}
