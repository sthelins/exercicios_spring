package org.generation.helloword.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("//hello")
public class hello {

	@GetMapping
	public String hello02() {
		return "Hello Word!";
	}
	
	@GetMapping("/bsm")
	public String mostraMentalidades() {
		return "mentalidades: <br>*Orientação ao futuro<br>*Responsabilidade pessoal <br>*Mentalidade de crescimento <br>*Persistência"
				+ "<br><br>"
				+ "Habilidades: <br>*Trabalho em equipe <br>*Atenção aos detalhes<br> *Proatividade<br> *Comunicação";
	}
	
	@GetMapping("/Objetivos")
	public String mostrarObjetivos() {
		return "Objetivos da semana: <br> *Aprender Spring <br>*Aprender a fazer manjar de coco";
	}
	
	

	
}
