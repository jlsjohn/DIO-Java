/*
  Problema: Área Inferior
  Descrição do Problema:
  Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na área Inferior da matriz, conforme ilustrado abaixo (área verde). https://prnt.sc/k0z9sf

  Entrada
  A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

  Saída
  Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

  Exemplo:
  Dados de Entrada:
  S
  1 0 0 0 0 0 0 0 0 0 0 1
  2 0 0 0 0 0 0 0 0 0 0 2
  3 0 0 0 0 0 0 0 0 0 0 3
  4 0 0 0 0 0 0 0 0 0 0 4
  5 0 0 0 0 0 0 0 0 0 0 5
  6 0 0 0 0 0 0 0 0 0 0 6
  7 0 0 0 0 0 0 0 0 0 0 7
  8 0 0 0 0 0 0 0 0 0 0 8
  9 0 0 0 0 0 0 0 0 0 0 9
  10 8 6 4 2 0 0 2 4 6 8 10
  11 9 7 5 3 1 1 3 5 7 9 11
  12 10 8 6 4 2 2 4 6 8 10 12

  Dados de Saída:
  104,0
 */

import java.io.IOException;
import java.util.Scanner;

public class MatrizInferiorSimples {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }

        for (int i = 7; i < 12; i++) {
            for (int j = 1; j < 11; j++) {
                if ((i - j) > 0 && (j + i) > 11) {
                    soma += M[i][j];
                }
            }
        }

        if (O == 'S') {
            System.out.printf("%.1f%n", soma);
        } else if (O == 'M') {
            soma /= 30;
            System.out.printf("%.1f%n", soma);
        }
    }
}