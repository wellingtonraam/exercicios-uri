/*
*	Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.

*	Entrada
*	O arquivo de entrada contém 2 valores inteiros.

*	Saída
*	Imprima a variável SOMA com todas as letras maiúsculas, com um espaço em branco antes e depois da igualdade seguido pelo valor correspondente à soma de A e B.
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