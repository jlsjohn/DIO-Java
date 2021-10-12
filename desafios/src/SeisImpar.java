/*
  Problema:
  Descrição do Problema: Seis números ímpares
  Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X se for o caso.

  Entrada
  A entrada será um valor inteiro positivo.

  Saída
  A saída será uma sequência de seis números ímpares.

  Exemplo:
  Dados de Entrada:
  14
  Dados de Saída:
  15
  17
  19
  21
  23
  25
 */

import java.io.IOException;
import java.util.Scanner;

public class SeisImpar {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int cont = 0;

        if(x%2==0) x=x+1;
        while (cont < 6) {
            System.out.println(x+(2*cont));
            cont ++;
        }
    }
}