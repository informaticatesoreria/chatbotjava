package gob.edomex.tesoreria.chatbot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gob.edomex.tesoreria.chatbot.model.Auditoriainventario;
import gob.edomex.tesoreria.chatbot.service.IAuditoriaInventarioService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auditoria")
public class AuditoriaInventarioController {
	
	private final IAuditoriaInventarioService auditoriaService;
	
	
	@GetMapping
	public List<Auditoriainventario> getAll(){
		
		return auditoriaService.getAll();
		
	}
	
	
	
	
	
	
	
	

}
