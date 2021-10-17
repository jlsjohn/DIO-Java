/*
  Problema: Divisores I
  Descrição do Problema:
  Leia um inteiro N e calcule todos os seus divisores.

  Entrada
  O arquivo de entrada contém um valor inteiro.

  Saída
  Escreva todos os divisores positivos de N, um valor por linha.

  Exemplo:
  Dados de Entrada:
  8
  Dados de Saída:
  1
  2
  4
  8
 */

import java.util.Scanner;

public class DivisoresI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
