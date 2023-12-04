package com.epam.xstack.mapper.trainee_mapper;

import com.epam.xstack.model.dto.trainee.response.UpdateTraineeProfileResponseDTO;
import com.epam.xstack.model.entity.Trainee;
import com.epam.xstack.model.entity.Trainer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-04T18:59:24+0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class UpdateTraineeProfileResponseMapperImpl implements UpdateTraineeProfileResponseMapper {

    @Override
    public UpdateTraineeProfileResponseDTO toDto(Trainee trainee) {
        if ( trainee == null ) {
            return null;
        }

        UpdateTraineeProfileResponseDTO.UpdateTraineeProfileResponseDTOBuilder updateTraineeProfileResponseDTO = UpdateTraineeProfileResponseDTO.builder();

        updateTraineeProfileResponseDTO.userName( trainee.getUserName() );
        updateTraineeProfileResponseDTO.firstName( trainee.getFirstName() );
        updateTraineeProfileResponseDTO.lastName( trainee.getLastName() );
        updateTraineeProfileResponseDTO.dateOfBirth( trainee.getDateOfBirth() );
        updateTraineeProfileResponseDTO.address( trainee.getAddress() );
        updateTraineeProfileResponseDTO.isActive( trainee.getIsActive() );
        List<Trainer> list = trainee.getTrainers();
        if ( list != null ) {
            updateTraineeProfileResponseDTO.trainers( new ArrayList<Trainer>( list ) );
        }

        return updateTraineeProfileResponseDTO.build();
    }

    @Override
    public Trainee toEntity(UpdateTraineeProfileResponseDTO responseDTO) {
        if ( responseDTO == null ) {
            return null;
        }

        Trainee trainee = new Trainee();

        trainee.setFirstName( responseDTO.getFirstName() );
        trainee.setLastName( responseDTO.getLastName() );
        trainee.setUserName( responseDTO.getUserName() );
        trainee.setIsActive( responseDTO.getIsActive() );
        trainee.setDateOfBirth( responseDTO.getDateOfBirth() );
        trainee.setAddress( responseDTO.getAddress() );
        List<Trainer> list = responseDTO.getTrainers();
        if ( list != null ) {
            trainee.setTrainers( new ArrayList<Trainer>( list ) );
        }

        return trainee;
    }

    @Override
    public List<UpdateTraineeProfileResponseDTO> toDtos(List<Trainee> trainees) {
        if ( trainees == null ) {
            return null;
        }

        List<UpdateTraineeProfileResponseDTO> list = new ArrayList<UpdateTraineeProfileResponseDTO>( trainees.size() );
        for ( Trainee trainee : trainees ) {
            list.add( toDto( trainee ) );
        }

        return list;
    }

    @Override
    public List<Trainee> toEntities(List<UpdateTraineeProfileResponseDTO> responseDTOS) {
        if ( responseDTOS == null ) {
            return null;
        }

        List<Trainee> list = new ArrayList<Trainee>( responseDTOS.size() );
        for ( UpdateTraineeProfileResponseDTO updateTraineeProfileResponseDTO : responseDTOS ) {
            list.add( toEntity( updateTraineeProfileResponseDTO ) );
        }

        return list;
    }
}
