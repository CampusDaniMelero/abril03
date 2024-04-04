package com.softtek.ejercicios;
//Ejercicio 3
 public class Areas {
    public static double calculoAreaCirculo(double radio){
        return Math.PI * radio * radio;

    }
    public static int calculoAreaRectangulo(int base , int altura){
        return base * altura;
    }

    public static void main(String[] args){
        double radio=5.12;
        int base =12;
        int altura=8;

        double areaCirculo=calculoAreaCirculo(radio);
        int areaRectangulo=calculoAreaRectangulo(base,altura);

        System.out.println("El area del circulo es " + areaCirculo + "m^2" + " y el area del Rectangulo es de " + areaRectangulo + " m^2");



    }
}




