package Exercicios_Lista4;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		
		String frase;
		int opcao, numSentencas=0, numPalavras=0, numVogais=0, numConsoantes=0;
		
		do {
			
			System.out.println("Insira sua frase");
			frase = ler.nextLine();
			
			System.out.println("(1) N�mero de senten�as (ponto final, exclama��o e interroga��o)");
			System.out.println("(2) N�mero de Palavras");
			System.out.println("(3) N�mero de Vogais");
			System.out.println("(4) N�mero de Consoantes");
			System.out.println("(5) Sair");
			opcao = ler.nextInt();
			
			switch(opcao) {
			case 1:
				for(int i=0; i<frase.length(); i++) 
				{
					if(frase.charAt(i) == '.' || frase.charAt(i) == '!' || frase.charAt(i) == '?') {
						numSentencas++;
					}
				}
				System.out.println("N�mero de senten�as: " + numSentencas);
				numSentencas=0;
				
				break;
			
			case 2:
				for(int i=0; i<frase.length(); i++) 
				{
					if(frase.charAt(i) == ' ') {
						numPalavras++;
					}
				}
				System.out.println("N�mero de palavras: " + (numPalavras+1));
				numPalavras=0;
				
				break;
			
			case 3:
				for(int i=0; i<frase.length(); i++) {
					if(frase.toLowerCase().charAt(i) == 'a' || 
						frase.toLowerCase().charAt(i) == 'e' ||
						frase.toLowerCase().charAt(i) == 'i' ||
						frase.toLowerCase().charAt(i) == 'o' ||
						frase.toLowerCase().charAt(i) == 'u') 
					{
						numVogais++;
					}
				}
				System.out.println("N�mero de vogais: " + (numVogais));
				numVogais=0;
				
				break;
				
			case 4:
				for(int i=0; i<frase.length(); i++) {
					if (((frase.toLowerCase().charAt(i) >= 'a') && ((frase.toLowerCase().charAt(i) <= 'z')))) 
					{

						if (frase.toLowerCase().charAt(i) != 'a' && 
						frase.toLowerCase().charAt(i) != 'e' &&
						frase.toLowerCase().charAt(i) != 'i' && 
						frase.toLowerCase().charAt(i) != 'o' &&
						frase.toLowerCase().charAt(i) != 'u') 
						{
							numConsoantes++;
						}

					}
				}
				
				System.out.println("N�mero de consoantes: " + (numConsoantes));
				numConsoantes=0;
				
				break;
		
			}
			
			ler = new Scanner(System.in);
			
			
		}while(opcao!=5);
	}

}
