package gob.edomex.tesoreria.chatbot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gob.edomex.tesoreria.chatbot.model.Flujo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("flujo")
public class FlujoController {
	
	@GetMapping()
	public List<Flujo> getFlujos() {
		
		Flujo flujo1 = Flujo.builder()
		.id(1)
		.key("1")
		.descripcion("Impresora no Imprime")
		.respuestas(new ArrayList<String>(Arrays.asList("1.-Revisar que se encuentre encendida la impresora, que contenga hojas y tóner.","2.-*IMPRESORA LOCAL:* Revisar que el cable USB de la impresora se encuentre conectado al equipo.")))
		.build();
		
		Flujo flujo2 = Flujo.builder()
				.id(2)
				.key("1")
				.descripcion("Conexion de internet")
				//.respuestas(new ArrayList<String>(Arrays.asList("2.-*IMPRESORA LOCAL:* Revisar que el cable USB de la impresora se encuentre conectado al equipo.")))
				.respuestas(new ArrayList<String>(Arrays.asList("Probando...")))
				.build();
				
		List<Flujo> flujos = new ArrayList<Flujo>(Arrays.asList(flujo1, flujo2));
		
		
		return flujos;
	}
	

}
