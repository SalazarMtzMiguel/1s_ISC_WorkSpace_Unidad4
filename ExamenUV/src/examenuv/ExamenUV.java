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
public class ExamenUV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExamenUV.MenuP();
    }
    public static void MenuP(){
        int E=0,R=0;
        Scanner sc1 = new Scanner(System.in);
        
        do{
            System.out.println("¿Que Arreglo deseas usar?"
                        + "\n1.-ARREGLO 5*1"
                        + "\n2.-ARREGLO 3*3"
                        + "\n3.-Salir");
                
                E=sc1.nextInt();
                switch(E){
                    case 1 :{
                    Menu5.M5();
                    break;}
                    case 2 :{
                    Menu3.M3();
                    break;}
                    case 3 :{
                    System.exit(0);
                    break;}
                    default:{System.out.println("Ingresa una opcion valida");break;}
                    
                }}while(E!=1&&E!=2&&E!=3);
    }
    
}
