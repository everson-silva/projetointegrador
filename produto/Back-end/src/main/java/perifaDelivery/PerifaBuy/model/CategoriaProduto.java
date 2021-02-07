package perifaDelivery.PerifaBuy.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="tb_categoriaProduto")
public class CategoriaProduto {
	
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)	//Equivalente ao - PRIMARY KEY AUTO_INCREMENT
	private int id_categoria_produto;
	
	private String nomeCategoria;
	
	@OneToMany(mappedBy = "categoria", cascade= CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	public int getId_categoria_produto() {
		return id_categoria_produto;
	}

	public void setId_categoria_produto(int id_categoria_produto) {
		this.id_categoria_produto = id_categoria_produto;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	//@OneToMany(mappedBy = "nome", cascade = CascadeType.ALL)
	//@JsonIgnoreProperties("nome")
	//@Column
	//private List<CategoriaProduto> nomeCategoriaProduto;
	
	//@Column
	///@OneToMany(mappedBy = "carrinho", cascade = CascadeType.ALL)
	//@JsonIgnoreProperties("carrinho")
	//private List<Produto> produto;
	
	

//	public String getNomeCategoriaProduto() {
	//	return nomeCategoriaProduto;
	//}
	//public void setNomeCategoriaProduto(String nomeCategoriaProduto) {
		//this.nomeCategoriaProduto = nomeCategoriaProduto;
	//}
	// getters and setters

	
}