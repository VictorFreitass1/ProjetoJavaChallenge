package pamv.com.menu;

import java.util.Scanner;

public class TiposDeProblemas {
	private Scanner scanner;

	    public TiposDeProblemas(Scanner scanner) {
	        this.scanner = scanner;
	    }

	    public void exibirMenu() {
	        while (true) {
	            System.out.println();
	            System.out.println("Selecione o tipo de problema:\n");
	            System.out.println("1 - Acidentes de tr�nsito");
	            System.out.println("2 - Roubo ou furto");
	            System.out.println("3 - Problema el�trico");
	            System.out.println("4 - Problema mec�nico");
	            System.out.println("5 - Danos causados por fen�menos naturais");
	            System.out.println("6 - Sair\n");

	            String escolhaUsuario = scanner.nextLine();

	            if (escolhaUsuario.equals("1")) {
	                MenuAcidentesTransito menuAcidentesTransito = new MenuAcidentesTransito(scanner);
	                menuAcidentesTransito.exibirMenuAcidentesTransito();
	            }else if (escolhaUsuario.equals("2")) {
	                MenuRouboFurto menuRouboFurto = new MenuRouboFurto(scanner);
	                menuRouboFurto.exibirMenuRouboFurto();
	            } else if (escolhaUsuario.equals("3")) {
	                MenuProblemaEletrico menuProblemaEletrico = new MenuProblemaEletrico(scanner);
	                menuProblemaEletrico.exibirMenuProblemasEletricos();
	            } else if (escolhaUsuario.equals("4")) {
	                MenuProblemaMecanico menuProblemaMecanico = new MenuProblemaMecanico(scanner);
	                menuProblemaMecanico.exibirMenuProblemasMecanicos();
	            } else if (escolhaUsuario.equals("5")) {
	                MenuDanosNaturais menuDanosNaturais = new MenuDanosNaturais(scanner);
	                menuDanosNaturais.exibirMenuDanosNaturais();
	            } else if (escolhaUsuario.equals("6")) {
	                System.out.println();
	                System.out.println("Agradecemos por utilizar nosso sistema de ajuda!");
	                System.exit(0);
	            } else {
	                System.out.println("Op��o inv�lida. Por favor, selecione uma op��o v�lida.");
	            }
	        }
	    }
	    public static void escolhaUsuarioEncerramento() {
	        System.out.println("O atendimento foi encerrado. Obrigado por utilizar nosso servi�o!");
	        System.exit(0);
	    }
}
