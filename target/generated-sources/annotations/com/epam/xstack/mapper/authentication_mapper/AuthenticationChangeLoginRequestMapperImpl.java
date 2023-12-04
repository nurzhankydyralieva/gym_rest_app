package com.epam.xstack.mapper.authentication_mapper;

import com.epam.xstack.model.dto.authentication.AuthenticationChangeLoginRequestDTO;
import com.epam.xstack.model.entity.Trainer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-04T15:23:31+0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class AuthenticationChangeLoginRequestMapperImpl implements AuthenticationChangeLoginRequestMapper {

    @Override
    public AuthenticationChangeLoginRequestDTO toDto(Trainer trainer) {
        if ( trainer == null ) {
            return null;
        }

        AuthenticationChangeLoginRequestDTO.AuthenticationChangeLoginRequestDTOBuilder authenticationChangeLoginRequestDTO = AuthenticationChangeLoginRequestDTO.builder();

        authenticationChangeLoginRequestDTO.userName( trainer.getUserName() );
        authenticationChangeLoginRequestDTO.newPassword( trainer.getPassword() );

        return authenticationChangeLoginRequestDTO.build();
    }

    @Override
    public Trainer toEntity(AuthenticationChangeLoginRequestDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        Trainer trainer = new Trainer();

        trainer.setUserName( requestDTO.getUserName() );
        trainer.setPassword( requestDTO.getNewPassword() );

        return trainer;
    }
}
