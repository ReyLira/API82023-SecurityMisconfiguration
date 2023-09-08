package com.example.basicatransac_t04.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeenDTO {
    private Integer id_adolescente;
    private String name;
    private String surname;
    private  String dni;
}
