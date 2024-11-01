package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    @Column(name = "pk_id_paciente")
    private Long id_paciente;

    @Column(name = "nome_paciente", length = 100)
    private String nome;

    @Column(name = "data_nasc_paciente")
    private LocalDate nascimento;

    @Column(name = "genero_paciente")
    private String genero;

    @Column(name = "endereco_paciente", length = 100)
    private String endereco;

    @Column(name = "email_paciente", length = 50)
    private String email;

    @Column(name = "telefone_paciente", length = 13)
    private String telefone;

    // Getters e Setters
    public Long getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Long id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
