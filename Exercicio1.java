package Exercicios_Lista4;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String[] cor = new String[10];
		String chave;
		int contAzul=0, contVermelha=0, contVerde=0;
		
		for(int i=0; i<cor.length; i++) {
			System.out.print("Insira a cor da chave: ");
			chave = ler.next();
			cor[i]=chave.toLowerCase();;
			
					
			if(cor[i].equals("azul")) {
				System.out.println("Ir para a porta azul\n");
				contAzul++;
			}
			else if(cor[i].equals("vermelha")) {
				System.out.println("Ir para a porta vermelha\n");
				contVermelha++;
			}
			else if(cor[i].equals("verde")) {
				System.out.println("Ir para a porta verde\n");
				contVerde++;
			}
			else System.out.println("Procure novamente\n");
		}
		
		System.out.println("Quantidade de pessoas que estão com a chave Azul: " + contAzul);
		System.out.println("Quantidade de pessoas que estão com a chave Vermelha: " + contVermelha);
		System.out.println("Quantidade de pessoas que estão com a chave Verde: " + contVerde);

	}

}
