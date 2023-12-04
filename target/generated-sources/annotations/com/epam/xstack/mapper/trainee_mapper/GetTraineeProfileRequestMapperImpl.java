package com.epam.xstack.mapper.trainee_mapper;

import com.epam.xstack.model.dto.trainee.reuest.GetTraineeProfileRequestDTO;
import com.epam.xstack.model.entity.Trainee;
import com.epam.xstack.model.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-04T15:23:31+0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class GetTraineeProfileRequestMapperImpl implements GetTraineeProfileRequestMapper {

    @Override
    public GetTraineeProfileRequestDTO toDto(Trainee trainee) {
        if ( trainee == null ) {
            return null;
        }

        GetTraineeProfileRequestDTO.GetTraineeProfileRequestDTOBuilder getTraineeProfileRequestDTO = GetTraineeProfileRequestDTO.builder();

        getTraineeProfileRequestDTO.userName( trainee.getUserName() );

        return getTraineeProfileRequestDTO.build();
    }

    @Override
    public Trainee toEntity(GetTraineeProfileRequestDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        Trainee trainee = new Trainee();

        trainee.setUserName( requestDTO.getUserName() );

        return trainee;
    }

    @Override
    public List<GetTraineeProfileRequestDTO> toDtos(List<Trainee> trainees) {
        if ( trainees == null ) {
            return null;
        }

        List<GetTraineeProfileRequestDTO> list = new ArrayList<GetTraineeProfileRequestDTO>( trainees.size() );
        for ( Trainee trainee : trainees ) {
            list.add( toDto( trainee ) );
        }

        return list;
    }

    @Override
    public List<Trainee> toEntities(List<GetTraineeProfileRequestDTO> requestDTOS) {
        if ( requestDTOS == null ) {
            return null;
        }

        List<Trainee> list = new ArrayList<Trainee>( requestDTOS.size() );
        for ( GetTraineeProfileRequestDTO getTraineeProfileRequestDTO : requestDTOS ) {
            list.add( toEntity( getTraineeProfileRequestDTO ) );
        }

        return list;
    }

    @Override
    public GetTraineeProfileRequestDTO toDtoUser(User user) {
        if ( user == null ) {
            return null;
        }

        GetTraineeProfileRequestDTO.GetTraineeProfileRequestDTOBuilder getTraineeProfileRequestDTO = GetTraineeProfileRequestDTO.builder();

        getTraineeProfileRequestDTO.userName( user.getUserName() );

        return getTraineeProfileRequestDTO.build();
    }

    @Override
    public User toEntityUser(GetTraineeProfileRequestDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        User user = new User();

        user.setUserName( requestDTO.getUserName() );

        return user;
    }
}
