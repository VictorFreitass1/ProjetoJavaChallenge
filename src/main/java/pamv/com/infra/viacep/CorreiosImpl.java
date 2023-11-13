package pamv.com.infra.viacep;

import java.io.IOException;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import pamv.com.dominio.Correios;
import pamv.com.dominio.Endereco;

public class CorreiosImpl implements Correios {
		
	public Endereco buscarEnderecoPor(String cep) {
		OkHttpClient clienteHttp = new OkHttpClient().newBuilder()
				.build();
		Request requisicao = new Request.Builder()
				.url("https://viacep.com.br/ws/"+cep+"/json")
				.method("GET", null)
				.build();
		Endereco endereco = null;
		try {
			Response resposta =
clienteHttp.newCall(requisicao).execute();
			if (resposta.isSuccessful()) {
				String responseBody = resposta.body().string();

		endereco = new Gson().fromJson(responseBody, Endereco.class);
		} else {
			System.out.println("Erro ao obter o endereço. Código de resposta: " + resposta.code());
			}
			}catch(IOException e) {
				throw new RuntimeException(e);
			}
			return endereco;
	}

}
