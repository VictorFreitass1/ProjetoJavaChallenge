package pamv.com.service;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import pamv.com.banco.VeiculoDAO;
import pamv.com.dominio.Veiculo;

@Path("/veiculos")
public class VeiculoService {

    private VeiculoDAO veiculoDAO;

    public VeiculoService() {
        this.veiculoDAO = new VeiculoDAO();
    }

    @POST
    @Path("/cadastrar")
    @Consumes(MediaType.APPLICATION_JSON)
    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculoDAO.inserirVeiculo(veiculo);
    }

    @PUT
    @Path("/atualizar/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void atualizarVeiculo(@PathParam("id") int id, Veiculo veiculo) {
        veiculo.setId(id);
        veiculoDAO.atualizarVeiculo(veiculo);
    }

    @DELETE
    @Path("/excluir/{id}")
    public void excluirVeiculo(@PathParam("id") int id) {
        veiculoDAO.excluirVeiculo(id);
    }

    @GET
    @Path("/listar")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Veiculo> listarVeiculos() {
        return veiculoDAO.obterTodosVeiculos();
    }
}