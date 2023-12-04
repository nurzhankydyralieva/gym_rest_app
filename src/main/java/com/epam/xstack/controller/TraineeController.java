package com.epam.xstack.controller;

import com.epam.xstack.dao.traineeDAO.TraineeDAO;
import com.epam.xstack.model.dto.trainee.response.DeleteResponseDTO;
import com.epam.xstack.model.dto.trainee.response.GetTraineeProfileResponseDTO;
import com.epam.xstack.model.dto.trainee.response.TraineeRegistrationResponseDTO;
import com.epam.xstack.model.dto.trainee.response.UpdateTraineeProfileResponseDTO;
import com.epam.xstack.model.dto.trainee.reuest.GetTraineeProfileRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.TraineeRegistrationRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.UpdateTraineeProfileRequestDTO;
import com.epam.xstack.service.trainee_service.TraineeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trainees")
@RequiredArgsConstructor
public class TraineeController {
    private final TraineeService traineeService;
    private final TraineeDAO traineeDAO;

    @GetMapping("/{id}")
    public ResponseEntity<GetTraineeProfileResponseDTO> selectTraineeProfile(@PathVariable("id") Long id, @RequestBody GetTraineeProfileRequestDTO requestDTO) {
        return new ResponseEntity<>(traineeService.selectTraineeProfileByUserName(id, requestDTO), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<TraineeRegistrationResponseDTO> saveTrainee(@RequestBody TraineeRegistrationRequestDTO requestDTO) {
        return new ResponseEntity<>(traineeService.saveTrainee(requestDTO), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<UpdateTraineeProfileResponseDTO> updateUser(@PathVariable("id") Long id, @RequestBody UpdateTraineeProfileRequestDTO requestDTO) {
        return new ResponseEntity<>(traineeService.updateTraineeProfile(id, requestDTO), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<DeleteResponseDTO> deleteTraineeByUserName(@PathVariable("id") Long id, @RequestBody GetTraineeProfileRequestDTO requestDTO) {
        return new ResponseEntity<>(traineeDAO.deleteTraineeByUserName(id, requestDTO), HttpStatus.OK);
    }

}
