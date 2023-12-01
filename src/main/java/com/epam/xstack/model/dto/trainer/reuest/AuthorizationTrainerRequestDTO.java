package com.epam.xstack.model.dto.trainer.reuest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorizationTrainerRequestDTO {
    private String userName;
    private String password;
}
