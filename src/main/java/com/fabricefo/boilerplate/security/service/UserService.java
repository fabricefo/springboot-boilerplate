package com.fabricefo.boilerplate.security.service;

import com.fabricefo.boilerplate.model.User;
import com.fabricefo.boilerplate.security.dto.AuthenticatedUserDto;
import com.fabricefo.boilerplate.security.dto.RegistrationRequest;
import com.fabricefo.boilerplate.security.dto.RegistrationResponse;

// rimmel asghar
public interface UserService {

	User findByUsername(String username);

	RegistrationResponse registration(RegistrationRequest registrationRequest);

	AuthenticatedUserDto findAuthenticatedUserByUsername(String username);

}
