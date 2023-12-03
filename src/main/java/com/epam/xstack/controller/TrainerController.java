package com.epam.xstack.controller;

import com.epam.xstack.model.dto.trainer.response.TrainerRegistrationResponseDTO;
import com.epam.xstack.model.dto.trainer.reuest.TrainerRegistrationRequestDTO;
import com.epam.xstack.service.trainer_service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trainers")
@RequiredArgsConstructor
public class TrainerController {
    private final TrainerService trainerService;

    @PostMapping("/save")
    public ResponseEntity<TrainerRegistrationResponseDTO> saveTrainee(@RequestBody TrainerRegistrationRequestDTO requestDTO) {
        return new ResponseEntity<>(trainerService.saveTrainer(requestDTO), HttpStatus.CREATED);
    }

}
