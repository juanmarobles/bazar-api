package com.bazarapi.service;

import com.bazarapi.entity.Producto;
import com.bazarapi.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    //crear o editar
    public void saveOrUpdate (Producto producto){
        productoRepository.save(producto);
    }

    //buscar producto x id
    public Optional<Producto> findProductoByiD (Long idProducto){
        return productoRepository.findById(idProducto);
    }
    //listar todos los productos
    public List<Producto> findAllProductos(){
        return productoRepository.findAll();
    }

    //eliminar producto x ID
    public void deleteProducto(Long idProducto){
        productoRepository.deleteById(idProducto);
    }

}
