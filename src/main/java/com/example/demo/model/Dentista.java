package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name ="dentista_tb")
public class Dentista {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id_dentista;
    private String nome;
    private String nascimento;
    private String genero;
    private int CRO;

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

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCRO() {
        return CRO;
    }

    public void setCRO(int CRO) {
        this.CRO = CRO;
    }
}
