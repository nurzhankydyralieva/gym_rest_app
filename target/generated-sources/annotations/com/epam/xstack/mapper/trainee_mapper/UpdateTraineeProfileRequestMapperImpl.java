package com.epam.xstack.mapper.trainee_mapper;

import com.epam.xstack.model.dto.trainee.reuest.UpdateTraineeProfileRequestDTO;
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
public class UpdateTraineeProfileRequestMapperImpl implements UpdateTraineeProfileRequestMapper {

    @Override
    public UpdateTraineeProfileRequestDTO toDto(Trainee trainee) {
        if ( trainee == null ) {
            return null;
        }

        UpdateTraineeProfileRequestDTO.UpdateTraineeProfileRequestDTOBuilder updateTraineeProfileRequestDTO = UpdateTraineeProfileRequestDTO.builder();

        updateTraineeProfileRequestDTO.userName( trainee.getUserName() );
        updateTraineeProfileRequestDTO.firstName( trainee.getFirstName() );
        updateTraineeProfileRequestDTO.lastName( trainee.getLastName() );
        updateTraineeProfileRequestDTO.dateOfBirth( trainee.getDateOfBirth() );
        updateTraineeProfileRequestDTO.address( trainee.getAddress() );
        updateTraineeProfileRequestDTO.isActive( trainee.getIsActive() );

        return updateTraineeProfileRequestDTO.build();
    }

    @Override
    public Trainee toEntity(UpdateTraineeProfileRequestDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        Trainee trainee = new Trainee();

        trainee.setFirstName( requestDTO.getFirstName() );
        trainee.setLastName( requestDTO.getLastName() );
        trainee.setUserName( requestDTO.getUserName() );
        trainee.setIsActive( requestDTO.getIsActive() );
        trainee.setDateOfBirth( requestDTO.getDateOfBirth() );
        trainee.setAddress( requestDTO.getAddress() );

        return trainee;
    }

    @Override
    public List<UpdateTraineeProfileRequestDTO> toDtos(List<Trainee> trainees) {
        if ( trainees == null ) {
            return null;
        }

        List<UpdateTraineeProfileRequestDTO> list = new ArrayList<UpdateTraineeProfileRequestDTO>( trainees.size() );
        for ( Trainee trainee : trainees ) {
            list.add( toDto( trainee ) );
        }

        return list;
    }

    @Override
    public List<Trainee> toEntities(List<UpdateTraineeProfileRequestDTO> requestDTOS) {
        if ( requestDTOS == null ) {
            return null;
        }

        List<Trainee> list = new ArrayList<Trainee>( requestDTOS.size() );
        for ( UpdateTraineeProfileRequestDTO updateTraineeProfileRequestDTO : requestDTOS ) {
            list.add( toEntity( updateTraineeProfileRequestDTO ) );
        }

        return list;
    }
}
