package br.com.fiap.springpjchamadostecnicos.repository;

import br.com.fiap.springpjchamadostecnicos.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
