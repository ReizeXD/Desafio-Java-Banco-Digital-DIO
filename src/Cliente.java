
public class Cliente {

	private String nome;
    private Banco banco;
    public Cliente(Banco banco, String nome){
        this.banco=banco;
        this.nome=nome;
        this.banco.adicionarCliente(this);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public Banco getBanco() {
        return banco;
    }

    public void adicionarContas(){

    }
}