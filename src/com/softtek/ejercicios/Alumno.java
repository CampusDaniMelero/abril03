package com.softtek.ejercicios;

public class Alumno {
    private String nombre;
    private double[] calificaciones;

    public Alumno(String nombre, int parcialsExam) {
        this.nombre = nombre;
        this.calificaciones = new double[parcialsExam];
    }

    public void setCalificaciones(double[] calificaciones) {
        if (calificaciones.length == this.calificaciones.length) {
            this.calificaciones = calificaciones;
        } else {
            System.out.println("La cantidad de calificaciones no coinciden con el tamaño del Array");
        }
    }

    public double calculoPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public void mostrarCalificaciones() {
        System.out.println("Calificaciones de los parciales a nombre de : " + nombre + " : ");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Examen parcial numero : " + (i + 1) + " con la calificacion de : " + calificaciones[i]);
        }
    }

    public String getNombre() {
        return nombre;
    }
}
