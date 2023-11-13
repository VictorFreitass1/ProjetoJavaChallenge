package pamv.com.menu;

import java.util.Scanner;

public class MenuAcidentesTransito {
	private Scanner scanner;

    public MenuAcidentesTransito(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exibirMenuAcidentesTransito() {
        while (true) {
            System.out.println();
            System.out.println("Selecione uma op��o:\n");
            System.out.println("1 - Verificar se h� v�timas e prestar socorro");
            System.out.println("2 - Registrar o acidente junto �s autoridades");
            System.out.println("3 - Acionar o seguro");
            System.out.println("4 - Retornar para p�gina anterior");
            System.out.println("5 - Encerrar atendimento\n");

            String tipoProblemas = scanner.nextLine();
                      
            if (tipoProblemas.equals("1")) {
                System.out.println();
                System.out.println("Estamos enviando uma viatura particular para o endere�o. Iremos te fornecer todo suporte necess�rio para prestar socorro �s v�timas do acidente.\n");
                TiposDeProblemas.escolhaUsuarioEncerramento();
            } else if (tipoProblemas.equals("2")) {
                System.out.println();
                System.out.println("Estamos registrando o acidente junto �s autoridades!\n");
                TiposDeProblemas.escolhaUsuarioEncerramento();
            } else if (tipoProblemas.equals("3")) {
                System.out.println();
                System.out.println("Estamos acionando o seguro para te ajudar!\n");
                TiposDeProblemas.escolhaUsuarioEncerramento();
            } else if (tipoProblemas.equals("4")) {
                break;
            } else if (tipoProblemas.equals("5")) {
                System.out.println();
                System.out.println("Agradecemos por utilizar nosso sistema de ajuda!");
                System.exit(0);
            } else {
                System.out.println();
                System.out.println("Op��o inv�lida. Por favor, selecione uma op��o v�lida.");
            }
        }
    }
}
