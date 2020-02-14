package com.apirest.efi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

@RequestMapping({ "/aplicar-encuesta", "/panel", "/user-alertas", "/user-indicadores", "/encuestas-realizadas", "/login", "/dashboard",
"/dashboard", "/usuarios", "/calendario", "/categorias", "/indicadores-tipo", "/indicadores-grupo", "/indicadores-variables", "/plan-cuenta",
 "/empresa", "/entidades", "/reportes", "/encuesta", "/grupo-preguntas", "/preguntas", "/categorias-preguntas", "/confirmar/usuarioefi/**", "/confirmar/**",
    "/tendencias"})
   public String index() {
       return "forward:/index.html";
   }
} 