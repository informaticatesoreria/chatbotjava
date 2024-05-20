package gob.edomex.tesoreria.chatbot.service;

import java.util.List;

import gob.edomex.tesoreria.chatbot.dto.request.UsuarioRequestDTO;
import gob.edomex.tesoreria.chatbot.dto.response.UsuarioResponseDTO;
import gob.edomex.tesoreria.chatbot.model.Usuario;

public interface IUsuarioService {
	
	
	public List<Usuario> getAll();
	
	public Usuario findById(Integer id);
	
	public Usuario findByNombreCompleto(UsuarioRequestDTO usuarioDTO);

}
