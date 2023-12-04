package com.epam.xstack.dao.traineeDAO.impl;

import com.epam.xstack.dao.traineeDAO.TraineeDAO;
import com.epam.xstack.mapper.trainee_mapper.GetTraineeProfileRequestMapper;
import com.epam.xstack.mapper.trainee_mapper.TraineeRegistrationRequestMapper;
import com.epam.xstack.model.dto.trainee.response.GetTraineeProfileResponseDTO;
import com.epam.xstack.model.dto.trainee.response.TraineeRegistrationResponseDTO;
import com.epam.xstack.model.dto.trainee.response.UpdateTraineeProfileResponseDTO;
import com.epam.xstack.model.dto.trainee.reuest.GetTraineeProfileRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.TraineeRegistrationRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.UpdateTraineeProfileRequestDTO;
import com.epam.xstack.model.entity.Trainee;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

@Component
@RequiredArgsConstructor
public class TraineeDAOImpl implements TraineeDAO {
    private static final Logger LOGGER = LoggerFactory.getLogger(TraineeDAO.class);
    private final SessionFactory sessionFactory;
    private final TraineeRegistrationRequestMapper registrationRequestMapper;
    private final GetTraineeProfileRequestMapper getTraineeProfileRequestMapper;

    @Override
    @Transactional
    public GetTraineeProfileResponseDTO selectTraineeProfileByUserName(Long id, GetTraineeProfileRequestDTO requestDTO) {
        Session session = sessionFactory.getCurrentSession();
        Trainee trainee = getTraineeProfileRequestMapper.toEntity(requestDTO);
        Trainee traineeId = session.get(Trainee.class, id);

        if (traineeId.getUserName().equals(trainee.getUserName())) {
            getTraineeProfileRequestMapper.toDto(trainee);
            return GetTraineeProfileResponseDTO
                    .builder()
                    .firstName(traineeId.getFirstName())
                    .lastName(traineeId.getLastName())
                    .address(traineeId.getAddress())
                    .isActive(traineeId.getIsActive())
                    .dateOfBirth(traineeId.getDateOfBirth())
                    .trainers(traineeId.getTrainers())
                    .build();
        } else {
            throw new RuntimeException("Not available");
        }

    }


    @Override
    @Transactional
    public UpdateTraineeProfileResponseDTO updateTraineeProfile(Long id, UpdateTraineeProfileRequestDTO requestDTO) {
        Session session = sessionFactory.getCurrentSession();
        Trainee traineeToBeUpdated = session.get(Trainee.class, id);

        traineeToBeUpdated.setUserName(requestDTO.getUserName());
        traineeToBeUpdated.setFirstName(requestDTO.getFirstName());
        traineeToBeUpdated.setLastName(requestDTO.getLastName());
        traineeToBeUpdated.setDateOfBirth(requestDTO.getDateOfBirth());
        traineeToBeUpdated.setAddress(requestDTO.getAddress());
        traineeToBeUpdated.setIsActive(requestDTO.getIsActive());

        return UpdateTraineeProfileResponseDTO
                .builder()
                .userName(traineeToBeUpdated.getUserName())
                .firstName(traineeToBeUpdated.getFirstName())
                .lastName(traineeToBeUpdated.getLastName())
                .dateOfBirth(traineeToBeUpdated.getDateOfBirth())
                .address(traineeToBeUpdated.getAddress())
                .isActive(traineeToBeUpdated.getIsActive())
                .trainers(traineeToBeUpdated.getTrainers())
                .build();
    }


    @Override
    @Transactional
    public TraineeRegistrationResponseDTO saveTrainee(TraineeRegistrationRequestDTO requestDTO) {
        Session session = sessionFactory.getCurrentSession();
        Trainee trainee = registrationRequestMapper.toEntity(requestDTO);
        session.save(trainee);
        TraineeRegistrationRequestDTO newTrainee = registrationRequestMapper.toDto(trainee);
        String password = generateRandomPassword(10);
        trainee.setUserName(newTrainee.getFirstName() + "." + newTrainee.getLastName());
        trainee.setPassword(password);
        session.save(trainee);

        return TraineeRegistrationResponseDTO
                .builder()
                .userName(newTrainee.getFirstName() + "." + newTrainee.getLastName())
                .password(password)
                .build();
    }


    private static String generateRandomPassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=<>?";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        return password.toString();
    }

}
