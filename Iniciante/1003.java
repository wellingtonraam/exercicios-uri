/*
*	Leia dois valores inteiros, no caso para vari�veis A e B. A seguir, calcule a soma entre elas e atribua � vari�vel SOMA. A seguir escrever o valor desta vari�vel.

*	Entrada
*	O arquivo de entrada cont�m 2 valores inteiros.

*	Sa�da
*	Imprima a vari�vel SOMA com todas as letras mai�sculas, com um espa�o em branco antes e depois da igualdade seguido pelo valor correspondente � soma de A e B.
*/


import java.io.IOException;

import java.util.Scanner;



public class Main {

 
    public static void main(String[] args) throws IOException {

 
      Scanner in = new Scanner(System.in);

        int a,b;

        a = in.nextInt();

        b = in.nextInt();

        System.out.println("SOMA = " + (a+b));

    }

}