/*
  Problema: Tempo de Jogo
  Descrição do Problema:
  Tento como base a hora inicial e final de um jogo, calcule a duração do dele, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de, 60 minutos e máxima de 24 horas.

  Entrada
  A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

  Saída
  Apresente a duração do jogo conforme exemplo abaixo.

  Exemplo:
  Dados de entrada:
  16 2
  Dados de Saídas:
  O JOGO DUROU 10 HORA(S)
 */

import java.util.Scanner;

public class TempoJogo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int inicio, fim, horas;
		inicio = scan.nextInt();
		fim = scan.nextInt();
		horas = (inicio>fim) ? (24-inicio+fim) : (fim-inicio);

		if(horas == 0){
			System.out.print("O JOGO DUROU 24 HORA(S)\n");
//		}else if(horas < 0){
//			System.out.print("O JOGO DUROU " + (          ) + " HORA(S)\n");
//		}else if(horas > 24){
//			System.out.print("O JOGO DUROU " + (            ) + " HORA(S)\n");
		}else{
			System.out.print("O JOGO DUROU " + horas + " HORA(S)\n");
		}
	}
}