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
		System.out.println("- CONFIGURA��O DA MAQUINA DE LAVAR --");
		System.out.println("=====================================\n");
		
		System.out.print("Modelo: ");
		modelo = teclado.next();
		System.out.print("Nome: ");
		nome = teclado.next();
		System.out.print("Voltagem: (220v ou 110v ou 220/110v: ");
		voltegem = teclado.nextInt();
		System.out.print("Quantos Kg? ");
		kG= teclado.nextInt();
		System.out.print("Dura��o do Est�gio 1 - Lava��o Pesada: ");
		duracaoEstagio1 = teclado.nextInt();
		System.out.print("Dura��o do Est�gio 2 - Lava��o Normal: ");
		duracaoEstagio2 = teclado.nextInt();
		System.out.print("Dura��o do Est�gio 3 - Lava��o R�pido: ");
		duracaoEstagio3 = teclado.nextInt();
		System.out.print("Dura��o do Est�gio 4 - Enxague: ");
		duracaoEstagio4 = teclado.nextInt();
		System.out.print("Dura��o do Est�gio 5 - Centrifuga: ");
		duracaoEstagio5 = teclado.nextInt();
	}
	
	public void simular() throws InterruptedException{
		
		int estagioInicial;
		
		System.out.println("\n=====================================");
		System.out.println("--- SIMULA��O DA MAQUINA DE LAVAR ---");
		System.out.println("=====================================\n");
		
		System.out.println("Simulando o modelo: " + modelo + " - " + nome + " - " + kG + " - Voltagem: " + voltegem);
		
		System.out.println("\n=====================================");
		System.out.println("- QUAL ESTAGIO VO�� DESEJA COME�AR? -");
		System.out.println("=====================================\n");
		
		System.out.println("1 - Lava��o Pesada: ");
		System.out.println("2 - Lava��o Normal: ");
		System.out.println("3 - Lava��o leve: ");
		System.out.println("4 - Enxague: ");
		System.out.println("5 - Configurar: ");
		System.out.println("Selecione o est�gio inicial: ");
		estagioInicial = teclado.nextInt();
		
		if(estagioInicial == 1) {

			tempo = (1000 * duracaoEstagio1) / 5;
			
			for(int i = 0; i < 5; i++) {
				System.out.println("Est�gio 1 - Em Lava��o Pesada: " + status + "%");
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
				System.out.println("Est�gio 2 - Em Lava��o Normal: " + status + "%");
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
				System.out.println("Est�gio 3 - Em Lava��o Leve: " + status + "%");
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
				System.out.println("Est�gio 4 - Em Enxague: " + status + "%");
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
				System.out.println("Est�gio 5 - Em Centrifuga: " + status + "%");
				status += 20;
				Thread.sleep(tempo);
			}
			status = 20;
			
			System.out.println("\nSimula��o Finalizada");
		}		
	}
}
