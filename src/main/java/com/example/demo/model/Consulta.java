package com.example.demo.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "consulta")
public class Consulta {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long consulta_id;
    private String sala;
    private Time horario;
    private Date data;

}
