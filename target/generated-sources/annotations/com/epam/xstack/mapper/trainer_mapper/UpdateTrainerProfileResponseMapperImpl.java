package com.epam.xstack.mapper.trainer_mapper;

import com.epam.xstack.model.dto.trainer.response.UpdateTrainerProfileResponseDTO;
import com.epam.xstack.model.entity.Trainee;
import com.epam.xstack.model.entity.Trainer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-04T18:59:39+0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class UpdateTrainerProfileResponseMapperImpl implements UpdateTrainerProfileResponseMapper {

    @Override
    public UpdateTrainerProfileResponseDTO toDto(Trainer trainer) {
        if ( trainer == null ) {
            return null;
        }

        UpdateTrainerProfileResponseDTO.UpdateTrainerProfileResponseDTOBuilder updateTrainerProfileResponseDTO = UpdateTrainerProfileResponseDTO.builder();

        updateTrainerProfileResponseDTO.userName( trainer.getUserName() );
        updateTrainerProfileResponseDTO.firstName( trainer.getFirstName() );
        updateTrainerProfileResponseDTO.lastName( trainer.getLastName() );
        updateTrainerProfileResponseDTO.specialization( trainer.getSpecialization() );
        updateTrainerProfileResponseDTO.isActive( trainer.getIsActive() );
        List<Trainee> list = trainer.getTrainees();
        if ( list != null ) {
            updateTrainerProfileResponseDTO.trainees( new ArrayList<Trainee>( list ) );
        }

        return updateTrainerProfileResponseDTO.build();
    }

    @Override
    public Trainer toEntity(UpdateTrainerProfileResponseDTO responseDTO) {
        if ( responseDTO == null ) {
            return null;
        }

        Trainer trainer = new Trainer();

        trainer.setFirstName( responseDTO.getFirstName() );
        trainer.setLastName( responseDTO.getLastName() );
        trainer.setUserName( responseDTO.getUserName() );
        trainer.setIsActive( responseDTO.getIsActive() );
        List<Trainee> list = responseDTO.getTrainees();
        if ( list != null ) {
            trainer.setTrainees( new ArrayList<Trainee>( list ) );
        }
        trainer.setSpecialization( responseDTO.getSpecialization() );

        return trainer;
    }

    @Override
    public List<UpdateTrainerProfileResponseDTO> toDtos(List<Trainer> trainers) {
        if ( trainers == null ) {
            return null;
        }

        List<UpdateTrainerProfileResponseDTO> list = new ArrayList<UpdateTrainerProfileResponseDTO>( trainers.size() );
        for ( Trainer trainer : trainers ) {
            list.add( toDto( trainer ) );
        }

        return list;
    }

    @Override
    public List<Trainer> toEntities(List<UpdateTrainerProfileResponseDTO> responseDTOS) {
        if ( responseDTOS == null ) {
            return null;
        }

        List<Trainer> list = new ArrayList<Trainer>( responseDTOS.size() );
        for ( UpdateTrainerProfileResponseDTO updateTrainerProfileResponseDTO : responseDTOS ) {
            list.add( toEntity( updateTrainerProfileResponseDTO ) );
        }

        return list;
    }
}
