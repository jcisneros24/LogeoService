package com.hiveit.pe.eai.logeoservice.bean;

public class UserBeanResponse {
	
	private String user;
	private String password;
	private String tipo;
	private String codRpta;
	private String msgRpta;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCodRpta() {
		return codRpta;
	}
	public void setCodRpta(String codRpta) {
		this.codRpta = codRpta;
	}
	public String getMsgRpta() {
		return msgRpta;
	}
	public void setMsgRpta(String msgRpta) {
		this.msgRpta = msgRpta;
	}
}
