package modelo;

public class Cliente extends Pessoa  {

	private String cpf;
	
	public Cliente() {
	}
	
	public Cliente(String cpf)
	{
		this.cpf = cpf;
	}
	
	public Cliente(String cpf, String nome){
		super(nome);
		this.cpf = cpf;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
