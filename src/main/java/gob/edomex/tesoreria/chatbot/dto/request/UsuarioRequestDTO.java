package gob.edomex.tesoreria.chatbot.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class UsuarioRequestDTO {
	
	private String nombre;
	
	private String apellidoP;
	
	private String apellidoM;

}
