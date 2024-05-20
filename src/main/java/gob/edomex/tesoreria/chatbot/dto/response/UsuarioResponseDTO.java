package gob.edomex.tesoreria.chatbot.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioResponseDTO {
	
	private Integer usuarioId;

	private String apMat;

	private String apPat;

	private String cifrado;

	private String nombre;

	private Integer status;

}
