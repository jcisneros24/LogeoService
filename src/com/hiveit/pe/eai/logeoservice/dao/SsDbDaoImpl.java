package com.hiveit.pe.eai.logeoservice.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hiveit.pe.eai.logeoservice.ConnectionDB;
import com.hiveit.pe.eai.logeoservice.bean.UserBeanRequest;
import com.hiveit.pe.eai.logeoservice.bean.UserBeanResponse;
import com.hiveit.pe.eai.logeoservice.exception.DBException;

public class SsDbDaoImpl implements SsDbDao {
	ConnectionDB con;
	public SsDbDaoImpl(){
		con = new ConnectionDB();
	}
	
	@Override
	public UserBeanResponse createUser(UserBeanRequest request) throws DBException {
		UserBeanResponse response = null;
		Connection accessDB = null;
		CallableStatement cs = null;
		try {
			response = new UserBeanResponse();
			accessDB = con.getConnection();
			cs = accessDB.prepareCall("call ...");
			cs.setString(1, request.getUser());
			cs.setString(2, request.getPassword());
			cs.setString(3, request.getTipo());
			int numAfectadas = cs.executeUpdate();
			if(numAfectadas>0){
				response.setCodRpta("0");
				response.setMsgRpta("Se registro correctamente el usuario.");			
			}
		} catch (SQLException e) {
			response.setCodRpta("1");
			response.setMsgRpta(e.getMessage());
			throw new DBException( response.getCodRpta(), response.getMsgRpta());
		}
		return response;
	}

	@Override
	public UserBeanResponse readUser(UserBeanRequest request) throws DBException {
		UserBeanResponse response = null;
		Connection accessDB = null;
		CallableStatement cs = null;
		try {
			response = new UserBeanResponse();
			accessDB = con.getConnection();
			cs = accessDB.prepareCall("call");
			cs.setString(1, request.getUser());
			ResultSet rs = cs.executeQuery();
			if(rs != null && rs.next()){
				response.setUser(rs.getString("user"));
				response.setPassword(rs.getString("password"));
				response.setTipo(rs.getString("tipo"));				
				response.setCodRpta("0");
				response.setMsgRpta("Se obtuvieron datos correctamente del usuario.");
			}
		} catch (SQLException e) {
			response.setCodRpta("1");
			response.setMsgRpta(e.getMessage());
			throw new DBException( response.getCodRpta(), response.getMsgRpta());		
		}		
		return response;
	}

	@Override
	public UserBeanResponse updateUser(UserBeanRequest request) throws DBException {
		UserBeanResponse response = null;
		Connection accessDB = null;
		CallableStatement cs = null;
		try {
			response = new UserBeanResponse();
			accessDB = con.getConnection();
			cs = accessDB.prepareCall("call ...");
			cs.setString(1, request.getUser());
			cs.setString(2, request.getPassword());
			cs.setString(3, request.getTipo());
			int numAfectadas = cs.executeUpdate();
			if(numAfectadas>0){
				response.setCodRpta("0");
				response.setMsgRpta("Se actualizo correctamente el usuario.");			
			}
		} catch (SQLException e) {
			response.setCodRpta("1");
			response.setMsgRpta(e.getMessage());
			throw new DBException( response.getCodRpta(), response.getMsgRpta());
		}
		return response;
	}

	@Override
	public UserBeanResponse deleteUser(UserBeanRequest request) throws DBException {
		UserBeanResponse response = null;
		Connection accessDB = null;
		CallableStatement cs = null;
		try {
			response = new UserBeanResponse();
			accessDB = con.getConnection();
			cs = accessDB.prepareCall("call ..");
			cs.setString(1, request.getUser());
			int rowDelete = cs.executeUpdate();
			if(rowDelete>0){
				response.setCodRpta("0");
				response.setMsgRpta("Se Elimino el usuario correctamente.");			
			}
		} catch (SQLException e) {
			response.setCodRpta("1");
			response.setMsgRpta(e.getMessage());
			throw new DBException( response.getCodRpta(), response.getMsgRpta());
		}
		return response;
	}	
}
