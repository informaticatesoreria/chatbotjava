package gob.edomex.tesoreria.chatbot.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gob.edomex.tesoreria.chatbot.dto.request.UsuarioRequestDTO;
import gob.edomex.tesoreria.chatbot.dto.response.UsuarioResponseDTO;
import gob.edomex.tesoreria.chatbot.mapper.UsuarioMapper;
import gob.edomex.tesoreria.chatbot.model.Usuario;
import gob.edomex.tesoreria.chatbot.service.IUsuarioService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	private final IUsuarioService usuarioService;
	private final UsuarioMapper usuarioMapper;
	
	@GetMapping
	public List<Usuario> getAll(){
		
		return usuarioService.getAll();
		
	}
	
	
	@GetMapping("/{id}")
	public Usuario getById(@PathVariable Integer id){
		
		return usuarioService.findById(id);
		
	}
	
	@GetMapping("/name")
	public ResponseEntity<UsuarioResponseDTO> getByName(@RequestBody UsuarioRequestDTO usuarioDTO){
		Usuario user = usuarioService.findByNombreCompleto(usuarioDTO);
				
		return ResponseEntity.ok(usuarioMapper.toDTOResponse(user));
		
	} 
	
	
	
	
	
	

}
