/*
  Problema: Área Direita
  Descrição do Problema:
  Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na área direita da matriz, conforme ilustrado abaixo (área verde). https://prnt.sc/k0z9sf

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
  10 0 0 0 0 0 0 0 0 0 0 10
  11 0 0 0 0 0 0 0 0 0 0 11
  12 0 0 0 0 0 0 0 0 0 0 12

  Dados de Saída:
  65,0
 */

import java.io.IOException;
import java.util.Scanner;

public class MatrizDireita {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        double somaM = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        double[][] MT = new double[12][12];
        for (int i = 0; i<12; i++) {
        	for (int j = 0; j<12; j++) {
        		M[i][j] = leitor.nextDouble();
        		MT[i][j] = 0;
        		//System.out.printf("[%d-%d]=%.0f ",i,j,M[i][j]);
        		//System.out.printf("%.0f ",MT[i][j]);
        	}   
        	//System.out.println(" ");
        }
        
    	for (int j = 7; j<12; j++){
            for (int i = 1; i<11; i++){
                if((j-i)>0 && (j+i)>11){
    		        soma += M[i][j];
    		        MT[i][j] = 1;
    		        somaM += 1;
                }
            }
    	}
        if (O == 'S'){
        //    continue;
        } else if (O == 'M') soma /= 30;
        System.out.println(String.format("%.1f", soma));
        
        for (int i = 0; i<12; i++) {
        	for (int j = 0; j<12; j++) {
        		//System.out.printf("%.0f ",MT[i][j]);
        	}   
        	//System.out.println(" ");
        }
        
        
    }
	
}