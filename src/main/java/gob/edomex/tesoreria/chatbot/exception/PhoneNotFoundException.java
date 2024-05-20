package gob.edomex.tesoreria.chatbot.exception;

public class PhoneNotFoundException extends RuntimeException {
	
	private static final String ERROR_MESSAGE = "Numero de telefono no encontrado";

	private static final long serialVersionUID = 1L;

	public PhoneNotFoundException() {
		this(ERROR_MESSAGE);
		
	}

	public PhoneNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public PhoneNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public PhoneNotFoundException(String message) {
		super(message);
	}

	public PhoneNotFoundException(Throwable cause) {
		super(cause);
	}
	
	

}
