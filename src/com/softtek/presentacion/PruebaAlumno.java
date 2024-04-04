package com.softtek.presentacion;

import com.softtek.ejercicios.Alumno;
//Ejercicio 6

public class PruebaAlumno {
    public static void main (String[] args ){
        Alumno alumno=new Alumno("Carmelo Escribano" , 4);
        //Recordemos que 4 son la cantidad de examenes parciales realizados

        double [] calificaciones={8.1 , 7.3 , 9.5 , 4.2};

        alumno.setCalificaciones(calificaciones);

        alumno.mostrarCalificaciones();

        double promedio=alumno.calculoPromedio();
        System.out.println("Promedio de " + alumno.getNombre() + " : " + promedio);
    }
}
