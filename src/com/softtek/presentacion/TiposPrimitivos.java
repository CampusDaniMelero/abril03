package com.softtek.presentacion;


public class TiposPrimitivos {

    public static void main(String[] args){
        byte numeroPequeño;
        numeroPequeño=5;

        System.out.println(numeroPequeño);

        short numeroEntero=350;

        System.out.println(numeroEntero);

        long numeroLargo=56_000_000L;

        System.out.println(numeroLargo);


        float numeroDecimales=1_123.45F;

        System.out.println(numeroDecimales);


        double numeroDecimalesGrande = 1_1234_897.098;

        System.out.println(numeroDecimalesGrande);


        boolean estaCasado = false;

        System.out.println(estaCasado);

        char letra = 'a';

        System.out.println(letra);

         int ladoCuadrado=6;

         int areaCuadrado;

         areaCuadrado=ladoCuadrado*ladoCuadrado;

         System.out.println("El area del cuadrado es " + areaCuadrado);

         double radioCirculo = 3;

         double numeroPI=3.14;

         double areaCirculo= numeroPI*radioCirculo*radioCirculo;

         System.out.println(areaCirculo + " Es el area del circulo");

         int ladoRectangulo1=4;

        int ladoRectangulo2=3;

        int perimetroRectangulo= ladoRectangulo1 + ladoRectangulo1 + ladoRectangulo2 + ladoRectangulo2;

        System.out.println(perimetroRectangulo + " Es el perimetro en el rectangulo");






    }


}
