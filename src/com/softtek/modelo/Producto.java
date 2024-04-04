package com.softtek.modelo;

public class Producto {
    //1. Atributos

    private int idProducto;

    private String nombre;

    private int cantidadExistencia;

    //2.Metodos

    public void compraProducto(int cantidad){
        if (cantidad>=0){
            cantidadExistencia=cantidadExistencia + cantidad;

        }
    }

    public void ventaProducto(int cantidad){
        if(cantidad<=cantidadExistencia){
            cantidadExistencia-=cantidad;

        }
    }

    public String toString(){
        return "Producto{" +
                "idProducto=" + idProducto +
                "";



    }



}
