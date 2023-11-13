package pamv.com.menu;

import java.util.Scanner;

public class MenuProblemaMecanico {
	private Scanner scanner;

    public MenuProblemaMecanico(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exibirMenuProblemasMecanicos() {
        while (true) {
            System.out.println();
            System.out.println("Selecione uma op��o:\n");
            System.out.println("1 - Verificar o �leo e o l�quido de arrefecimento");
            System.out.println("2 - Verificar os pneus e o sistema de suspens�o");
            System.out.println("3 - Levar o ve�culo a um mec�nico especializado");
            System.out.println("4 - Retornar para p�gina anterior");
            System.out.println("5 - Encerrar atendimento\n");

            String tipoProblemas = scanner.nextLine();

            if (tipoProblemas.equals("1")) {
                System.out.println();
                System.out.println("Estamos a seu caminho para que possamos verificar o n�vel e a qualidade do �leo e do l�quido de arrefecimento e fazer os reparos necess�rios.\n");
                TiposDeProblemas.escolhaUsuarioEncerramento();
            } else if (tipoProblemas.equals("2")) {
                System.out.println();
                System.out.println("Estamos a seu caminho para que possamos verificar o estado dos pneus e do sistema de suspens�o, e realizar os devidos reparos.\n");
                TiposDeProblemas.escolhaUsuarioEncerramento();
            } else if (tipoProblemas.equals("3")) {
                System.out.println();
                System.out.println("Estamos encaminhando a sua localiza��o a um guincho para que possamos levar o seu ve�culo a um mec�nico especializado para diagnosticar e reparar o problema el�trico.\n");
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
