/**
Diferen�a
Adaptado por Neilor Tonin, URI  Brasil
21
Timelimit: 1
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada cont�m 4 valores inteiros.

Sa�da
Imprima a mensagem DIFERENCA com todas as letras mai�sculas, conforme exemplo abaixo, com um espa�o em branco antes e depois da igualdade.
*/


import java.util.Scanner;





public class Main {

    public static void main(String args[]) {

 Scanner in = new Scanner (System.in);
        
int dif,a,b,c,d;
        
a = in.nextInt();
        
b = in.nextInt();
        
c = in.nextInt();
        
d = in.nextInt();
        
dif = ((a*b) - (c*d));
        
System.out.println("DIFERENCA = " + dif);  
  }

}
