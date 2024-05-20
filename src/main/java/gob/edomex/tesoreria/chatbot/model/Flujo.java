package gob.edomex.tesoreria.chatbot.model;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Flujo {
	
	private Integer id;
	
	private String key;
	
	private String descripcion;
	
	private List<String> respuestas;

}
