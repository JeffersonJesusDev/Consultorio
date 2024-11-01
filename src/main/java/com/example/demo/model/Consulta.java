package com.example.demo.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "Consulta")
public class Consulta {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long consulta_id;
    private String sala;
    private Time horario;
    private Date data;

    public Consulta(Long consulta_id, String sala, Time horario, Date data) {
        this.consulta_id = consulta_id;
        this.sala = sala;
        this.horario = horario;
        this.data = data;
    }

    public Consulta() {
    }

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

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
