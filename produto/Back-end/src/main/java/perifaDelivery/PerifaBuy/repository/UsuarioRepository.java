package perifaDelivery.PerifaBuy.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import perifaDelivery.PerifaBuy.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
	public List<Usuario> findAllByNomeContainingIgnoreCase (String nome);
	//public Optional<Usuario> findByNomeAndPassword(String nome, String senha);
	//public Usuario findByNome(String nome) {return Usuario;}
	public Usuario findByNome(String login); //ATUALIZADO
	public Optional<Usuario> findByUsuario(String usuario);
	
}
//Metodo utilizado para a implementação do CRUD(cirar,ler,atualizar e deletar)

