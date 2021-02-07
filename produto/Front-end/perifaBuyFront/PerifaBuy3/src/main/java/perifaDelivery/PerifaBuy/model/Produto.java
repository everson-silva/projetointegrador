package perifaDelivery.PerifaBuy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	@NotNull
	private float precoUnitario;
	
	//@ManyToOne
//	@JsonIgnoreProperties("produto")
	//private int id_categoria_produto; // ver como deixar??
	
	@NotNull
	private String imagem_produto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}



	public String getImagem_produto() {
		return imagem_produto;
	}

	public void setImagem_produto(String imagem_produto) {
		this.imagem_produto = imagem_produto;
	}
	
	
	
	

}
