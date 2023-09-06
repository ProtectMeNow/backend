package br.com.pulseira.sos.Pulseira.SOS.api;

import br.com.pulseira.sos.Pulseira.SOS.entity.Cliente;
import br.com.pulseira.sos.Pulseira.SOS.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//criando endpoint
@RestController
@RequestMapping(value = "/v1/cliente", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Optional<Cliente>> getAllClientesController(){
        //Cliente cliente = new Cliente();

        //cliente.setCpf("123.455.678-98");
        //cliente.setNome("Marcio");

        //repository.save(cliente);;

        //List<Cliente> clientes = repository.findAll();

        Optional<Cliente> clientes = repository.findById(5);

        if(clientes != null && !clientes.isEmpty()){
            return ResponseEntity.status(200).body(clientes);
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}