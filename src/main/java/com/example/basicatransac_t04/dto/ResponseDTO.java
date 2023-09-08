package com.example.basicatransac_t04.dto;

import com.example.basicatransac_t04.entity.Funcionary;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
    private  Funcionary funcionary;
    private TeenDTO teenDTO;
}
