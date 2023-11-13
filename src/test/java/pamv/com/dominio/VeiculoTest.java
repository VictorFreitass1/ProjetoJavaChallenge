package pamv.com.dominio;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VeiculoTest {

    @Test
    public void testarTipoVeiculo() {
        Veiculo veiculo = new Veiculo(5, "Onix", "Chevrolet", "Carro", "Carga leve", 2);
        assertEquals("pequeno/m�dio porte", veiculo.getTipoVeiculo());
    }

    @Test
    public void testarAtributos() {
        Veiculo veiculo = new Veiculo(6, "Corsa", "Chevrolet", "Carro", "Carga pesada", 4);
        System.out.println("Nome do Ve�culo: " + veiculo.getNome());
        System.out.println("Marca do Ve�culo: " + veiculo.getMarca());
        System.out.println("Modelo do Ve�culo: " + veiculo.getModelo());
        System.out.println("Tipo de Carga do Ve�culo: " + veiculo.getTipoDeCarga());
        System.out.println("Eixos do Ve�culo: " + veiculo.getEixos());
    }
}
