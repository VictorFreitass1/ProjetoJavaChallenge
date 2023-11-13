package pamv.com.menu;

import java.util.Scanner;

import pamv.com.dominio.Veiculo;

public class MenuDanosNaturais {
	private Scanner scanner;

    public MenuDanosNaturais(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exibirMenuDanosNaturais() {
        while (true) {
            System.out.println();
            System.out.println("Selecione uma op��o:\n");
            System.out.println("1 - Verificar se h� danos causados por enchentes ou inunda��es");
            System.out.println("2 - Verificar se h� danos causados por tempestades ou queda de �rvores");
            System.out.println("3 - Levar o ve�culo a um mec�nico especializado");
            System.out.println("4 - Retornar para p�gina anterior");
            System.out.println("5 - Encerrar atendimento\n");

            String tipoProblemas = scanner.nextLine();

            if (tipoProblemas.equals("1")) {
                System.out.println();
                System.out.println("Estamos verificando se h� danos causados por enchentes ou inunda��es em sua regi�o e entraremos em contato para providenciar a assist�ncia necess�ria.\n");
                TiposDeProblemas.escolhaUsuarioEncerramento();
            } else if (tipoProblemas.equals("2")) {
                System.out.println();
                System.out.println("Estamos verificando se h� danos causados por tempestades ou queda de �rvores em sua regi�o e entraremos em contato para providenciar a assist�ncia necess�ria.\n");
                TiposDeProblemas.escolhaUsuarioEncerramento();
            } else if (tipoProblemas.equals("3")) {
                System.out.println();
                Veiculo veiculo = new Veiculo();
                String tipoVeiculo = veiculo.getTipoVeiculo();

                if (tipoProblemas.equals("3")) {
                    System.out.println();

                    if (tipoVeiculo.equals("grande porte")) {
                    	System.out.println("Estamos encaminhando a sua localiza��o um guincho para ve�culos de grande porte, para que possamos levar o seu ve�culo a um mec�nico especializado para diagnosticar e reparar os danos causados por fen�menos naturais.\n");
                    } else {
                        System.out.println("Estamos encaminhando a sua localiza��o um guincho para ve�culos de pequeno/m�dio porte, para que possamos levar o seu ve�culo a um mec�nico especializado para diagnosticar e reparar os danos causados por fen�menos naturais.\n");
                    }
                }
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
