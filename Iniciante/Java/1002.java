/*
 
Área do Círculo

Adaptado por Neilor Tonin, URI  Brasil


Timelimit: 1

A fórmula para calcular a área de uma circunferência é: area = p . raio2. 
Considerando para este problema que p = 3.14159:


- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por p.



Entrada


A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.


Saída
Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. 

Utilize variáveis de dupla precisão (double). 

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
