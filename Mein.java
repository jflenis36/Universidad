/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author Nidia
 */
public class Mein {
   //calcular area de cuadrado, triángulo, circulo, rectangulo y calcular ler de herón

    public static void main(String[] args){
        Scanner get = new Scanner(System.in);
        Integer opcion = 0;
        Integer num1;        
        Integer num2;
        Integer num3;

        while(opcion<=8){
            System.out.println("");
            System.out.println("Por favor elige una opción");
            System.out.println("1. Ordenar de mayor a menor");
            System.out.println("2. Aprobo o reprobo");
            System.out.println("3. Fibonacci");
            System.out.println("4. Primo (par o impar)");
            System.out.println("5. Factorial de número");            
            System.out.println("6. Tabla de multiplicar");            
            System.out.println("7. Costos aerolinea");
            System.out.println("8. Salir");
            System.out.print("Escriba ---->   ");
            opcion = get.nextInt();
            switch(opcion){
                case 1 -> {
                    System.out.print("Por favor dijite el primer número:  ");
                    num1 = get.nextInt();
                    System.out.print("Por favor dijite el segundo número:  ");
                    num2 = get.nextInt();
                    System.out.print("Por favor dijite el tercer número:  ");
                    num3 = get.nextInt();
                    ordenar(num1, num2, num3);
                }
                case 2 -> {
                    System.out.print("Por favor dijite la nota 1(30%):  ");
                    Double numm1 = get.nextDouble();
                    System.out.print("Por favor dijite la nota 2(30%):  ");
                    Double numm2 = get.nextDouble();
                    System.out.print("Por favor dijite la nota 3(40%):  ");
                    Double numm3 = get.nextDouble();
                    aproboReprobo(numm1, numm2, numm3);
                }
                case 3 -> {
                    System.out.print("Cuantps números deseas saber:  ");
                    num1 = get.nextInt();
                    fibonacci(num1);
                }
                case 4 -> {
                    System.out.print("Por favor dijite el número que desea evaluar:   ");
                    num1 = get.nextInt();
                    primo(num1);
                }
                case 5 -> {
                    System.out.print("Por favor dijite el número que desea factorizar:  ");
                    num1 = get.nextInt();
                    factorial(num1);
                }
                case 6 -> { 
                    System.out.print("Por favor dijite el número para generar la tabla:   ");
                    num1 = get.nextInt();
                    tablas(num1);
                }
                case 7 -> { 
                    System.out.print("Por favor dijite el número de ticket que desea comprar:   ");
                    num1 = get.nextInt();
                    aerolinea(num1);
                }
                case 8 -> { 
                    System.out.print("Gracias por utilizar el servicio");
                    opcion =10;
                    break;
                }
                default -> {
                        System.out.println("Opción equivocada");
                        opcion = 1;
                }
                
            }
        }
       
    }
    public static void ordenar(Integer n1, Integer n2, Integer n3){
       if(n1>n2){
           if(n1>n3){
               if(n2>n3){
                   System.out.println(n1+" - "+n2+" - "+n3 );
               }else{
                   System.out.println(n1+" - "+n3+" - "+n2 );
               }
           }else{
               System.out.println(n3+" - "+n1+" - "+n2 );
           }
       }else{
           if(n2>n3){
               if(n1>n3){
                   System.out.println(n2+" - "+n1+" - "+n3 );
               }else{
                   System.out.println(n2+" - "+n3+" - "+n1 );
               }
           }else{
               System.out.println(n3+" - "+n2+" - "+n1 );
           }
       }
    }
    public static void aproboReprobo(double n1, double n2, double n3){
        double res = n1*0.3+n2*0.3+n3*0.4;
        if(res>=3){
            System.out.println("Aprobo con una nota de:  "+res);
        }else{
            System.out.println("Reprobo con una nota de:  "+res);
        }
    }
    public static void fibonacci(Integer n1){
        Integer a = 1, b = 0, c;
        for(int i = 0; i<n1; i++){
            c = a+b;
            System.out.print(c+"  ");
            a=b;
            b=c;
        }
    }
    public static void primo(Integer n1){
        System.out.print(n1+":  ");
        Integer conta = 0;
        if(n1%2==0){
            System.out.print("Es par");
        }else{
            System.out.print("Es impar ");
        }
        for(int i=1; i<=n1; i++){
            if(n1%i==0){
                conta++;
            }
        }
        if(conta==2){
            System.out.print("y tambien es primo");
        }
    }
    public static void factorial(Integer n1){
        Integer res=1;
        for(int i=1; i<=n1;i++){
            res = res * i;
        }
        System.out.println("el resultado de "+n1+"! =   "+res);
    }
    public static void tablas(Integer n1){
        for(int i=1; i<=12;i++){
            System.out.println(n1+" * "+i+" = "+(n1*i));
        }
    }
    public static void aerolinea(Integer n1){
        Scanner get = new Scanner(System.in);
        Integer edades[] = new Integer[n1];
        String nombres[] = new String[n1];
        Integer pago[] = new Integer[n1];
        Integer total_pago=0;
        for(int i=0; i<n1;i++){
            System.out.println("Dijite el nompre del pasajero numero "+(i+1));
            nombres[i]=get.next();
            System.out.println("Dijite la edad de "+nombres[i]);
            edades[i]=get.nextInt();
            if(edades[i]<5){
                pago[i]=0;
            }else{
                if(edades[i]==18){
                    pago[i]=150000;
                }else{
                    pago[i]=300000;
                }
            }
            total_pago=total_pago+pago[i];
            
        }
        System.out.println("************** TIKCET DE VENTA **************");
        System.out.println("Nombres              Edad                Pago");
        for(int i=0; i<n1;i++){
           System.out.println(nombres[i]+"               "+edades[i]+"                  "+pago[i]);
        }
        
        System.out.println("*************** TOTAL A PAGAR ***************");
        System.out.println("                                    "+total_pago);
    }
}
