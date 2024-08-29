package com.cst.cst_americano.service;

import com.cst.cst_americano.model.Cliente;
import com.cst.cst_americano.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

// Aqui va nuestra logica de negocio
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    // Aqui podemos añador otros métodos como actualizar, eliminar, buscar por ID, etc.

}
