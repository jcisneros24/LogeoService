package com.hiveit.pe.eai.logeoservice.exception;

public class BaseException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private Exception exception;
	private ClassNotFoundException classNotFoundException;
    private String code;
    private String message;
    
    public BaseException(String code, String message, Exception exception, ClassNotFoundException classNotFoundException) {
        super(message);
        this.exception = exception;
        this.classNotFoundException = classNotFoundException;
        this.code = code;
        this.message = message;        
    }

    public BaseException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public BaseException(String message, Exception exception) {
        super(message);
        this.exception = exception;
        this.message = message;
    }
    
    public BaseException(String message, ClassNotFoundException classNotFoundException) {
    	super(message);
    	this.message = message;
    	this.classNotFoundException = classNotFoundException;
	}

    public BaseException(Exception exception) {
        this.exception = exception;
    }
    
    public BaseException(ClassNotFoundException classNotFoundException) {
		this.classNotFoundException = classNotFoundException;
	}

    public BaseException(String message) {
        super(message);
        this.message = message;
    }

    @Override
	public String getMessage() {
        return message;
    }
    
    public String getCode() {
        return code;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

	public ClassNotFoundException getClassNotFoundException() {
		return classNotFoundException;
	}

	public void setClassNotFoundException(ClassNotFoundException classNotFoundException) {
		this.classNotFoundException = classNotFoundException;
	}

}


	

