package ControleDeVeiculos.demo.services;

import ControleDeVeiculos.demo.dominio.Veiculo;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url= "https://deividfortuna.github.io/fipe/" , name = "anoCarro")
public interface AnoVeiculoService {

    Veiculo buscarVeiculoPorAno(@PathVariable("ano") String ano);
}
