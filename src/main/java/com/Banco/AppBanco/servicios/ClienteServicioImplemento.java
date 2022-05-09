package com.Banco.AppBanco.servicios;

import com.Banco.AppBanco.entidades.ClienteBanco;
import com.Banco.AppBanco.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicioImplemento implements  ClienteServicio {
    @Autowired
    private ClienteRepositorio clienterepositior;


    @Override
    public List<ClienteBanco>listarclientes(){
        return  clienterepositior.findAll();
    }




}
