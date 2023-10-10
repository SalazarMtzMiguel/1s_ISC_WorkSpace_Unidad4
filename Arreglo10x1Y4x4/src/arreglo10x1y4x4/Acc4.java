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
public class Acc4 {
    
    public static int C=0,x,I=0,z,f=0,w=0,g=0;
    public static Scanner sc4 = new Scanner(System.in);
    public static Scanner sc5 = new Scanner(System.in);
    public static int Arr4x4[][]=new int[4][4];
    public static String Cad="";
    public static Arreglo10x1Y4x4 MP = new Arreglo10x1Y4x4();
    public static Scanner sc3 = new Scanner(System.in);
    public static int R=0;
    
    public static void M4(){
        do{
        System.out.println("\nARREGLO 4*4"
                        + "\n¿Que deseas hacer?"
                        + "\n1.-Llenar Arreglo 4*4"
                        + "\n2.-Buscar"
                        + "\n3.-Eliminar Registro"
                        + "\n4.-Suma de datos primos"
                        
                        + "\n5.-Menu Inicial (Borrará el arreglo actual)"
                        + "\n");
                    R=sc3.nextInt();
                    switch (R){
                        case 1:{Acc4.Llenar4(); break;}
                        case 2:{Acc4.Buscar4(); break;}
                        case 3:{Acc4.Eliminar4(); break;}
                        case 4:{Acc4.SumPrimos(); break;}
                        case 5:{C=0;Arreglo10x1Y4x4.MenuP();;break;}
                        default:{System.out.println("Ingresa una opcion valida");break;}
                        
                    }}while(R!=1&&R!=2&&R!=3&&R!=4);
    }
    
    
    public static void Llenar4(){
    System.out.println("Llene el arreglo, recuerda que es 4x4");
    C++;
    for(x=0;x<=3;x++){
        for (z=0;z<=3;z++){
        I=sc4.nextInt();
        Arr4x4[x][z]=I;
    }}
    Acc4.M4();
    }
    public static void Buscar4(){
    if(C<1){System.out.println("NO se a llenado el arreglo, Llene el arreglo, recuerda que es 4x4");
    C++;
    for(x=0;x<=3;x++){
        for (z=0;z<=3;z++){
        I=sc4.nextInt();
        Arr4x4[x][z]=I;
    }}
    }
        System.out.println("Ingresa el numero a buscar");
        I=sc4.nextInt();
        for(x=0;x<=3;x++){
        for (z=0;z<=3;z++){
        if (I==Arr4x4[x][z]){
            f++;
            Cad=Cad+"El numero: "+I+" esta en la posicion "+"["+x+"]["+z+"]"+"\n";
            
        }
    }}
        System.out.println("Se encontraron "+ f+" numeros");
        System.out.println(Cad);
        Acc4.M4();
    }
    public static void SumPrimos(){
        int Co,CP=0,Cp=-1,Sum=0,p;
        int Arr16 []= new int [16];
    if(C<1){System.out.println("NO se a llenado el arreglo, Llene el arreglo, recuerda que es 4x4");
    C++;
    for(x=0;x<=3;x++){
        for (z=0;z<=3;z++){
        I=sc4.nextInt();
        Arr4x4[x][z]=I;
    }}
    }
    for(x=0;x<=3;x++){
        for (z=0;z<=3;z++){
             CP=0;
             for(w=1;w<=(Arr4x4[x][z]);w++){
             if(Arr4x4[x][z]%w==0){
                 
             CP++;
             }
             if (CP==2){
                 
                 Sum=Sum+(Arr4x4[x][z]);}
             }
        
        
    }}
    
   
    
    System.out.println("La suma de los primos es: "+Sum);
    Acc4.M4();
    }
    public static void Eliminar4(){
    if(C<1){System.out.println("NO se a llenado el arreglo, Llene el arreglo, recuerda que es 4x4");
    C++;
    for(x=0;x<=3;x++){
        for (z=0;z<=3;z++){
        I=sc4.nextInt();
        Arr4x4[x][z]=I;
    }}
    }
    System.out.println("Ingresa el numero a Eliminar");
        I=sc4.nextInt();
        for(x=0;x<=3;x++){
        for (z=0;z<=3;z++){
        if (I==Arr4x4[x][z]){
            f++;
            Cad=Cad+"El numero: "+I+" esta en la posicion "+"["+x+"]["+z+"]"+"\n";
            Arr4x4[x][z]=0;
        }
    }}
        System.out.println("Se encontraron "+ f+" numeros");
        System.out.println(Cad);
        System.out.println("Todas las cantidades se sustituyeron por 0");
      Acc4.M4();  
    }
}
