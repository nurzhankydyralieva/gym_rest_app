package com.epam.xstack.mapper.trainee_mapper;

import com.epam.xstack.model.dto.trainee.reuest.TraineeRegistrationRequestDTO;
import com.epam.xstack.model.entity.Trainee;
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
public class TraineeRegistrationRequestMapperImpl implements TraineeRegistrationRequestMapper {

    @Override
    public TraineeRegistrationRequestDTO toDto(Trainee trainee) {
        if ( trainee == null ) {
            return null;
        }

        TraineeRegistrationRequestDTO.TraineeRegistrationRequestDTOBuilder traineeRegistrationRequestDTO = TraineeRegistrationRequestDTO.builder();

        traineeRegistrationRequestDTO.firstName( trainee.getFirstName() );
        traineeRegistrationRequestDTO.lastName( trainee.getLastName() );
        traineeRegistrationRequestDTO.dateOfBirth( trainee.getDateOfBirth() );
        traineeRegistrationRequestDTO.address( trainee.getAddress() );

        return traineeRegistrationRequestDTO.build();
    }

    @Override
    public Trainee toEntity(TraineeRegistrationRequestDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        Trainee trainee = new Trainee();

        trainee.setFirstName( requestDTO.getFirstName() );
        trainee.setLastName( requestDTO.getLastName() );
        trainee.setDateOfBirth( requestDTO.getDateOfBirth() );
        trainee.setAddress( requestDTO.getAddress() );

        return trainee;
    }

    @Override
    public List<TraineeRegistrationRequestDTO> toDtos(List<Trainee> trainees) {
        if ( trainees == null ) {
            return null;
        }

        List<TraineeRegistrationRequestDTO> list = new ArrayList<TraineeRegistrationRequestDTO>( trainees.size() );
        for ( Trainee trainee : trainees ) {
            list.add( toDto( trainee ) );
        }

        return list;
    }

    @Override
    public List<Trainee> toEntities(List<TraineeRegistrationRequestDTO> requestDTOS) {
        if ( requestDTOS == null ) {
            return null;
        }

        List<Trainee> list = new ArrayList<Trainee>( requestDTOS.size() );
        for ( TraineeRegistrationRequestDTO traineeRegistrationRequestDTO : requestDTOS ) {
            list.add( toEntity( traineeRegistrationRequestDTO ) );
        }

        return list;
    }
}
