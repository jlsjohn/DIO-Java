/*
  Problema:
  Descrição do Problema: Encaixa ou Não
  Paulinho tem em suas mãos um pequeno problema. A professora lhe pediu que ele construísse um programa para verificar, à partir de dois valores inteiros A e B, se B corresponde aos últimos dígitos de A.

  Entrada
  A entrada consiste de vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. Cada caso de teste consiste de dois inteiros A (1 ≤ A < 231 ) e B (1 ≤ B < 231) positivos.

  Saída
  Para cada caso de entrada imprima uma mensagem indicando se o segundo valor encaixa no primeiro valor, confome exemplo abaixo.

  Exemplo:
  Dados de entrada:
  2
  11 111
  33 3
  Dados de Saída:
  nao encaixa
  encaixa
 */

import java.util.Scanner;

public class EncaixaOuNaoII {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            String A = String.valueOf(scan.nextInt());
            String B = String.valueOf(scan.nextInt());

            if(A.endsWith(B)) System.out.println("encaixa");
            else System.out.println("nao encaixa");
        }
    }
}