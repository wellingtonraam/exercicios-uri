
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.
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
