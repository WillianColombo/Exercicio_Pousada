package Exercicio_Pousada;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Cliente quartos[] = new Cliente[10];
		
		//Cadastro cliente
		System.out.print("Informe o nome do cliente: ");
		String nome = teclado.nextLine();
		System.out.print("Informe o e-mail do cliente: ");
		String email = teclado.next();
		
		//Valida��o da reserva
		boolean resp = false;
		while(resp == false) {
			System.out.println("Qual � o quarto desejado? Reservas de 0 a 9.");
			int num = teclado.nextInt();
		
			if(num > 0 && num <= 9) {
				if(quartos[num] == null) {
					quartos[num] = new Cliente(nome, email);
					System.out.println("Reserva do quarto " + num + " confirmada.");
					resp = true;
				} else {
					System.out.println("Este quarto n�o est� dispon�vel.");
				}
			} else {
				System.out.println("Resposta inv�lida, tente outra.");
			}
			
		}
		
		//Relat�rio completo das reservas
		System.out.println("Reservas:");
		for(int i = 0; i < 10; i++) {
			if(quartos[i] != null) {
				System.out.println("Quarto " + i + ": " + quartos[i].toString());
			}	
		}
		
		//Relat�rio espec�fico das Reservas
		System.out.print("Informe o n�mero do quarto que deseja consultar: ");
		int resp2 = teclado.nextInt();
		if(quartos[resp2] == null) {
			System.out.println("Quarto n�o reservado");
		} else {
			System.out.println("Quarto reservado para " + quartos[resp2].getNome());
		}
		
		
		teclado.close();
	}

}
