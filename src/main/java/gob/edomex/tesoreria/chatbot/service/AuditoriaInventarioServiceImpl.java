package gob.edomex.tesoreria.chatbot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import gob.edomex.tesoreria.chatbot.model.Auditoriainventario;
import gob.edomex.tesoreria.chatbot.repository.AudioriaInventarioRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuditoriaInventarioServiceImpl implements IAuditoriaInventarioService {
	
	private final AudioriaInventarioRepository  auditoriaRepository;

	@Override
	public List<Auditoriainventario> getAll() {
		
		return auditoriaRepository.findAll();
	}

	@Override
	public Auditoriainventario save(Auditoriainventario auditoriainventario) {
		return auditoriaRepository.save(auditoriainventario);
	
	}

}
