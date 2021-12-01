package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloController {
	
	@GetMapping
	public String hello () {
		return "Hello, Generation!";
	}
	
	@GetMapping ("/Atividade-1")
	public String atv1 () {
		return "Habilidade para essa atividade: Orientação aos detalhes!";
	}
	
	@GetMapping ("/Atividade-2")
	public String atv2 () {
		return "Objetivo de aprendizagem: Precisão Técnica!"; 
	
	}

}
