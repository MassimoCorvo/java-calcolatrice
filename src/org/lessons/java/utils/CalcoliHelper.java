package org.lessons.java.utils;

public class CalcoliHelper {

    //Creo metodi con lo stesso nome ma con signature diverse, ovvero usando l'Overloading

    public static int somma (int numero1, int numero2){
        return numero1 + numero2;
    }

    public static double somma (double numero1, double numero2){
        return numero1 + numero2;
    }

    public static int sottrazione (int numero1, int numero2){
        return numero1 - numero2;
    }

    public static double sottrazione (double numero1, double numero2){
        return numero1 - numero2;
    }

    public static int moltiplicazione (int numero1, int numero2){
        return numero1 * numero2;
    }

    public static double moltiplicazione (double numero1, double numero2){
        return numero1 * numero2;
    }

    public static int valoreAssoulto (int numero){
        if(numero>=0)
            return numero;
        return numero*(-1);
    }

    public static double valoreAssoulto (double numero){
        if(numero>=0)
            return numero;
        return numero*(-1);
    }

    public static int minimo (int numero1, int numero2){
        if(numero1 <= numero2)
            return numero1;
        return numero2;
    }

    public static double minimo (double numero1, double numero2){
        if(numero1 <= numero2)
            return numero1;
        return numero2;
    }

    public static int massimo (int numero1, int numero2){
        if(numero1 >= numero2)
            return numero1;
        return numero2;
    }

    public static double massimo (double numero1, double numero2){
        if(numero1 >= numero2)
            return numero1;
        return numero2;
    }

}
