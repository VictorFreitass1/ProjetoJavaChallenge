package pamv.com.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pamv.com.infra.viacep.CorreiosImpl;

public class CorreiosTest {
	@Test
	void buscarEndereco() {
		CorreiosImpl c = new CorreiosImpl();
		Endereco e = c.buscarEnderecoPor("01001000");
		assertEquals("01001-000", e.getCep());
		assertEquals("Praça da Sé", e.getLogradouro());
		assertEquals("lado ímpar", e.getComplemento());
		assertEquals("Sé", e.getBairro());
		assertEquals("São Paulo", e.getLocalidade());
		assertEquals("SP", e.getUf());
}
}

