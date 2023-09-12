package com.example.basicatransac_t04.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "funcionarios")
@NoArgsConstructor
@AllArgsConstructor
public class Funcionary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String surname;
    private  String dni;
    private String phonenumber;
    private String rank;
    private String department;
    private String address;
    private String email;
    private String estado;
    private Integer id_adolescente;
}
