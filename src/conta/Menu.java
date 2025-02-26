package conta;

import java.util.Scanner;

import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

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
