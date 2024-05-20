package gob.edomex.tesoreria.chatbot.mapper;

import org.mapstruct.Mapper;

import org.mapstruct.MappingConstants;

import gob.edomex.tesoreria.chatbot.dto.response.UsuarioResponseDTO;
import gob.edomex.tesoreria.chatbot.model.Usuario;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UsuarioMapper {
	
	UsuarioResponseDTO toDTOResponse (Usuario usuario);

}
