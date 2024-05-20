package gob.edomex.tesoreria.chatbot.service;

import java.util.List;

import javax.naming.NameNotFoundException;

import org.springframework.stereotype.Service;

import gob.edomex.tesoreria.chatbot.dto.request.UsuarioRequestDTO;
import gob.edomex.tesoreria.chatbot.dto.response.UsuarioResponseDTO;
import gob.edomex.tesoreria.chatbot.exception.PhoneNotFoundException;
import gob.edomex.tesoreria.chatbot.exception.UserNotFoundException;
import gob.edomex.tesoreria.chatbot.mapper.UsuarioMapper;
import gob.edomex.tesoreria.chatbot.model.Usuario;
import gob.edomex.tesoreria.chatbot.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements IUsuarioService {
	
	private final UsuarioMapper usuarioMapper;
	
	private final UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> getAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario findById(Integer id) {
		return usuarioRepository.findById(id).orElseThrow(null);
	}

	@Override
	public Usuario findByNombreCompleto(UsuarioRequestDTO usuarioDTO) {
		return usuarioRepository.findByNombre(usuarioDTO.getNombre(), usuarioDTO.getApellidoP(), usuarioDTO.getApellidoM())
				.orElseThrow(()->new UserNotFoundException("Usuario no encontrado"));
		
		
	}


}
