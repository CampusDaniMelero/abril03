package com.softtek.presentacion;

import com.softtek.ejercicios.Dado;

import java.util.Locale;
import java.util.Scanner;

public class probarDado {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Dado dado=new Dado();
        boolean seguirTirando=true;



        while(seguirTirando){
            System.out.println("El resultado del dado ha sido de : " + dado.getResultado());
            dado.dibujar();

            System.out.println("Deseas continuar tirando?? (s/n)");
            String opcion= scanner.nextLine().trim().toLowerCase();
            if(opcion.equals("n")){
                seguirTirando=false;
            }else if(!opcion.equals("s")){
                System.out.println("Opcion no valida");
            }else{
                dado.lanzar();
            }


        }

        scanner.close();
        System.out.println("Final del programa bro");
    }


}
