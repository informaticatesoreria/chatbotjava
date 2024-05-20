package gob.edomex.tesoreria.chatbot.service;

import java.util.List;

import gob.edomex.tesoreria.chatbot.dto.request.UsuarioRequestDTO;
import gob.edomex.tesoreria.chatbot.dto.request.UsuarioTelefonoRequestDTO;
import gob.edomex.tesoreria.chatbot.model.UsuarioTelefono;

public interface IUsuarioTelefonoService {
	
	
	public List<UsuarioTelefono> getAll();
	
	public UsuarioTelefono findById(Integer id);
	
	public UsuarioTelefono findByPhone(Long phone);
	
	public UsuarioTelefono save(UsuarioTelefonoRequestDTO usuarioTelefonoRequestDTO);
	
	

}
