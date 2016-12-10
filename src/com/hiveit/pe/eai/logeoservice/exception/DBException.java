package com.hiveit.pe.eai.logeoservice.exception;

public class DBException extends BaseException {

	private static final long serialVersionUID = 1L;
	
	public DBException(String string) {
		super(string);
	}

	public DBException(Exception exception) {
		super(exception);
	}
	 
	public DBException(ClassNotFoundException classNotFoundException) {
		super(classNotFoundException);
	}

	public DBException(String string, Exception exception) {
		super(string, exception);
	}
	public DBException(String string, ClassNotFoundException classNotFoundException) {
		super(string, classNotFoundException);
	}

	public DBException(String code, String message, Exception exception, ClassNotFoundException classNotFoundException) {
		super(code, message, exception,classNotFoundException);
	}

	public DBException(String code, String message) {
		super(code, message);
	}
}
