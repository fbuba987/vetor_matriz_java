package vetores_matrizes;

import java.util.Scanner;

public class Exer_1 {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		int  numeroPar=0, numeroImpar, soma = 0;
		double media;
		
		for(int i = 0; i<10; i++){	
			soma = soma + vetor[i];
			System.out.print("Digite os valores: ");
			vetor[i] = leia.nextInt();
			soma += vetor[i];
	
		
		}
		
		System.out.println("\n Elementos pares: ");
		for(int j = 0; j<10; j++){
			if(vetor[j]%2==0){
				numeroPar = vetor[j];
				System.out.println("\n" + numeroPar);
				
				
			}
			
			
		}
		
		System.out.println("\n--------------------------------");
		System.out.println("\n Elementos nos índices ímpares:");
		for(int k = 0; k<10; k++){
			if(k % 2 !=0){
				numeroImpar = vetor[k];
					System.out.println("\n" + numeroImpar);
			}
			
		}
		
	System.out.println("\nA soma é igual: "+ soma);
	media = soma/10;
	
	System.out.println("\n A média é igual: "+ media);

	}

}
