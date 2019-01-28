/**
M�dia 1
Adaptado por Neilor Tonin, URI  Brasil

Leia 2 valores de ponto flutuante de dupla precis�o A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a m�dia do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto � 11). Assuma que cada nota pode ir de 0 at� 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada cont�m 2 valores com uma casa decimal cada um.

Sa�da
Calcule e imprima a vari�vel MEDIA conforme exemplo abaixo, com 5 d�gitos ap�s o ponto decimal e com um espa�o em branco antes e depois da igualdade. 
*/


import java.util.Scanner;

import java.text.DecimalFormat;

public class Main {

 
    public static void main(String[] args) throws IOException {

 
       Scanner in = new Scanner(System.in);
 	DecimalFormat df = new DecimalFormat("0.00000");
        a = in .nextDouble();
 
	b = in .nextDouble();
 
	media = ((a * 3.5) + (b * 7.5)) / 11;
 
	System.out.println("MEDIA = " + df.format(media));
    }

}