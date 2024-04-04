package com.softtek.ejercicios;

//Ejercicio 5

public class TablasMultiplicar {
    private int numero; //Aqui estará el numero del que mostraremos la tabla de multiplicar

    public TablasMultiplicar(int numero){
        this.numero=numero;
    }

    public String crearTabla(){
        //Usamos StringBuilder porque usamos muchas operaciones de concatenacion , sino podemos usar el +
        StringBuilder tabla= new StringBuilder();
        for(int i =1; i<=10; i++){
            tabla.append(numero).append(" x ").append(i).append("=").append(numero*i).append("\n");

        }
        return tabla.toString();

    }
}
