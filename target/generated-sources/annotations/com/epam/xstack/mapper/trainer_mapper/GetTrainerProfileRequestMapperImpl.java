package com.epam.xstack.mapper.trainer_mapper;

import com.epam.xstack.model.dto.trainer.reuest.GetTrainerProfileRequestDTO;
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
public class GetTrainerProfileRequestMapperImpl implements GetTrainerProfileRequestMapper {

    @Override
    public GetTrainerProfileRequestDTO toDto(Trainer trainer) {
        if ( trainer == null ) {
            return null;
        }

        GetTrainerProfileRequestDTO.GetTrainerProfileRequestDTOBuilder getTrainerProfileRequestDTO = GetTrainerProfileRequestDTO.builder();

        getTrainerProfileRequestDTO.userName( trainer.getUserName() );

        return getTrainerProfileRequestDTO.build();
    }

    @Override
    public Trainer toEntity(GetTrainerProfileRequestDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        Trainer trainer = new Trainer();

        trainer.setUserName( requestDTO.getUserName() );

        return trainer;
    }

    @Override
    public List<GetTrainerProfileRequestDTO> toDtos(List<Trainer> trainers) {
        if ( trainers == null ) {
            return null;
        }

        List<GetTrainerProfileRequestDTO> list = new ArrayList<GetTrainerProfileRequestDTO>( trainers.size() );
        for ( Trainer trainer : trainers ) {
            list.add( toDto( trainer ) );
        }

        return list;
    }

    @Override
    public List<Trainer> toEntities(List<GetTrainerProfileRequestDTO> requestDTOS) {
        if ( requestDTOS == null ) {
            return null;
        }

        List<Trainer> list = new ArrayList<Trainer>( requestDTOS.size() );
        for ( GetTrainerProfileRequestDTO getTrainerProfileRequestDTO : requestDTOS ) {
            list.add( toEntity( getTrainerProfileRequestDTO ) );
        }

        return list;
    }
}
