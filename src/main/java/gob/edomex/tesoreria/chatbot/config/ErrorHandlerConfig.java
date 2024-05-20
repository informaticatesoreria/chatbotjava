package gob.edomex.tesoreria.chatbot.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import gob.edomex.tesoreria.chatbot.dto.WrapperResponse;
import gob.edomex.tesoreria.chatbot.exception.PhoneNotFoundException;
import gob.edomex.tesoreria.chatbot.exception.UserNotFoundException;

@ControllerAdvice
public class ErrorHandlerConfig {
	
	@ExceptionHandler(PhoneNotFoundException.class)
	public ResponseEntity<WrapperResponse> hanledIdNotFound(PhoneNotFoundException e){
		WrapperResponse wrapperResponse = WrapperResponse.builder()
			.message(e.getMessage())
			.status(HttpStatus.NOT_FOUND.name())
			.code(HttpStatus.NOT_FOUND.value())
			.build();
		return new ResponseEntity<>(wrapperResponse, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<WrapperResponse> hanledUserNotFound(UserNotFoundException e){
		WrapperResponse wrapperResponse = WrapperResponse.builder()
			.message(e.getMessage())
			.status(HttpStatus.NOT_FOUND.name())
			.code(HttpStatus.NOT_FOUND.value())
			.build();
		return new ResponseEntity<>(wrapperResponse, HttpStatus.NOT_FOUND);
	}

}
