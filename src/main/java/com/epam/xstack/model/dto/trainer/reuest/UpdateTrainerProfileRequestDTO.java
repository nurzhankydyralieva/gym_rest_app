package com.epam.xstack.model.dto.trainer.reuest;

import com.epam.xstack.model.entity.TrainingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTrainerProfileRequestDTO {
    private String userName;
    private String firstName;
    private String lastName;
    private TrainingType specialization;
    private Boolean isActive;
}
