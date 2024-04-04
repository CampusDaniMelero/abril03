package com.softtek.presentacion;

public class Letras {
    //Ejercicio String

    public static void main(String[] args) {
        String cadena = "Nunca mates una mosca sobre la cabeza de un tigre.";

        System.out.println("En Mayus : " + cadena.toUpperCase());

        System.out.println("En Minus : " + cadena.toLowerCase());

        //A partir de aqui mostraremos palabra por palabra , por lo que recorremos las letras

        System.out.println("Palabra 'Nunca' : " + getPalabrita(cadena, 0));

        System.out.println("Palabra 'Mosca' : " + getPalabrita(cadena, 14));

        System.out.println("Palabra 'cabeza' : " + getPalabrita(cadena, 31));


        //Aqui mostraremos la primera M

        int positionM = cadena.indexOf('m');

        System.out.println("La letra 'm' se encuentra en la posicion : " + positionM);

        //Longitud de la cadena de texto

        System.out.println("Tamaño total de la cadena de  : " + cadena.length());
    }
        //Creamos el metodo getPalabrita para obtener la palabra

        public static String getPalabrita(String cadena, int inicio){
            int end=cadena.indexOf(' ', inicio);
            if(end==-1){
                end=cadena.length();
            }
            return cadena.substring(inicio,end);
        }
    }

