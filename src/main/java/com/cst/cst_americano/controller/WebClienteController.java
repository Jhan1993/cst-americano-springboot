package com.cst.cst_americano.controller;

import com.cst.cst_americano.model.Cliente;
import com.cst.cst_americano.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes/nuevo")
    public String showCreateClienteForm(Model model) {
        // Crear un objeto Cliente vacío para ser llenado en el formulario
        model.addAttribute("cliente", new Cliente());
        return "crear_cliente";
    }

    @PostMapping("/clientes")
    public String createCliente(@ModelAttribute("cliente") Cliente cliente) {
        // Guardar el cliente en la base de datos
        clienteService.saveCliente(cliente);
        return "redirect:/clientes/nuevo?success";
    }
}