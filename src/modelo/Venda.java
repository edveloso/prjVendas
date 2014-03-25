package modelo;

public class Venda {

	private int numero;
	private double valorVendido;
	private double vlDesconto;
	private double valorVenda;
	private Produto produto;
	private Cliente cliente;
	protected Vendedor vendedor;
	
	public void efetuarVenda(Produto produto, int qtd, double desconto){
		this.produto = produto;
		this.vlDesconto = desconto;
		//calcule o valor do valorVendido:(vlProduto-desconto)
		//calcule o valor da venda:(valorVendido * qtd)
		//gere uma nova venda: incrementando o numero da venda
	}
	
	public void informarCliente ( Cliente cliente ){
		this.cliente = cliente;
	}
	
	public void informarVendedor( Vendedor vendedor ){
		this.vendedor = vendedor;
	}
	
	
	
}
