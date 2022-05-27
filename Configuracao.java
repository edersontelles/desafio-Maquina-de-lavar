package MaquinaDeLavar;

import java.util.Scanner;

public class Configuracao {

	String modelo, nome;
	int voltegem, kG, duracaoEstagio1, duracaoEstagio2, duracaoEstagio3, duracaoEstagio4, duracaoEstagio5;
	int tempo = 0; // milissegundos
	int status = 20; // % dos estagios
	
	Scanner teclado = new Scanner(System.in);
	
	public void configurar() {

		System.out.println("\n=====================================");
		System.out.println("- CONFIGURAÇÃO DA MAQUINA DE LAVAR --");
		System.out.println("=====================================\n");
		
		System.out.print("Modelo: ");
		modelo = teclado.next();
		System.out.print("Nome: ");
		nome = teclado.next();
		System.out.print("Voltagem: (220v ou 110v ou 220/110v: ");
		voltegem = teclado.nextInt();
		System.out.print("Quantos Kg? ");
		kG= teclado.nextInt();
		System.out.print("Duração do Estágio 1 - Lavação Pesada: ");
		duracaoEstagio1 = teclado.nextInt();
		System.out.print("Duração do Estágio 2 - Lavação Normal: ");
		duracaoEstagio2 = teclado.nextInt();
		System.out.print("Duração do Estágio 3 - Lavação Rápido: ");
		duracaoEstagio3 = teclado.nextInt();
		System.out.print("Duração do Estágio 4 - Enxague: ");
		duracaoEstagio4 = teclado.nextInt();
		System.out.print("Duração do Estágio 5 - Centrifuga: ");
		duracaoEstagio5 = teclado.nextInt();
	}
	
	public void simular() throws InterruptedException{
		
		int estagioInicial;
		
		System.out.println("\n=====================================");
		System.out.println("--- SIMULAÇÃO DA MAQUINA DE LAVAR ---");
		System.out.println("=====================================\n");
		
		System.out.println("Simulando o modelo: " + modelo + " - " + nome + " - " + kG + " - Voltagem: " + voltegem);
		
		System.out.println("\n=====================================");
		System.out.println("- QUAL ESTAGIO VOÇÊ DESEJA COMEÇAR? -");
		System.out.println("=====================================\n");
		
		System.out.println("1 - Lavação Pesada: ");
		System.out.println("2 - Lavação Normal: ");
		System.out.println("3 - Lavação leve: ");
		System.out.println("4 - Enxague: ");
		System.out.println("5 - Configurar: ");
		System.out.println("Selecione o estágio inicial: ");
		estagioInicial = teclado.nextInt();
		
		if(estagioInicial == 1) {

			tempo = (1000 * duracaoEstagio1) / 5;
			
			for(int i = 0; i < 5; i++) {
				System.out.println("Estágio 1 - Em Lavação Pesada: " + status + "%");
				status += 20;
				Thread.sleep(tempo);
			}
			status = 20;
			estagioInicial = 2;
			System.out.print("\n");
		}
		if(estagioInicial == 2) { 

			tempo = (1000 * duracaoEstagio2) / 5;
			
			for(int i = 0; i < 5; i++) {
				System.out.println("Estágio 2 - Em Lavação Normal: " + status + "%");
				status += 20;
				Thread.sleep(tempo);
			}
			status = 20;
			estagioInicial = 3;
			System.out.print("\n");
		}
		if(estagioInicial == 3) {
			
			tempo = (1000 * duracaoEstagio3) / 5;
			
			for(int i = 0; i < 5; i++) {
				System.out.println("Estágio 3 - Em Lavação Leve: " + status + "%");
				status += 20;
				Thread.sleep(tempo);
			}
			status = 20;
			estagioInicial = 4;
			System.out.print("\n");
		}
		if(estagioInicial == 4) {
			
			tempo = (1000 * duracaoEstagio4) / 5;
			
			for(int i = 0; i < 5; i++) {
				System.out.println("Estágio 4 - Em Enxague: " + status + "%");
				status += 20;
				Thread.sleep(tempo);
			}
			status = 20;
			estagioInicial = 5;
			System.out.print("\n");
		}
		if(estagioInicial == 5) {
			
			tempo = (1000 * duracaoEstagio5) / 5;
			
			for(int i = 0; i < 5; i++) {
				System.out.println("Estágio 5 - Em Centrifuga: " + status + "%");
				status += 20;
				Thread.sleep(tempo);
			}
			status = 20;
			
			System.out.println("\nSimulação Finalizada");
		}		
	}
}
