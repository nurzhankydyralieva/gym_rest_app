package com.epam.xstack.model.dto.trainee.response;

import com.epam.xstack.model.enums.Code;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteResponseDTO {
    private String response;
    private Code code;
}
