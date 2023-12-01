package com.epam.xstack.dao.trainerDAO;

import com.epam.xstack.model.dto.trainer.response.TrainerRegistrationResponseDTO;
import com.epam.xstack.model.dto.trainer.reuest.TrainerRegistrationRequestDTO;

public interface TrainerDAO {
    TrainerRegistrationResponseDTO saveTrainer(TrainerRegistrationRequestDTO requestDTO);
}