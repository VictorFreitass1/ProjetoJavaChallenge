package pamv.com.controller;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import pamv.com.banco.ClienteDAO;
import pamv.com.dominio.Cliente;

@Path("/clientes")
public class ClienteController {
    private ClienteDAO clienteDAO;

    public ClienteController() {
        this.clienteDAO = new ClienteDAO();
    }

    @POST
    @Path("/cadastrar")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void cadastrarCliente(
            @FormParam("nome") String nome,
            @FormParam("email") String email,
            @FormParam("senha") String senha) {
        Cliente cliente = new Cliente(nome, email, senha);
        clienteDAO.inserirCliente(cliente.getNome(), cliente.getEmail(), cliente.getSenha());
    }

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String realizarLogin(
            @FormParam("email") String email,
            @FormParam("senha") String senha) {
        if (clienteDAO.verificarLogin(email, senha)) {
            return "Login realizado com sucesso!";
        } else {
            return "Email ou senha inv�lidos. Tente novamente.";
        }
    }

    @GET
    @Path("/nome/{email}")
    @Produces(MediaType.TEXT_PLAIN)
    public String obterNomeCliente(@PathParam("email") String email) {
        return clienteDAO.getNomeCliente(email);
    }
}
