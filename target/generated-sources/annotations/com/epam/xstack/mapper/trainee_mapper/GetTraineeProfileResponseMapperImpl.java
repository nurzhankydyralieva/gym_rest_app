package com.epam.xstack.mapper.trainee_mapper;

import com.epam.xstack.model.dto.trainee.response.GetTraineeProfileResponseDTO;
import com.epam.xstack.model.entity.Trainee;
import com.epam.xstack.model.entity.Trainer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-03T15:16:47+0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class GetTraineeProfileResponseMapperImpl implements GetTraineeProfileResponseMapper {

    @Override
    public GetTraineeProfileResponseDTO toDto(Trainee trainee) {
        if ( trainee == null ) {
            return null;
        }

        GetTraineeProfileResponseDTO.GetTraineeProfileResponseDTOBuilder getTraineeProfileResponseDTO = GetTraineeProfileResponseDTO.builder();

        getTraineeProfileResponseDTO.firstName( trainee.getFirstName() );
        getTraineeProfileResponseDTO.lastName( trainee.getLastName() );
        getTraineeProfileResponseDTO.dateOfBirth( trainee.getDateOfBirth() );
        getTraineeProfileResponseDTO.address( trainee.getAddress() );
        getTraineeProfileResponseDTO.isActive( trainee.getIsActive() );
        List<Trainer> list = trainee.getTrainers();
        if ( list != null ) {
            getTraineeProfileResponseDTO.trainers( new ArrayList<Trainer>( list ) );
        }

        return getTraineeProfileResponseDTO.build();
    }

    @Override
    public Trainee toEntity(GetTraineeProfileResponseDTO responseDTO) {
        if ( responseDTO == null ) {
            return null;
        }

        Trainee trainee = new Trainee();

        trainee.setFirstName( responseDTO.getFirstName() );
        trainee.setLastName( responseDTO.getLastName() );
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
    public List<GetTraineeProfileResponseDTO> toDtos(List<Trainee> trainees) {
        if ( trainees == null ) {
            return null;
        }

        List<GetTraineeProfileResponseDTO> list = new ArrayList<GetTraineeProfileResponseDTO>( trainees.size() );
        for ( Trainee trainee : trainees ) {
            list.add( toDto( trainee ) );
        }

        return list;
    }

    @Override
    public List<Trainee> toEntities(List<GetTraineeProfileResponseDTO> responseDTOS) {
        if ( responseDTOS == null ) {
            return null;
        }

        List<Trainee> list = new ArrayList<Trainee>( responseDTOS.size() );
        for ( GetTraineeProfileResponseDTO getTraineeProfileResponseDTO : responseDTOS ) {
            list.add( toEntity( getTraineeProfileResponseDTO ) );
        }

        return list;
    }
}
