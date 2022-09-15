/*
 * package come.example.demo.error;
 * 
 * import org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.ControllerAdvice; import
 * org.springframework.web.bind.annotation.ExceptionHandler; import
 * org.springframework.web.bind.annotation.ResponseStatus; import
 * org.springframework.web.context.request.WebRequest; import
 * org.springframework.web.servlet.mvc.method.annotation.
 * ResponseEntityExceptionHandler;
 * 
 * @ResponseStatus
 * 
 * @ControllerAdvice public class ResponseErrorDisplay extends
 * ResponseEntityExceptionHandler{
 * 
 * @ExceptionHandler(DeptNotFoundException.class) public
 * ResponseEntity<ErrorMessage> deptNotFoundException(DeptNotFoundException
 * exception,WebRequest request) {
 * 
 * ErrorMessage em=new
 * ErrorMessage(HttpStatus.NOT_FOUND,exception.getMessage());
 * 
 * return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
 * 
 * } }
 */