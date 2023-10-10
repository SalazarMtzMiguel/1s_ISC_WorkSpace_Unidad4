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
public class Acc3D {
    public static int x,z,C=0;
    public static Scanner sc1 = new Scanner(System.in);
    public static Double Arr3x3[][]=new Double[3][3],I,Sum;
    public static void M3D(){
    int E=0,R=0;
        Scanner sc1 = new Scanner(System.in);
        
        do{
            System.out.println("ARREGLO 3x3 DOUBLE"
                    + "\n¿Que quieres hacer?"
                    + "\n0.-Llenar"
                        + "\n1.-Sumar Elementos por columnas"
                        + "\n2.-Sumar elementos por filas"
                        + "\n3.-Sumar datos en diagonal principal"
                    + "\n4.-Promedio de los elementos del arreglo"
                    + "\n5.-Menu de seleccion de tipo de datos"
                    + "\n6.-Finalizar");
                
                E=sc1.nextInt();
                switch(E){
                    case 0 :{
                    Acc3D.Llenar();
                    break;}
                    case 1 :{
                    Acc3D.SColumna();
                    break;}
                    case 2 :{
                    Acc3D.SFilas();
                    break;}
                    case 3 :{
                    Acc3D.SDiagonal();
                    break;}
                    case 4 :{
                    Acc3D.Promedio();
                    break;}
                    case 5 :{
                    Menu3.M3();
                    break;}
                    case 6 :{
                    System.exit(0);
                    break;}
                    default:{System.out.println("Ingresa una opcion valida");break;}
                    
                }}while(E!=1&&E!=2&&E!=3);
    }
    public static void Llenar(){
    C++;
        System.out.println("Ingrese 9 numeros separados por un enter");
        for(x=0;x<=2;x++){
            for(z=0;z<=2;z++){
        I=sc1.nextDouble();
        Arr3x3[x][z]=I;}}
    Acc3D.M3D();}
    public static void SColumna(){Sum=0.0;Double Sum1=0.0, Sum2=0.0,Sum3=0.0;
    if(C<1){C++;System.out.println("No lleno el arreglo, Llene el arreglo primero");
        System.out.println("Ingrese 9 numeros separados por un enter");
        for(x=0;x<=2;x++){
            for(z=0;z<=2;z++){
        I=sc1.nextDouble();
        Arr3x3[x][z]=I;}}}
    for(x=0;x<=2;x++){
            for(z=0;z<=2;z++){
            if(z==0){Sum1 = Sum1+Arr3x3[x][z];}
            if(z==1){Sum2 = Sum2+Arr3x3[x][z];}
            if(z==2){Sum3 = Sum3+Arr3x3[x][z];}
            }}
        System.out.println(Sum1);
        System.out.println(Sum2);
        System.out.println(Sum3);
    Acc3D.M3D();}
    public static void SFilas(){Sum=0.0;Double Sum1=0.0, Sum2=0.0,Sum3=0.0;
    if(C<1){C++;System.out.println("No lleno el arreglo, Llene el arreglo primero");
        System.out.println("Ingrese 9 numeros separados por un enter");
        for(x=0;x<=2;x++){
            for(z=0;z<=2;z++){
        I=sc1.nextDouble();
        Arr3x3[x][z]=I;}}}
    for(x=0;x<=2;x++){
            for(z=0;z<=2;z++){
            if(x==0){Sum1 = Sum1+Arr3x3[x][z];}
            if(x==1){Sum2 = Sum2+Arr3x3[x][z];}
            if(x==2){Sum3 = Sum3+Arr3x3[x][z];}
            }}
        System.out.println(Sum1);
        System.out.println(Sum2);
        System.out.println(Sum3);
    Acc3D.M3D();}
    public static void SDiagonal(){Sum=0.0;
    if(C<1){C++;System.out.println("No lleno el arreglo, Llene el arreglo primero");
        System.out.println("Ingrese 9 numeros separados por un enter");
        for(x=0;x<=2;x++){
            for(z=0;z<=2;z++){
        I=sc1.nextDouble();
        Arr3x3[x][z]=I;}}}
    
    for(x=0;x<=2;x++){
            for(z=0;z<=2;z++){
            if(x==z){
            Sum=Sum+Arr3x3[x][z];}
            }}System.out.println("La suma en diagonal es: "+Sum);
    Acc3D.M3D();}
    public static void Promedio(){Sum=0.0;
    if(C<1){C++;System.out.println("No lleno el arreglo, Llene el arreglo primero");
        System.out.println("Ingrese 9 numeros separados por un enter");
        for(x=0;x<=2;x++){
            for(z=0;z<=2;z++){
        I=sc1.nextDouble();
        Arr3x3[x][z]=I;}}}
    for(x=0;x<=2;x++){
            for(z=0;z<=2;z++){
            
            Sum=Sum+Arr3x3[x][z];
            }}System.out.println("El promedio es : "+(Sum/9));
    
    Acc3D.M3D();}
}
