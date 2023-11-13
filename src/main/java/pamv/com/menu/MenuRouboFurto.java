package pamv.com.menu;

import java.util.Scanner;

public class MenuRouboFurto {
	private Scanner scanner;

    public MenuRouboFurto(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exibirMenuRouboFurto() {
        while (true) {
            System.out.println();
            System.out.println("Selecione uma op��o:\n");
            System.out.println("1 - Registrar o roubo ou furto junto �s autoridades");
            System.out.println("2 - Acionar o seguro");
            System.out.println("3 - Tomar medidas de seguran�a para evitar futuros roubos ou furtos");
            System.out.println("4 - Retornar para p�gina anterior");
            System.out.println("5 - Encerrar atendimento\n");

            String tipoProblemas = scanner.nextLine();

            if (tipoProblemas.equals("1")) {
                System.out.println();
                System.out.println("Estamos registrando o roubo ou furto junto �s autoridades!\n");
                TiposDeProblemas.escolhaUsuarioEncerramento();
            } else if (tipoProblemas.equals("2")) {
                System.out.println();
                System.out.println("Estamos acionando o seguro para te ajudar!\n");
                TiposDeProblemas.escolhaUsuarioEncerramento();
            } else if (tipoProblemas.equals("3")) {
                System.out.println();
                System.out.println("Algumas medidas de seguran�a que voc� pode tomar para evitar futuros roubos ou furtos incluem:\n");
                System.out.println("- Estacionar em locais bem iluminados e movimentados;\n");
                System.out.println("- Travar as portas e fechar os vidros ao deixar o ve�culo;\n");
                System.out.println("- Utilizar dispositivos antifurto, como alarmes e travas;\n");
                System.out.println("- N�o deixar objetos de valor � vista no interior do ve�culo;\n");
                System.out.println("- Utilizar sistemas de rastreamento veicular;\n");
                System.out.println("- Ter cuidado ao emprestar o ve�culo a terceiros;\n");
                System.out.println("- Guardar o ve�culo em garagens seguras e com controle de acesso.\n");
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
