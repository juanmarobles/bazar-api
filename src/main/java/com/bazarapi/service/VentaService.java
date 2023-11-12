package com.bazarapi.service;

import com.bazarapi.entity.Venta;
import com.bazarapi.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.dao.DataAccessException;


import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;
    public void saveVenta(Venta venta){
        ventaRepository.save(venta);
    }

    public void delete(Long id){
        ventaRepository.deleteById(id);
    }

    public List<Venta> getAll(){
        return ventaRepository.findAll();
    }

    public void editarVenta(Long id, Venta nuevaInformacionVenta) {
        Optional<Venta> ventaExistente = ventaRepository.findById(id);

        if (ventaExistente.isPresent()) {
            Venta venta = ventaExistente.get();

            // Actualizar la información de la venta con la nueva información
            venta.setFechaVenta(nuevaInformacionVenta.getFechaVenta());
            venta.setTotal(nuevaInformacionVenta.getTotal());
            venta.setUnCliente(nuevaInformacionVenta.getUnCliente());
            venta.setListaProductos(nuevaInformacionVenta.getListaProductos());

            // Guardar la venta actualiza
            ventaRepository.save(venta);
        }
    }
   }
