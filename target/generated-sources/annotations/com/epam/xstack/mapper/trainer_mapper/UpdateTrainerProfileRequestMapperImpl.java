package com.epam.xstack.mapper.trainer_mapper;

import com.epam.xstack.model.dto.trainer.reuest.UpdateTrainerProfileRequestDTO;
import com.epam.xstack.model.entity.Trainer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-05T18:10:16+0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class UpdateTrainerProfileRequestMapperImpl implements UpdateTrainerProfileRequestMapper {

    @Override
    public UpdateTrainerProfileRequestDTO toDto(Trainer trainer) {
        if ( trainer == null ) {
            return null;
        }

        UpdateTrainerProfileRequestDTO.UpdateTrainerProfileRequestDTOBuilder updateTrainerProfileRequestDTO = UpdateTrainerProfileRequestDTO.builder();

        updateTrainerProfileRequestDTO.userName( trainer.getUserName() );
        updateTrainerProfileRequestDTO.firstName( trainer.getFirstName() );
        updateTrainerProfileRequestDTO.lastName( trainer.getLastName() );
        updateTrainerProfileRequestDTO.specialization( trainer.getSpecialization() );
        updateTrainerProfileRequestDTO.isActive( trainer.getIsActive() );

        return updateTrainerProfileRequestDTO.build();
    }

    @Override
    public Trainer toEntity(UpdateTrainerProfileRequestDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        Trainer trainer = new Trainer();

        trainer.setFirstName( requestDTO.getFirstName() );
        trainer.setLastName( requestDTO.getLastName() );
        trainer.setUserName( requestDTO.getUserName() );
        trainer.setIsActive( requestDTO.getIsActive() );
        trainer.setSpecialization( requestDTO.getSpecialization() );

        return trainer;
    }

    @Override
    public List<UpdateTrainerProfileRequestDTO> toDtos(List<Trainer> trainers) {
        if ( trainers == null ) {
            return null;
        }

        List<UpdateTrainerProfileRequestDTO> list = new ArrayList<UpdateTrainerProfileRequestDTO>( trainers.size() );
        for ( Trainer trainer : trainers ) {
            list.add( toDto( trainer ) );
        }

        return list;
    }

    @Override
    public List<Trainer> toEntities(List<UpdateTrainerProfileRequestDTO> requestDTOS) {
        if ( requestDTOS == null ) {
            return null;
        }

        List<Trainer> list = new ArrayList<Trainer>( requestDTOS.size() );
        for ( UpdateTrainerProfileRequestDTO updateTrainerProfileRequestDTO : requestDTOS ) {
            list.add( toEntity( updateTrainerProfileRequestDTO ) );
        }

        return list;
    }
}
