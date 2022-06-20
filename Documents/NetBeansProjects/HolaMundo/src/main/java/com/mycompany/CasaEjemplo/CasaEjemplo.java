/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.CasaEjemplo;

/**
 *
 * @author Compumag
 */
import java.util.Scanner;
public class CasaEjemplo {
    public static double area_rectangulo(double l, double a){ //funicon
        return l + a;
    } //fin funcion
    
    public static double area_triangulo(double base, double altura){
        return (base*altura)/2;
    } 
    public static void main(String []arg){
       Scanner sc = new Scanner (System.in);
       
        System.out.println("ingrese lado: ");
        int l = sc.nextInt();
        
        System.out.println("ingrese el ancho: ");
        int a = sc.nextInt();
        
        System.out.println("Ingrese Base: ");
        int base = sc.nextInt();
        
        System.out.println("Ingrese altura: ");
        int altura = sc.nextInt();
        
        System.out.println("area "+ area_rectangulo(l,a));
        
        System.out.println("Area triangulo: "+ area_triangulo(base, altura));
        
       
       
    }
    
}
