package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class WebTeste {
    private Set<Integer> lista;

    @GetMapping("/")
    public String listar(Model model) {
        lista = new HashSet<>(povoarLista(8));
        model.addAttribute("lista", lista);
        return "index";
    }

    private int geraNumerosAleatorios() {
        Random rd = new Random();
        return rd.nextInt(1, 17);
    }

    private Set<Integer> povoarLista(int tamanho) {
        return IntStream.range(0, tamanho)
                .mapToObj(i -> geraNumerosAleatorios())
                .collect(Collectors.toSet());
    }
}
