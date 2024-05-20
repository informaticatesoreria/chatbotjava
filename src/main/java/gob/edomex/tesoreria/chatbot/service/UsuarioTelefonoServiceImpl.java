package gob.edomex.tesoreria.chatbot.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import gob.edomex.tesoreria.chatbot.dto.request.UsuarioRequestDTO;
import gob.edomex.tesoreria.chatbot.dto.request.UsuarioTelefonoRequestDTO;
import gob.edomex.tesoreria.chatbot.exception.PhoneNotFoundException;
import gob.edomex.tesoreria.chatbot.model.Auditoriainventario;
import gob.edomex.tesoreria.chatbot.model.Usuario;
import gob.edomex.tesoreria.chatbot.model.UsuarioTelefono;
import gob.edomex.tesoreria.chatbot.repository.UsuarioRepository;
import gob.edomex.tesoreria.chatbot.repository.UsuarioTelefonoRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UsuarioTelefonoServiceImpl implements IUsuarioTelefonoService{
	
	private final UsuarioTelefonoRepository usuarioTelefonoRepository;
	
	private final UsuarioRepository usuarioRepository;
	
	private final IUsuarioService usuarioService;
	
	private final IAuditoriaInventarioService auditoriaInventarioService;
	
	@Override
	public List<UsuarioTelefono> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioTelefono findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioTelefono findByPhone(Long phone) {
		return usuarioTelefonoRepository.findByNumeroAndStatus(phone).orElseThrow(PhoneNotFoundException::new);
	}

	@Override
	public UsuarioTelefono save(UsuarioTelefonoRequestDTO usuarioTelefonoRequestDTO) {
		
	UsuarioRequestDTO udto = UsuarioRequestDTO.builder()
		.nombre(usuarioTelefonoRequestDTO.getNombre())
		.apellidoP(usuarioTelefonoRequestDTO.getApellidoP())
		.apellidoM(usuarioTelefonoRequestDTO.getApellidoM())
		.build();
	
		Usuario usuario = usuarioService.findByNombreCompleto(udto);
		
		UsuarioTelefono usuarioTel = UsuarioTelefono.builder()
		.creadoEn(LocalDateTime.now())
		.creadoPor("CHATBOT")
		.modificadoPor("CHATBOT")
		.modificadoEn(LocalDateTime.now())
		.numero(usuarioTelefonoRequestDTO.getNumero())
		.usuariosCTiposTelefonoTipoTelefonoId(9)
		.status(1)
		.usuario(usuario)
		.build();
		UsuarioTelefono usuarioNuevo = usuarioTelefonoRepository.save(usuarioTel);
		System.out.println("UsuarioTelefono a guardar: "+usuarioTel);
		
		Auditoriainventario aud = Auditoriainventario.builder()
		.concepto(1)
		.creadoEn(LocalDateTime.now())
		.tabla(55)
		.creadoPor("CHATBOT")
		.id(usuarioNuevo.getTelefonoId())
		.ip("0.0.0.0")
		.build();
		
		Auditoriainventario audNuevo = auditoriaInventarioService.save(aud);
		
		System.out.println("AudNuevo: "+audNuevo);
		
		//System.out.println("UsuarioTelefono guardardado: "+usuarioNuevo);
	
		return usuarioNuevo;
	}

}
