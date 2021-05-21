package com.dwa.foro.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo {

	@GetMapping("/demo/portada")
	public String demo() {
		
		return "portada";
	}
}
