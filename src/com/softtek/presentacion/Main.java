package com.softtek.presentacion;

import com.softtek.ejercicios.Campos;
import com.softtek.ejercicios.TablasMultiplicar;

import static com.softtek.ejercicios.Areas.calculoAreaCirculo;
import static com.softtek.ejercicios.Areas.calculoAreaRectangulo;


public class Main {
    public static void main(String[] args){
            double radio=5.12;
            int base =12;
            int altura=8;

            double areaCirculo=calculoAreaCirculo(radio);
            int areaRectangulo=calculoAreaRectangulo(base,altura);

            System.out.println("El area del circulo es " + areaCirculo + "m^2" + " y el area del Rectangulo es de " + areaRectangulo + " m^2");

        System.out.println("-------------------------------------------------------------------------------------");

        Campos campo=new Campos(5);

        System.out.println("El valor inicial es : " + campo.muestra());

        //Ahora incrementaremos el valor de X

        campo.incrementa();

        System.out.println("El valor de X tras el incremento es de  " +  campo.muestra());



System.out.println("-------------------------------------------------------------------------------------");
        TablasMultiplicar tablita=new TablasMultiplicar(7);

        System.out.println("La tabla de multiplicar correspondiente a la variable introducida es : " );
        System.out.println(tablita.crearTabla() );






    }


    }

