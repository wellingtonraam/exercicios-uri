/**
Produto Simples
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta opera��o � vari�vel PROD. A seguir mostre a vari�vel PROD com mensagem correspondente.   

Entrada
O arquivo de entrada cont�m 2 valores inteiros.

Sa�da
Imprima a vari�vel PROD conforme exemplo abaixo, com um espa�o em branco antes e depois da igualdade. 
*/


import java.io.IOException;

import java.util.Scanner;



public class Main {

 
    public static void main(String[] args) throws IOException {

 
       Scanner in = new Scanner(System.in);
     int a , b;
     a = in.nextInt();
     b = in.nextInt();
     System.out.println("PROD = " + (a*b));
    }

}