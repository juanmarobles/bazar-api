package com.bazarapi.controller;

import com.bazarapi.entity.Cliente;
import com.bazarapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "bazar/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    //traer todos los clientes
    @GetMapping()
    public List<Cliente> getClientes(){
        return clienteService.getClientes();
    }

    //traer cliente x id
    @GetMapping("/{id_cliente}")
    public Optional<Cliente> getClienteById(@PathVariable ("id_cliente") Long id_cliente ){
        return clienteService.getCliente(id_cliente);
    }

    //guardar clientes
    @PostMapping("/crear")
    public void saveUpdate(@RequestBody Cliente cliente){
    clienteService.saveOrUpdate(cliente);
    }


    //eliminar
    @DeleteMapping("/eliminar/{id_cliente}")
    public void delete(@PathVariable("id_cliente") Long id_cliente){
        clienteService.delete(id_cliente);
    }
}
