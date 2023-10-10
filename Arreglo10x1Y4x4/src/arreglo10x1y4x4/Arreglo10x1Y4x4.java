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
public class Arreglo10x1Y4x4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] Arg) {
        // TODO code application logic here
        Arreglo10x1Y4x4.MenuP();
        
    }
    public static void MenuP(){
    Menu10x1 M10 = new Menu10x1();
        Menu4x4 M4= new     Menu4x4();    
        int E=0,R=0;
        Scanner sc1 = new Scanner(System.in);
        
        do{
            System.out.println("¿Que Arreglo deseas usar?"
                        + "\n1.-ARREGLO 10*1"
                        + "\n2.-ARREGLO 4*4"
                        + "\n3.-Salir");
                
                E=sc1.nextInt();
                switch(E){
                    case 1 :{
                    M10.Menu10();
                    break;}
                    case 2 :{
                    M4.Menu4();
                    break;}
                    case 3 :{
                    System.exit(0);
                    break;}
                    default:{System.out.println("Ingresa una opcion valida");break;}
                    
                }}while(E!=1&&E!=2&&E!=3);
    }
    
}
