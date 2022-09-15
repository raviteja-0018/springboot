package come.example.demo.error;

public class DeptNotFoundException extends Exception{

	
	 public DeptNotFoundException(String message) {
        super(message);
    }
	
	 public DeptNotFoundException() {
	        super();
	    }
	 public DeptNotFoundException(String message,Throwable cause) {
	        super(message,cause);
	    }
	 public DeptNotFoundException(Throwable cause) {
	        super(cause);
	    }
	 
	
	

}
