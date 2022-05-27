/**
 * 
 */
package MaquinaDeLavar;

import java.util.Scanner;

/**
 * @author Ederson
 *
 */
public class Maquina {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		Configuracao config = new Configuracao();
		
		Scanner teclado = new Scanner(System.in);
		
		int codigo;
		
		boolean opcaoMenu = true;
		
		while(opcaoMenu) {
			
			System.out.println("\n=====================================");
			System.out.println("--------- MENU DE SIMULA��O ---------");
			System.out.println("=====================================\n");
			
			System.out.println("1 - Configurar a m�quina de lavar");
			System.out.println("2 - Simular a m�quina de lavar");
			System.out.println("0 - Sair");
			
			System.out.print("Digite o c�digo: ");
			codigo = teclado.nextInt();
			
			if(codigo == 1) {
				
				config.configurar();
				
			}else if(codigo == 2) {
				
				if(config.modelo != null) {
					config.simular();
				}else {
					System.err.println("\nMaquina de lavar sem configura��o!!!");
				}
				
				
			}else if(codigo == 0) {
				
				System.out.println("\nSistema finalizado!");
				opcaoMenu = false;
				
			}else {
				System.err.println("\nC�digo invalido!");
			}
		}
	}
}
