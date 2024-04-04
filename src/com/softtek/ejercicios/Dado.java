package com.softtek.ejercicios;

import java.util.Random;

public class Dado {
    private int resultado;

    public Dado(){
        lanzar();
    }

    public void lanzar(){
        Random random =new Random();
        resultado= random.nextInt(6)+1;
    }

    public void dibujar() {
        switch (resultado) {
            case 1:
                System.out.println(" _____ ");
                System.out.println("|     |");
                System.out.println("|  *  |");
                System.out.println("|_____|");
                break;
            case 2:
                System.out.println(" _____ ");
                System.out.println("|*    |");
                System.out.println("|     |");
                System.out.println("|____*|");
                break;
            case 3:
                System.out.println(" _____ ");
                System.out.println("|*    |");
                System.out.println("|  *  |");
                System.out.println("|____*|");
                break;
            case 4:
                System.out.println(" _____ ");
                System.out.println("|*   *|");
                System.out.println("|     |");
                System.out.println("|*___*|");
                break;
            case 5:
                System.out.println(" _____ ");
                System.out.println("|*   *|");
                System.out.println("|  *  |");
                System.out.println("|*___*|");
                break;
            case 6:
                System.out.println(" _____ ");
                System.out.println("|*   *|");
                System.out.println("|*   *|");
                System.out.println("|*___*|");
                break;
        }
    }
    public int getResultado(){
        return resultado;
    }
}
