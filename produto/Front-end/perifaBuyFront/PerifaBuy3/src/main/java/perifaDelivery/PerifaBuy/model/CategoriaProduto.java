package perifaDelivery.PerifaBuy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tb_categoriaProduto")
public class CategoriaProduto {
	
	@Id
	@Column
	//Equivalente ao - PRIMARY KEY AUTO_INCREMENT
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_categoria_produto;
	
	private String nomeCategoria;
	
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
	public String getNomeCategoria() {
		return nomeCategoria;
	 }
	public int getId_categoria_produto() {
		return id_categoria_produto;
	}
	public void setId_categoria_produto(int id_categoria_produto) {
		this.id_categoria_produto = id_categoria_produto;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
	
}