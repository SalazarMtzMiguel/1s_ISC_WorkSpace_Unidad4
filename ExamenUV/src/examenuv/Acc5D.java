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
public class Acc5D {
    public static Double Arr5x1[]=new Double[5],Sum=0.0;
    public static int x,z,C=0;
    public static Double I;
    public static Scanner sc1 = new Scanner(System.in);
   public static void M5D(){
    int E=0,R=0;
        
        
        do{
            System.out.println("ARREGLO 5X1 DOUBLE"
                    + "\n¿Que quieres hacer?"
                    + "\n0.-Llenar"
                        + "\n1.-Ordenar Ascendentemente los datos"
                        + "\n2.-Suma de elementos del arreglo"
                        + "\n3.-Calculo del promedio general"
                    + "\n4.-Contar la cantidad de numeros mayores al promedio"
                    + "\n5.-Menu de seleccion de tipo de datos"
                    + "\n6.-Finalizar");
                
                E=sc1.nextInt();
                switch(E){
                    case 0 :{
                    Acc5D.Llenar();
                    break;}
                    case 1 :{
                    Acc5D.Ordenar();
                    break;}
                    case 2 :{
                    Acc5D.Suma();
                    break;}
                    case 3 :{
                    Acc5D.Promedio();
                    break;}
                    case 4 :{
                    Acc5D.SupPromedio();
                    break;}
                    case 5 :{
                    Menu5.M5();
                    break;}
                    case 6 :{
                    System.exit(0);
                    break;}
                    default:{System.out.println("Ingresa una opcion valida");break;}
                    
                }}while(E!=1&&E!=2&&E!=3);
    }
    public static void Llenar(){
        C++;
        System.out.println("Ingrese 5 numeros separados por un enter");
        for(x=0;x<=4;x++){
        I=sc1.nextDouble();
        Arr5x1[x]=I;
        }
    Acc5D.M5D();}
    public static void Ordenar(){
    if(C<1){System.out.println("No lleno el arreglo, Llene el arreglo primero");
    C++;
        System.out.println("Ingrese 5 numeros separados por un enter");
        for(x=0;x<=4;x++){
        I=sc1.nextDouble();
        Arr5x1[x]=I;}}
    for(x=0;x<=4;x++){
    for(z=1;z<=4;z++) {
    if(Arr5x1[z]<Arr5x1[x]){
        Double aux = Arr5x1[x];
        Arr5x1[x]=Arr5x1[z];
        
        Arr5x1[z]=aux;
    }
    }}
    Acc5D.M5D();}
    public static void Suma(){
        Sum=0.0;
    if(C<1){System.out.println("No lleno el arreglo, Llene el arreglo primero");
    C++;
        System.out.println("Ingrese 5 numeros separados por un enter");
        for(x=0;x<=4;x++){
        I=sc1.nextDouble();
        Arr5x1[x]=I;}}
    for(x=0;x<=4;x++){ Sum = Sum+Arr5x1[x];
        }System.out.println(Sum);
    Acc5D.M5D();}
    public static void Promedio(){
        Sum=0.0;
    if(C<1){System.out.println("No lleno el arreglo, Llene el arreglo primero");
    C++;
        System.out.println("Ingrese 5 numeros separados por un enter");
        for(x=0;x<=4;x++){
        I=sc1.nextDouble();
        Arr5x1[x]=I;}}
    for(x=0;x<=4;x++){ Sum = Sum+Arr5x1[x];
        }System.out.println((Sum/5));
    Acc5D.M5D();}
    public static void SupPromedio(){
        Sum=0.0;
    if(C<1){System.out.println("No lleno el arreglo, Llene el arreglo primero");
    C++;
        System.out.println("Ingrese 5 numeros separados por un enter");
        for(x=0;x<=4;x++){
        I=sc1.nextDouble();
        Arr5x1[x]=I;}}
    for(x=0;x<=4;x++){ Sum = Sum+Arr5x1[x];
        }
    for(x=0;x<=4;x++){
    if(Arr5x1[x]>(Sum/5)){
        System.out.println(Arr5x1[x]+" Es mayor al promedio ("+Sum/5+")");
    }}
    Acc5D.M5D();}
}
