package gob.edomex.tesoreria.chatbot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WrapperResponse {
	
	private String status;
	
	private Integer code;
	
	private String message;

}