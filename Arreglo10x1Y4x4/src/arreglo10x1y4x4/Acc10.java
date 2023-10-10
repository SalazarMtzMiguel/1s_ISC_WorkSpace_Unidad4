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
public class Acc10 {
    
    public static int C=0,x,z,I=0,Count=0,E=0,Count2=0;
    public static int aux1;
    public static Scanner sc4 = new Scanner(System.in);
    public static Scanner sc5 = new Scanner(System.in);
    public static int Arr10[]=new int[10];
   public static  Scanner sc2 = new Scanner(System.in);
    public static int R =0;
    public static void M10(){
        Scanner sc2 = new Scanner(System.in);
    int R =0;
    do{
        System.out.println("ARREGLO 10*1"
                        + "\n¿Que deseas hacer?"
                        + "\n1.-Llenar Arreglo 10*1"
                        + "\n2.-Ordenar Arreglo"
                        + "\n3.-Eliminar Registro"
                        + "\n4.-Buscar"
                        
                        + "\n5.-Menu inicial (Borrará el arreglo actual)"
                        + "\n");
                    R=sc2.nextInt();
                            
                    switch (R){
                        case 1:{Acc10.Llenar10(); break;}
                        case 2:{Acc10.Ordenar10();break;}
                        case 3:{Acc10.Eliminar10();break;}
                        case 4:{Acc10.Buscar10();break;}
                        case 5:{C=0;Arreglo10x1Y4x4.MenuP();break;}
                        default:{System.out.println("Ingresa una opcion valida");break;}
                        
                    }}while(R!=1&&R!=2&&R!=3&&R!=4);
    }
    
    public static void Llenar10(){
    C++;
        System.out.println("Ingresa 10 numero separados por un enter");
    for(x=0;x<=9;x++){
        I=sc4.nextInt();
        Arr10[x]=I;
    }
    Acc10.M10();
    }
    public static void Buscar10(){
    if(C<1){System.out.println("NO se a llenado el arreglo, Por favor llenalo primero");
    C++;
    for(x=0;x<=9;x++){
        I=sc4.nextInt();
        Arr10[x]=I;
    }
    }
        System.out.println("¿Que numero quieres buscar?");
    I=sc4.nextInt();
    for(x=0;x<=9;x++){
        if(Arr10[x]==I){
        Count++;
            System.out.println(I+" Esta en la posicion "+x);    
        }
    }System.out.println("Hubo un total de "+Count+" Numeros iguales a "+I);
    Acc10.M10();
    }
    public static void Ordenar10(){
    if(C<1){System.out.println("NO se a llenado el arreglo, Por favor llenalo primero");
    C++;
    for(x=0;x<=9;x++){
        I=sc4.nextInt();
        Arr10[x]=I;
    }
    }
    for(x=0;x<=9;x++){
    for(z=1;z<=9;z++){
    if(Arr10[z]<Arr10[x]){
        
    Arr10[z]=aux1;
    Arr10[z]=Arr10[x];
    Arr10[x]=aux1;
    }
    }
    }
    do{
    System.out.println("¿Como los quieres ordenar?"
            + "\n1.-Descendentemente"
            + "\n2.-Ascendentemente");
    E=sc4.nextInt();
    switch(E){
        case 1:{System.out.println("El Orden es el Siguiente:");
           for(x=0;x<=9;x++){
               System.out.println(Arr10[x]);
    } 
            break;}
        case 2:{System.out.println("El Orden es el Siguiente:");
            for(x=9;x>=0;x--){
               System.out.println(Arr10[x]);
    } 
            break;}
        default:{System.out.println("Ingresa una opcion valida");break;}
    }
    }while(E!=1&&E!=2);
    Acc10.M10();
    }
    public static void Eliminar10(){
    if(C<1){System.out.println("NO se a llenado el arreglo, Por favor llenalo primero");
    C++;
    for(x=0;x<=9;x++){
        I=sc4.nextInt();
        Arr10[x]=I;
    }
    }
    System.out.println("¿Que numero quieres Eliminar?");
    I=sc4.nextInt();
    for(x=0;x<=9;x++){
        if(Arr10[x]==I){
        Count2++;
        Arr10[x]=0;
            System.out.println(I+" Se elimino de la posicion "+x);    
        }
    }System.out.println("Hubo un total de "+Count+" Eliminados ");
    
    Acc10.M10();
    }
    
}
