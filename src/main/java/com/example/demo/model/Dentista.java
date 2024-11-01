package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Dentista")
public class Dentista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id_dentista")
    private Long id_dentista;

    @Column(name = "nome_dentista", length = 100)
    private String nome;

    @Column(name = "data_nasc_dentista")
    private LocalDate nascimento;

    @Column(name = "genero_dentista")
    private String genero;

    @Column(name = "endereco_dentista", length = 100)
    private String endereco;

    @Column(name = "telefone_dentista", length = 13)
    private String telefone;

    @Column(name = "CRO")
    private int CRO;
    @Column(name = "especialidade_dentista")
    private String especilidade;


    public Long getId_dentista() {
        return id_dentista;
    }

    public void setId_dentista(Long id_dentista) {
        this.id_dentista = id_dentista;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCRO() {
        return CRO;
    }

    public void setCRO(int CRO) {
        this.CRO = CRO;
    }

    public String getEspecilidade() {
        return especilidade;
    }

    public void setEspecilidade(String especilidade) {
        this.especilidade = especilidade;
    }
}
