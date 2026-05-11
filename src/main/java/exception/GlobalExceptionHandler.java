package exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.gibosa.practicacrud.response.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	 @ExceptionHandler(RuntimeException.class)
	    public ResponseEntity<ApiResponse<Void>> manejarRuntimeException(RuntimeException ex) {
	        return ResponseEntity.badRequest().body(
	                ApiResponse.errorMessage(ex.getMessage())
	        );
	    }
	 
	 @ExceptionHandler(MethodArgumentNotValidException.class)
	    public ResponseEntity<ApiResponse<Void>> manejarValidaciones(MethodArgumentNotValidException ex) {
	        String mensaje = ex.getBindingResult()
	                .getFieldErrors()
	                .get(0)
	                .getDefaultMessage();

	        return ResponseEntity.badRequest().body(
	                ApiResponse.errorMessage(mensaje)
	        );
	    }
}
