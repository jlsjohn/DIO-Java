/*
  Problema: Fatorial Simples
  Descrição do Problema:
  Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

  Entrada
  A entrada contém um valor inteiro N (0 < N < 13).

  Saída
  A saída contém um valor inteiro, correspondente ao fatorial de N.

  Exemplo:
  Dado de entrada:
  6
  Saída esperada:
  720
 */

import java.util.Scanner;

public class FatorialSimples {

    public static void main(String[] args) {
        //N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int fat = 0;
        for(int i=0;i<=N;i++){
            if(i == 0) fat=1;
            if(i == 1) fat=fat*1;
            if(i > 1) fat=fat*i;
        }
        System.out.println(fat);

    }
}