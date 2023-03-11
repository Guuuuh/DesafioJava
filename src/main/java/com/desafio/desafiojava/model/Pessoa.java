package com.desafio.desafiojava.model;

public class Pessoa {
    private Integer codPessoa;
    private String nome;
    private String dataDeNascimento;

    public Pessoa() {
    }

    public Pessoa(Integer codPessoa, String nome, String dataDeNascimento) {
        this.codPessoa = codPessoa;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Integer getCodPessoa() {
        return codPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
