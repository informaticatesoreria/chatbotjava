package gob.edomex.tesoreria.chatbot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gob.edomex.tesoreria.chatbot.dto.request.UsuarioTelefonoRequestDTO;
import gob.edomex.tesoreria.chatbot.dto.response.UsuarioTelefonoResponseDTO;
import gob.edomex.tesoreria.chatbot.mapper.UsuarioTelefonoMapper;
import gob.edomex.tesoreria.chatbot.model.UsuarioTelefono;
import gob.edomex.tesoreria.chatbot.service.IUsuarioTelefonoService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/usuario/telefono")
public class UsuarioTelefonoController {
	
	private final IUsuarioTelefonoService usuarioTelefonoService;
	
	private final UsuarioTelefonoMapper usuarioTelefonoMapper;
	
	@GetMapping("/{telefono}")
	public ResponseEntity<UsuarioTelefonoResponseDTO> getByTelefono(@PathVariable Long telefono){
		
		UsuarioTelefono usuarioT = usuarioTelefonoService.findByPhone(telefono);
		return ResponseEntity.ok(usuarioTelefonoMapper.toDTOResponse(usuarioT));
		
	}
	
	
	@PostMapping()
	public ResponseEntity<?> saveUsuarioTelefono(@RequestBody UsuarioTelefonoRequestDTO usuarioTelDTO){
		UsuarioTelefono usuarioT = usuarioTelefonoService.save(usuarioTelDTO);
		
		return new ResponseEntity<>(usuarioTelefonoMapper.toDTOResponse(usuarioT), HttpStatus.CREATED);
		
	}

}
