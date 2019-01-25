/**
Produto Simples
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.   

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. 
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