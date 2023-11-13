package pamv.com.menu;

import java.util.Scanner;

public class MenuProblemaEletrico {
	private Scanner scanner;

    public MenuProblemaEletrico(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exibirMenuProblemasEletricos() {
        while (true) {
            System.out.println();
            System.out.println("Selecione uma op��o:\n");
            System.out.println("1 - Verificar se h� problemas na bateria ou no alternador");
            System.out.println("2 - Verificar se h� fus�veis queimados");
            System.out.println("3 - Levar o ve�culo a um mec�nico especializado");
            System.out.println("4 - Retornar para p�gina anterior");
            System.out.println("5 - Encerrar atendimento\n");

            String tipoProblemas = scanner.nextLine();

            if (tipoProblemas.equals("1")) {
                System.out.println();
                System.out.println("Estamos a seu caminho para que possamos verificar se a bateria ou o alternador est�o com problemas e fazer os reparos necess�rios.\n");
                TiposDeProblemas.escolhaUsuarioEncerramento();
            } else if (tipoProblemas.equals("2")) {
                System.out.println();
                System.out.println("Estamos a seu caminho para que possamos verificar se h� fus�veis queimados e realizar a troca, caso necess�rio.\n");
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
