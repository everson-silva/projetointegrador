package perifaDelivery.PerifaBuy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import perifaDelivery.PerifaBuy.model.Carrinho;




public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {
	
	public List<Carrinho> findAllByIdContaining(long id);
	
	
}
