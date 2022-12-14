package com.example.springdataestudo.model;

import javax.persistence.*;

@Entity
@Table(name="unidade_trabalho")
public class UnidadeTrabalho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;

    private String endereco;

    @ManyToOne(fetch=FetchType.LAZY)
    private Funcionario funcionario;


    public UnidadeTrabalho(String descricao, String endereco) {
        this.descricao = descricao;
        this.endereco = endereco;
    }

    public UnidadeTrabalho() {

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "UnidadeTrabalho{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
