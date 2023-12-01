package com.epam.xstack.mapper.trainer_mapper;

import com.epam.xstack.model.dto.trainer.response.TrainerRegistrationResponseDTO;
import com.epam.xstack.model.entity.Trainer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-01T22:27:29+0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class TrainerRegistrationResponseMapperImpl implements TrainerRegistrationResponseMapper {

    @Override
    public TrainerRegistrationResponseDTO toDto(Trainer trainer) {
        if ( trainer == null ) {
            return null;
        }

        TrainerRegistrationResponseDTO.TrainerRegistrationResponseDTOBuilder trainerRegistrationResponseDTO = TrainerRegistrationResponseDTO.builder();

        trainerRegistrationResponseDTO.userName( trainer.getUserName() );
        trainerRegistrationResponseDTO.password( trainer.getPassword() );

        return trainerRegistrationResponseDTO.build();
    }

    @Override
    public Trainer toEntity(TrainerRegistrationResponseDTO responseDTO) {
        if ( responseDTO == null ) {
            return null;
        }

        Trainer trainer = new Trainer();

        trainer.setUserName( responseDTO.getUserName() );
        trainer.setPassword( responseDTO.getPassword() );

        return trainer;
    }

    @Override
    public List<TrainerRegistrationResponseDTO> toDtos(List<Trainer> trainers) {
        if ( trainers == null ) {
            return null;
        }

        List<TrainerRegistrationResponseDTO> list = new ArrayList<TrainerRegistrationResponseDTO>( trainers.size() );
        for ( Trainer trainer : trainers ) {
            list.add( toDto( trainer ) );
        }

        return list;
    }

    @Override
    public List<Trainer> toEntities(List<TrainerRegistrationResponseDTO> responseDTOS) {
        if ( responseDTOS == null ) {
            return null;
        }

        List<Trainer> list = new ArrayList<Trainer>( responseDTOS.size() );
        for ( TrainerRegistrationResponseDTO trainerRegistrationResponseDTO : responseDTOS ) {
            list.add( toEntity( trainerRegistrationResponseDTO ) );
        }

        return list;
    }
}
