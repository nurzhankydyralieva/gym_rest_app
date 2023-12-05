package com.epam.xstack.mapper.trainee_mapper;

import com.epam.xstack.model.dto.trainee.response.TraineeRegistrationResponseDTO;
import com.epam.xstack.model.entity.Trainee;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-05T18:10:17+0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class TraineeRegistrationResponseMapperImpl implements TraineeRegistrationResponseMapper {

    @Override
    public TraineeRegistrationResponseDTO toDto(Trainee trainee) {
        if ( trainee == null ) {
            return null;
        }

        TraineeRegistrationResponseDTO.TraineeRegistrationResponseDTOBuilder traineeRegistrationResponseDTO = TraineeRegistrationResponseDTO.builder();

        traineeRegistrationResponseDTO.userName( trainee.getUserName() );
        traineeRegistrationResponseDTO.password( trainee.getPassword() );

        return traineeRegistrationResponseDTO.build();
    }

    @Override
    public Trainee toEntity(TraineeRegistrationResponseDTO responseDTO) {
        if ( responseDTO == null ) {
            return null;
        }

        Trainee trainee = new Trainee();

        trainee.setUserName( responseDTO.getUserName() );
        trainee.setPassword( responseDTO.getPassword() );

        return trainee;
    }

    @Override
    public List<TraineeRegistrationResponseDTO> toDtos(List<Trainee> trainees) {
        if ( trainees == null ) {
            return null;
        }

        List<TraineeRegistrationResponseDTO> list = new ArrayList<TraineeRegistrationResponseDTO>( trainees.size() );
        for ( Trainee trainee : trainees ) {
            list.add( toDto( trainee ) );
        }

        return list;
    }

    @Override
    public List<Trainee> toEntities(List<TraineeRegistrationResponseDTO> responseDTOS) {
        if ( responseDTOS == null ) {
            return null;
        }

        List<Trainee> list = new ArrayList<Trainee>( responseDTOS.size() );
        for ( TraineeRegistrationResponseDTO traineeRegistrationResponseDTO : responseDTOS ) {
            list.add( toEntity( traineeRegistrationResponseDTO ) );
        }

        return list;
    }
}
