package com.epam.xstack.mapper.trainer_mapper;

import com.epam.xstack.model.dto.trainer.response.GetTrainerProfileResponseDTO;
import com.epam.xstack.model.entity.Trainee;
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
public class GetTrainerProfileResponseMapperImpl implements GetTrainerProfileResponseMapper {

    @Override
    public GetTrainerProfileResponseDTO toDto(Trainer trainer) {
        if ( trainer == null ) {
            return null;
        }

        GetTrainerProfileResponseDTO.GetTrainerProfileResponseDTOBuilder getTrainerProfileResponseDTO = GetTrainerProfileResponseDTO.builder();

        getTrainerProfileResponseDTO.firstName( trainer.getFirstName() );
        getTrainerProfileResponseDTO.lastName( trainer.getLastName() );
        getTrainerProfileResponseDTO.specialization( trainer.getSpecialization() );
        getTrainerProfileResponseDTO.isActive( trainer.getIsActive() );
        List<Trainee> list = trainer.getTrainees();
        if ( list != null ) {
            getTrainerProfileResponseDTO.trainees( new ArrayList<Trainee>( list ) );
        }

        return getTrainerProfileResponseDTO.build();
    }

    @Override
    public Trainer toEntity(GetTrainerProfileResponseDTO responseDTO) {
        if ( responseDTO == null ) {
            return null;
        }

        Trainer trainer = new Trainer();

        trainer.setFirstName( responseDTO.getFirstName() );
        trainer.setLastName( responseDTO.getLastName() );
        trainer.setIsActive( responseDTO.getIsActive() );
        List<Trainee> list = responseDTO.getTrainees();
        if ( list != null ) {
            trainer.setTrainees( new ArrayList<Trainee>( list ) );
        }
        trainer.setSpecialization( responseDTO.getSpecialization() );

        return trainer;
    }

    @Override
    public List<GetTrainerProfileResponseDTO> toDtos(List<Trainer> trainers) {
        if ( trainers == null ) {
            return null;
        }

        List<GetTrainerProfileResponseDTO> list = new ArrayList<GetTrainerProfileResponseDTO>( trainers.size() );
        for ( Trainer trainer : trainers ) {
            list.add( toDto( trainer ) );
        }

        return list;
    }

    @Override
    public List<Trainer> toEntities(List<GetTrainerProfileResponseDTO> responseDTOS) {
        if ( responseDTOS == null ) {
            return null;
        }

        List<Trainer> list = new ArrayList<Trainer>( responseDTOS.size() );
        for ( GetTrainerProfileResponseDTO getTrainerProfileResponseDTO : responseDTOS ) {
            list.add( toEntity( getTrainerProfileResponseDTO ) );
        }

        return list;
    }
}
