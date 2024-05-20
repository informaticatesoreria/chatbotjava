package gob.edomex.tesoreria.chatbot.dto.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class UsuarioTelefonoRequestDTO {
	
	private String nombre;
	
	private String apellidoP;
	
	private String apellidoM;
	
	private Long numero;

}
