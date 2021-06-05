package ControleDeVeiculos.demo.resources;

import ControleDeVeiculos.demo.dominio.Veiculo;
import ControleDeVeiculos.demo.services.AnoVeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnoCarroRestService {

    @Autowired
    private AnoVeiculoService anoVeiculoService;

    public ResponseEntity<Veiculo> getAno(@PathVariable String ano){
        Veiculo veiculo = anoVeiculoService.buscarVeiculoPorAno(ano);

        return veiculo !=null ? ResponseEntity.ok().body(veiculo) : ResponseEntity.notFound().build();
    }
}
