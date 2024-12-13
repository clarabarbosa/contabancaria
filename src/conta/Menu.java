package conta;

import java.util.Scanner;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

		// Instanciamento | Classe -> Objeto Utilizavel
		/*Conta c1 = new Conta(1, 123, 1, "Maria das Neves", 500f);
		c1.setSaldo(10000f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();*/

		//Instaciamento/Instancia da classe 
		//Teste Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "Francisco", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		//Teste Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Josivaldo", 100000.0f, 15);
	    cp1.visualizar();
	    cp1.sacar(1000.0f);
	    cp1.visualizar();
	    cp1.depositar(5000.0f);
	    cp1.visualizar();
	    
	    
		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
					+ "***********************************************************");
			System.out.println("                                                           ");
			System.out.println("                   Banco Acerola                           ");
			System.out.println("                                                           ");
			System.out.println("***********************************************************");
			System.out.println("                                                           ");
			System.out.println("                 1 - Criar Conta                           ");
			System.out.println("                 2 - Listar todas as Contas                ");
			System.out.println("                 3 - Buscar Conta por número               ");
			System.out.println("                 4 - Aualizar dados da Conta               ");
			System.out.println("                 5 - Apagar Conta                          ");
			System.out.println("                 6 - Sacar                                 ");
			System.out.println("                 7 - Depositar                             ");
			System.out.println("                 8 - Transferir valores entre Contas       ");
			System.out.println("                 9 - Sair                                  ");
			System.out.println("                                                           ");
			System.out.println("***********************************************************");
			System.out.println("Entre com a opção desejada:                                ");
			System.out.println("                                                           " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_YELLOW_BOLD + "\nBanco Acerola - O seu futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nCriar Conta\n\n");
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listas todas as Contas\n\n");
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre contas\n\n");
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida\n");
				break;
			}
		}

	}

	private static void sobre() {
		System.out.println("\n*********************************************");
		System.out.println("Projeto desenvolvido por Maria Clara Barbosa   ");
		System.out.println("Maria Clara - mah201218@gmail.com              ");
		System.out.println("https://github.com/clarabarbosa                ");
		System.out.println("***********************************************");

	}

}
