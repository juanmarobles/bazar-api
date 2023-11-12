package com.bazarapi.controller;

import com.bazarapi.entity.Producto;
import com.bazarapi.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("bazar/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    //listar todos los productos
    @GetMapping()
    public List<Producto> getAllProductos(){
        return productoService.findAllProductos();
    }

    //listar proudcto x id
    @GetMapping("{codigo_producto}")
    public Optional<Producto> getProductoById(@PathVariable("codigo_producto") Long codigo_producto){
        return productoService.findProductoByiD(codigo_producto);
    }

    //crear o editar producto
    @PostMapping("/crear")
    public void saveOrUpdateProducto(@RequestBody Producto producto){
        productoService.saveOrUpdate(producto);
    }

    @DeleteMapping("/eliminar/{codigo_producto}")
    public void deleteProducto(@PathVariable ("codigo_producto") Long codigo_producto){
        productoService.deleteProducto(codigo_producto);
    }

}
