package pamv.com.dominio;

import java.util.Scanner;

public class Veiculo {
    private int id;
    private String nome;
    private String marca;
    private String modelo;
    private String tipoDeCarga;
    private int eixos;
    private Scanner scanner;

    public Veiculo(int id, String nome, String marca, String modelo, String tipoDeCarga, int eixos) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoDeCarga = tipoDeCarga;
        this.eixos = eixos;
        this.scanner = new Scanner(System.in);
    }

    public Veiculo() {
        eixos = 0;
        this.scanner = new Scanner(System.in);
    }

    public void solicitarInformacoesVeiculo() {
        System.out.println("Por favor, insira as informa��es do seu ve�culo:");

        System.out.print("Digite o nome do seu ve�culo: ");
        nome = scanner.nextLine();

        System.out.print("Digite a marca do seu ve�culo: ");
        marca = scanner.nextLine();

        System.out.print("Modelo do ve�culo: ");
        modelo = scanner.nextLine();

        System.out.print("Tipo de carga do ve�culo: ");
        tipoDeCarga = scanner.nextLine();

        System.out.print("Digite quantos eixos possui seu ve�culo: ");
        while (true) {
            if (scanner.hasNextInt()) {
                eixos = scanner.nextInt();
                scanner.nextLine();
                if (eixos >= 1) {
                    break;
                } else {
                    System.out.println("Erro: Digite um n�mero maior ou igual a 1.");
                }
            } else {
                System.out.println("Erro: Digite um n�mero v�lido.");
                scanner.nextLine();
            }
        }
    }

    public void tipoVeiculo() {
        if (eixos > 4) {
            System.out.println("Seu ve�culo � considerado de grande porte.");
        } else if (eixos >= 1) {
            System.out.println("Seu ve�culo � considerado de pequeno/m�dio porte.");
        } else {
            System.out.println("Digite um n�mero v�lido.");
        }
    }

    public String getTipoVeiculo() {
        if (eixos > 2) {
            return "grande porte";
        } else {
            return "pequeno/m�dio porte";
        }
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoDeCarga() {
        return tipoDeCarga;
    }

    public int getEixos() {
        return eixos;
    }

    public Scanner getScanner() {
        return scanner;
    }

	public String getNome() {
		return nome;
	}
	
	public String getMarca() {
		return marca;	
	}

	public int getId() {
		return id;
	}

	public void setNome(String string) {
	
	}

	public void setId(int id2) {
		// TODO Auto-generated method stub
		
	}

}
