package vetores_matrizes;

import java.util.Scanner;

public class Exer_2 {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		double matr[][] = new double[10][4];
		double vetorMedia[] = new double[10], soma;
		int nota, p;

		for(nota = 0; nota < 10; nota++){
		    soma = 0;
		    for(p = 1; p < 5; p++){
		        System.out.print("Digite a nota "+nota+" para o "+p+"º bimestre: ");
		        matr[nota][p] = leia.nextDouble();
		     
		        
		        soma = soma + matr[nota][p];
		    }
		    vetorMedia[nota] = soma / 4;
		}
		
		for(nota = 0; nota < 10; nota++){
		    System.out.println("A média final é:  "+vetorMedia[nota]);
		}
	}

}
