package com.hiveit.pe.eai.logeoservice.service;

import com.hiveit.pe.eai.logeoservice.type.ConsultarUserRequest;
import com.hiveit.pe.eai.logeoservice.type.ConsultarUserResponse;

public interface LogeoService {
	ConsultarUserResponse consultarUser(ConsultarUserRequest request);
}
