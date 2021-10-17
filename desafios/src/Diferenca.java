/*
  Problema: Diferença
  Descrição do Problema:
  Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

  Entrada
  O arquivo de entrada contém 4 valores inteiros.

  Saída
  Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.

  Exemplo:
  Dado de entrada:
  1
  9
  4
  3
  Saída esperada:
  DIFERENCA = -3
 */

import java.io.IOException;
import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();
        int dif = a * b - c * d;
        System.out.println("DIFERENCA = " + dif);
    }
}