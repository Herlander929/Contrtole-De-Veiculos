package ControleDeVeiculos.demo.repositories;

import ControleDeVeiculos.demo.dominio.Usuario;
import ControleDeVeiculos.demo.dominio.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {
}
