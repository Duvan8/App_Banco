package com.Banco.AppBanco.controller;

import com.Banco.AppBanco.entidades.ClienteBanco;
import com.Banco.AppBanco.repositorio.ClienteRepositorio;
import com.Banco.AppBanco.servicios.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.Column;
import java.util.List;

@Controller
public class ControllerCliente {

    @Autowired
    private ClienteServicio servicio;
    @GetMapping("cliente")
    public String listarclientess(Model modelo){
        modelo.addAttribute("nombre",servicio.listarclientes());
        return ("clientes");
    }

    @GetMapping("/cliente/nuevo")

    public String formularioregistrocliente(Model modelo){
        modelo.addAttribute("clienteinsertar", new ClienteBanco() {});
        return "insertarcliente";
    }

    @Autowired
    private ClienteRepositorio repositorio;

    @PostMapping("cliente/guardar")

    public String registrardatoscliente(ClienteBanco cliente){
        ClienteBanco clienteguardar=repositorio.save(new ClienteBanco(cliente.getDocumento(),cliente.getNombre(),cliente.getApellido(),cliente.getCorreo(),cliente.getCelular()));
        return "redirect:/cliente";
    }

}
