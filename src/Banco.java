import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Cliente> clientes;
    
    

    public Banco() {
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente>  clientes) {
		this.clientes = clientes;
	}

    public void adicionarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    public void listaDeClientes(){
        for(Cliente cliente : clientes){
            System.out.println(cliente.getNome());
        }
    }

}