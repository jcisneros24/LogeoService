package com.hiveit.pe.eai.logeoservice.dao;

import com.hiveit.pe.eai.logeoservice.bean.UserBeanRequest;
import com.hiveit.pe.eai.logeoservice.bean.UserBeanResponse;
import com.hiveit.pe.eai.logeoservice.exception.DBException;

public interface SsDbDao {
	UserBeanResponse createUser(UserBeanRequest request) throws DBException;
	UserBeanResponse readUser(UserBeanRequest request) throws DBException;
	UserBeanResponse updateUser(UserBeanRequest request) throws DBException;
	UserBeanResponse deleteUser(UserBeanRequest request) throws DBException;
}
