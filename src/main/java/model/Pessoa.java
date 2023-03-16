package model;

import java.time.LocalDate;

public abstract class Pessoa {
    private Integer codPessoa;
    private String nome;
    private LocalDate dataDeNascimento;

    public Pessoa() {
    }

    public Pessoa(Integer codPessoa, String nome, LocalDate dataDeNascimento) {
        this.codPessoa = codPessoa;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Integer getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(Integer codPessoa) {
        this.codPessoa = codPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "codPessoa=" + codPessoa +
                ", nome='" + nome + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                '}';
    }
}
