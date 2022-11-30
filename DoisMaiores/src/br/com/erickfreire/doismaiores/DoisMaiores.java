package br.com.erickfreire.doismaiores;

import java.util.Scanner;

public class DoisMaiores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int contador = 1;
		int maior = 0;
		int segundoMaior = 0;
		int numero = 0;
		
		System.out.println("Programa que verifica os dois maiores valores digitados: \n");
		
		while(contador <= 10) {
			System.out.print("Digite um valor: ");
			numero = entrada.nextInt();
			
			if(numero > maior) {
				segundoMaior = maior;
				maior = numero;
			} else {
				if(numero > segundoMaior) {
					segundoMaior = numero;
				}
			}
			
			contador++;
						
		}
		
		
		System.out.printf("%nMaior Valor: %d%nSegundo Maior: %d%n", maior, segundoMaior);

	}

}
