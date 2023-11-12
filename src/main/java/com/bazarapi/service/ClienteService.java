package com.bazarapi.service;

import com.bazarapi.entity.Cliente;
import com.bazarapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    //crear editar
    public void saveOrUpdate(Cliente cliente){
        clienteRepository.save(cliente);
    }
    //traer clientes

    public List<Cliente> getClientes(){
        return clienteRepository.findAll();
    }

    //traer cliente por id
    public Optional<Cliente> getCliente(Long id){
        return clienteRepository.findById(id);
    }

    //eliminar
    public void delete(Long id){
        clienteRepository.deleteById(id);
    }


}
