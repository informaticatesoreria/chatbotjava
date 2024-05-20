package gob.edomex.tesoreria.chatbot.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioTelefonoResponseDTO {
	

	private Integer telefonoId;

	private Long numero;

	private Integer status;

	private UsuarioResponseDTO usuario;


}
