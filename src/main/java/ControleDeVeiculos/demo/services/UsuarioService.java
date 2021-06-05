package ControleDeVeiculos.demo.services;

import ControleDeVeiculos.demo.dominio.Usuario;
import ControleDeVeiculos.demo.repositories.UsuarioRepository;
import ControleDeVeiculos.demo.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    public Usuario buscar(Integer id){
        Usuario obj = repo.findAll(id);
        return obj;
    }

    @Transactional
    public Usuario insert(Usuario obj){
        obj.setId(null);
        obj = repo.save(obj);
        VeiculoRepository.saveAll(obj.getVeiculo());
        return obj;
    }
}
