package com.bazarapi.controller;

import com.bazarapi.entity.Venta;
import com.bazarapi.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("bazar/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @PostMapping("/crear")
    public void saveVenta(@RequestBody Venta venta){
        ventaService.saveVenta(venta);
    }

    @DeleteMapping("/eliminar/{codigo_venta}")
    public void delete(@PathVariable("codigo_venta") Long id){
        ventaService.delete(id);
    }

    @GetMapping
    public List<Venta> getAll(){
        return ventaService.getAll();
    }

    @PutMapping("/editar/{codigo_venta}")
    public void editarVenta(@PathVariable("codigo_venta") Long id, @RequestBody Venta nuevaInformacionVenta) {
        ventaService.editarVenta(id, nuevaInformacionVenta);
    }
}
