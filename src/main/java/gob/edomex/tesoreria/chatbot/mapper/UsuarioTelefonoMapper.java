package gob.edomex.tesoreria.chatbot.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import gob.edomex.tesoreria.chatbot.dto.response.UsuarioTelefonoResponseDTO;
import gob.edomex.tesoreria.chatbot.model.UsuarioTelefono;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UsuarioTelefonoMapper {
	
	UsuarioTelefonoResponseDTO toDTOResponse (UsuarioTelefono usuariotT);

}
