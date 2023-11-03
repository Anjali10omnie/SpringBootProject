package com.user.manage.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.user.manage.entity.Response;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Response>handlerResourceNotFound(ResourceNotFoundException ex)
	
{
	String message=ex.getMessage();
Response  response=	Response.builder().message(message).sucess(true).status(HttpStatus.NOT_FOUND).build();
	return new ResponseEntity<Response>(response,HttpStatus.NOT_FOUND);
}

}
