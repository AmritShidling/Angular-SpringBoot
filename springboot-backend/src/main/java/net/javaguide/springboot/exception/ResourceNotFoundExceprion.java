package net.javaguide.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExceprion extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	public ResourceNotFoundExceprion(String message) {
		super(message);
		}

}
