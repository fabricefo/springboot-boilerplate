package com.fabricefo.boilerplate.security.mapper;

import com.fabricefo.boilerplate.model.User;
import com.fabricefo.boilerplate.security.dto.AuthenticatedUserDto;
import com.fabricefo.boilerplate.security.dto.RegistrationRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

// rimmel asghar
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	User convertToUser(RegistrationRequest registrationRequest);

	AuthenticatedUserDto convertToAuthenticatedUserDto(User user);

	User convertToUser(AuthenticatedUserDto authenticatedUserDto);

}
