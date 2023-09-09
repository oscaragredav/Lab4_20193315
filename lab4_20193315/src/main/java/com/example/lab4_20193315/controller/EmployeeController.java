package com.example.lab4_20193315.controller;

import com.example.lab4_20193315.entity.Employees;
import com.example.lab4_20193315.repository.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping({"/employee","employees"})
public class EmployeeController {
    final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping(value = {"/", "","/lista","/list"})
    public String listarTransportistas(Model model) {

        model.addAttribute("lista", employeeRepository.findAll());

        return "employee/lista";
    }

    @PostMapping("/buscarPorNombre")
    public String buscarPorNombre(@RequestParam("searchField") String searchField, Model model) {

        List<Employees> lista = employeeRepository.findByName(searchField);
        model.addAttribute("lista", lista);
        model.addAttribute("textoBuscado", searchField);

        return "employee/lista";
    }
    @GetMapping("/edit")
    public String editar(Model model, @RequestParam("id") int id) {

        Optional<Employees> optEmployee = employeeRepository.findById(id);

        if (optEmployee.isPresent()) {
            Employees shipper = optEmployee.get();
            model.addAttribute("employee", shipper);
            return "employee/editFrm";
        } else {
            return "redirect:/employee/list";
        }
    }
}
