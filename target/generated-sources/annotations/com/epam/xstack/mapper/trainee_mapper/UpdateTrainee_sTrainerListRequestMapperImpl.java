package com.epam.xstack.mapper.trainee_mapper;

import com.epam.xstack.model.dto.trainee.reuest.UpdateTrainee_sTrainerListRequestDTO;
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
public class UpdateTrainee_sTrainerListRequestMapperImpl implements UpdateTrainee_sTrainerListRequestMapper {

    @Override
    public UpdateTrainee_sTrainerListRequestDTO toDto(Trainee trainee) {
        if ( trainee == null ) {
            return null;
        }

        UpdateTrainee_sTrainerListRequestDTO.UpdateTrainee_sTrainerListRequestDTOBuilder updateTrainee_sTrainerListRequestDTO = UpdateTrainee_sTrainerListRequestDTO.builder();

        updateTrainee_sTrainerListRequestDTO.userName( trainee.getUserName() );
        List<Trainer> list = trainee.getTrainers();
        if ( list != null ) {
            updateTrainee_sTrainerListRequestDTO.trainers( new ArrayList<Trainer>( list ) );
        }

        return updateTrainee_sTrainerListRequestDTO.build();
    }

    @Override
    public Trainee toEntity(UpdateTrainee_sTrainerListRequestDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        Trainee trainee = new Trainee();

        trainee.setUserName( requestDTO.getUserName() );
        List<Trainer> list = requestDTO.getTrainers();
        if ( list != null ) {
            trainee.setTrainers( new ArrayList<Trainer>( list ) );
        }

        return trainee;
    }
}
