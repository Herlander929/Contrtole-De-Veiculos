package ControleDeVeiculos.demo.services;

import ControleDeVeiculos.demo.dominio.Usuario;
import ControleDeVeiculos.demo.dominio.Veiculo;
import ControleDeVeiculos.demo.repositories.VeiculoRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repo;


    @Transactional
    public String buscar(Integer id){
        Veiculo obj = repo.findAll(id);
        if  (obj == null) {
            throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + Usuario.class.getName());
        }
        return obj + obj.getDiaDoRodizio() + obj.getRodizioAtivo();
    }

    @Transactional
    public Veiculo insert(Veiculo obj){
        obj.setId(null);
        obj = repo.(obj);
        VeiculoRepository.saveAll(obj.getUsuario());
        return obj;
    }
}
