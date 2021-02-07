package perifaDelivery.PerifaBuy.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name = "tb_carrinho")
public class Carrinho {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	@OneToMany
	private List<Produto> listaProduto;
	//@Column
	//@OneToMany(mappedBy = "carrinho", cascade = CascadeType.ALL)
	//@JsonIgnoreProperties("carrinho")
	//private List<Produto> produto;
	
	
		
	@Column
	private int id_cliente;

	
	@NotNull
	private float valorTotal;

	@NotNull
	@Size(max = 10)
	private String formaPagamento;

	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());

	// ---------------------------------------------------------------------------
	/*
	função para calcular o valor total
	public void calcValorTotal() {
		for Produto produto in this.listaProduto:
			this.valorTotal += produto.valor
	}

	Extra: forma de pagamento 
	função para forma de pagamento

	função para adicionar o produto no carrinho
	public adicionarProduto(Produto produto) {}

	função para buscar item na lista
	public void buscarProduto(this.listaProduto) {}
	remover item da lista
	public void removerProduto(this.listaProduto) {}
	*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
