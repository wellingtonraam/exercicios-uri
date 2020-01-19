/*
 
�rea do C�rculo

Adaptado por Neilor Tonin, URI  Brasil


Timelimit: 1

A f�rmula para calcular a �rea de uma circunfer�ncia �: area = p . raio2. 
Considerando para este problema que p = 3.14159:


- Efetue o c�lculo da �rea, elevando o valor de raio ao quadrado e multiplicando por p.



Entrada


A entrada cont�m um valor de ponto flutuante (dupla precis�o), no caso, a vari�vel raio.


Sa�da
Apresentar a mensagem "A=" seguido pelo valor da vari�vel area, conforme exemplo abaixo, com 4 casas ap�s o ponto decimal. 

Utilize vari�veis de dupla precis�o (double). 

*/





import java.text.DecimalFormat;

import java.util.Scanner;


public class Main {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.0000");

        double area, n = in.nextDouble();

        area = 3.14159 * (n * n);

        System.out.println("A=" + df.format(area));

    
    }

}
