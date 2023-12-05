package com.epam.xstack.mapper.trainer_mapper;

import com.epam.xstack.model.dto.trainer.reuest.TrainerRegistrationRequestDTO;
import com.epam.xstack.model.entity.Trainer;
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
public class TrainerRegistrationRequestMapperImpl implements TrainerRegistrationRequestMapper {

    @Override
    public TrainerRegistrationRequestDTO toDto(Trainer trainer) {
        if ( trainer == null ) {
            return null;
        }

        TrainerRegistrationRequestDTO.TrainerRegistrationRequestDTOBuilder trainerRegistrationRequestDTO = TrainerRegistrationRequestDTO.builder();

        trainerRegistrationRequestDTO.firstName( trainer.getFirstName() );
        trainerRegistrationRequestDTO.lastName( trainer.getLastName() );
        trainerRegistrationRequestDTO.specialization( trainer.getSpecialization() );

        return trainerRegistrationRequestDTO.build();
    }

    @Override
    public Trainer toEntity(TrainerRegistrationRequestDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        Trainer trainer = new Trainer();

        trainer.setFirstName( requestDTO.getFirstName() );
        trainer.setLastName( requestDTO.getLastName() );
        trainer.setSpecialization( requestDTO.getSpecialization() );

        return trainer;
    }

    @Override
    public List<TrainerRegistrationRequestDTO> toDtos(List<Trainer> trainers) {
        if ( trainers == null ) {
            return null;
        }

        List<TrainerRegistrationRequestDTO> list = new ArrayList<TrainerRegistrationRequestDTO>( trainers.size() );
        for ( Trainer trainer : trainers ) {
            list.add( toDto( trainer ) );
        }

        return list;
    }

    @Override
    public List<Trainer> toEntities(List<TrainerRegistrationRequestDTO> requestDTOS) {
        if ( requestDTOS == null ) {
            return null;
        }

        List<Trainer> list = new ArrayList<Trainer>( requestDTOS.size() );
        for ( TrainerRegistrationRequestDTO trainerRegistrationRequestDTO : requestDTOS ) {
            list.add( toEntity( trainerRegistrationRequestDTO ) );
        }

        return list;
    }
}
