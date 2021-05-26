package io.github.douglasfps.service;

import io.github.douglasfps.model.Cliente;
import io.github.douglasfps.repository.ClienteRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepositoy repositoy;


    @Autowired
    public ClienteService (  ClienteRepositoy repositoy ){
        this.repositoy = repositoy;
    }

    public void salvarCliente(Cliente cliente){
         validarCliente(cliente);
         this.repositoy.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        // Aplica Validações
    }
}
