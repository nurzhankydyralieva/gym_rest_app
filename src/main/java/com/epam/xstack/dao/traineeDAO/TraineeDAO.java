package com.epam.xstack.dao.traineeDAO;

import com.epam.xstack.model.dto.trainee.response.TraineeRegistrationResponseDTO;
import com.epam.xstack.model.dto.trainee.reuest.TraineeRegistrationRequestDTO;

import java.util.List;

public interface TraineeDAO {

    TraineeRegistrationResponseDTO saveTrainee(TraineeRegistrationRequestDTO requestDTO);
//Get Trainee Profile

}
//    List<CourierDto> findAll();
//
//    CourierDto findById(Long id);
//
//    CourierDto save(CourierDto courierDto);
//
//    CourierDto update(CourierDto courierDto);
//
//    void deleteById(Long id);