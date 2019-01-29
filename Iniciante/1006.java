/**
Média 2
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída
Imprima a variável MEDIA conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. 
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
