package ControleDeVeiculos.demo.resources;


import ControleDeVeiculos.demo.dominio.Usuario;
import ControleDeVeiculos.demo.dominio.Veiculo;
import ControleDeVeiculos.demo.services.UsuarioService;
import ControleDeVeiculos.demo.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value = "/usuarios")
public class VeiculoResource {

    @Autowired
    private UsuarioService service;

    @Autowired
    private VeiculoService vservice;




    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@Valid @RequestBody Veiculo obj) {
        Veiculo obj = vservice.insert(obj);
        obj = vservice.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created((uri)).build();

    }
}
