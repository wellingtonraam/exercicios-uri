/**
M�dia 2
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia 3 valores, no caso, vari�veis A, B e C, que s�o as tr�s notas de um aluno. A seguir, calcule a m�dia do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 at� 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada cont�m 3 valores com uma casa decimal, de dupla precis�o (double).

Sa�da
Imprima a vari�vel MEDIA conforme exemplo abaixo, com 1 d�gito ap�s o ponto decimal e com um espa�o em branco antes e depois da igualdade. 
*/


import java.util.Scanner;

import java.text.DecimalFormat;



public class Main {

    public static void main(String args[]) {

        DecimalFormat df = new DecimalFormat("0.0");

        Scanner in = new Scanner(System.in);

        double a,b,c,temp;

        a = in.nextDouble();

        b = in.nextDouble();

        c = in.nextDouble();

        temp = ((a*2) + (b*3) + (c*5)) /10;

        System.out.println("MEDIA = " + df.format(temp));

    }

}
