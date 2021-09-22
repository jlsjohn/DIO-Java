import java.io.IOException;
import java.util.Scanner;

public class Main{
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		int T = 0;
		int menor = 10000, posMenor = 0;
		for (int i = 1; i <= N; ++i) {
			T = leitor.nextInt();
			
			if (T < menor) {
			  menor = T;
			  posMenor = i;
			}
		}
		System.out.println(posMenor);
    }
	
}
