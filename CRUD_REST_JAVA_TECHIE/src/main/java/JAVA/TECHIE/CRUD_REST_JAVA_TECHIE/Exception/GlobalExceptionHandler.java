package JAVA.TECHIE.CRUD_REST_JAVA_TECHIE.Exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
/*
  It is typically used to customize the response of
   all or specific controllers in a Spring MVC application.
 */
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException noSuchElementException)
	{
		return new ResponseEntity<String>("No value is present in DB,please change your request",HttpStatus.NOT_FOUND);
		
	}
	
}

/*
 used to handle exceptions at the controller level. 
 When an exception occurs during the processing of a request, the method annotated with 
 @ExceptionHandler is invoked to handle that specific type of exception.
*/