
Imprima o n�mero e o sal�rio do funcion�rio, conforme exemplo fornecido, com um espa�o em branco antes e depois da igualdade. No caso do sal�rio, tamb�m deve haver um espa�o em branco ap�s o $.
*/


import java.util.Scanner;

import java.text.DecimalFormat;





public class Main {

    public static void main(String args[]) {


DecimalFormat df = new DecimalFormat("0.00");

Scanner in = new Scanner(System.in);


int id, horas;

double valorHora, salario;



id = in .nextInt();

horas = in .nextInt();

valorHora = in .nextDouble();


salario = (double) horas * valorHora;


System.out.println("NUMBER = " + id + "\nSALARY = U$ " + df.format(salario));
  }

}
