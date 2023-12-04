package com.epam.xstack.mapper.authentication_mapper;

import com.epam.xstack.model.dto.authentication.AuthenticationRequestDTO;
import com.epam.xstack.model.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-04T18:59:24+0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class AuthenticationRequestMapperImpl implements AuthenticationRequestMapper {

    @Override
    public AuthenticationRequestDTO toDto(User user) {
        if ( user == null ) {
            return null;
        }

        AuthenticationRequestDTO.AuthenticationRequestDTOBuilder authenticationRequestDTO = AuthenticationRequestDTO.builder();

        authenticationRequestDTO.userName( user.getUserName() );
        authenticationRequestDTO.password( user.getPassword() );

        return authenticationRequestDTO.build();
    }

    @Override
    public User toEntity(AuthenticationRequestDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        User user = new User();

        user.setUserName( requestDTO.getUserName() );
        user.setPassword( requestDTO.getPassword() );

        return user;
    }
}
