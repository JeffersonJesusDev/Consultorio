package com.example.demo.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name = "Consulta")
public class Consulta {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name ="pk_id_consulta")
    private Long consulta_id;
    @Column(name = "local_consulta")
    private String sala;
    @Column(name = "data_consulta")
    private LocalDate data;

    public Long getConsulta_id() {
        return consulta_id;
    }

    public void setConsulta_id(Long consulta_id) {
        this.consulta_id = consulta_id;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
