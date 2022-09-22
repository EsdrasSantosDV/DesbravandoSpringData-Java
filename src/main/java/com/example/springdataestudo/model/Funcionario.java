package com.example.springdataestudo.model;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="funcionarios")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="cpf")
    private String cpf;

    @Column(name="salario")
    private Double salario;

    @Column(name="data_contratacao")
    private LocalDate date;


    @ManyToOne(fetch=FetchType.LAZY)
    private Cargo cargo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "funcionario")
    private List<UnidadeTrabalho> unidadeTrabalhoList;


    public Funcionario(String nome, String cpf, Double salario, LocalDate date) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.date = LocalDate.now();
    }


    public Funcionario() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                ", date=" + date +
                '}';
    }
}
