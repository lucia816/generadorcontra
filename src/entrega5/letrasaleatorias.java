package entrega5;

import java.util.Random;
import java.util.Scanner;

public class letrasaleatorias {
    private static double j;

    public static void main(String[] args) {


                 //declaro las variables del rango numérico que corresponde al alfabeto en Ascii

            //si quisieramos que generase letras mayúsculas tendríamos que usar el rango 65-90

            int num1 = 97;

            int num2 = 122;

            //a la variable de caracter le di un valor inicial de cero

            char c = 0;

            //establezco una secuencia de diez números aleatorios

            //podemos establecer la secuencia que queramos, siempre y cuando recordemos que el alfabeto en acssi tiene 26 letras, aí que ese es el máximo de la secuencia
int salir = 1;
            for (int i = 1; i <= 10; i++) {
    while (salir != 5) {
        char letra = (char) Math.floor(Math.random() * (num2 - num1) + num1);
        int numAleatorio = (int) Math.floor(Math.random() *10);

        //para transformar los números en letras según ACSII

        System.out.print(letra);
        System.out.println();
        System.out.print(numAleatorio);

        c++;
salir++;
        Scanner in = new Scanner(System.in);
    }
       }

        }
    }

