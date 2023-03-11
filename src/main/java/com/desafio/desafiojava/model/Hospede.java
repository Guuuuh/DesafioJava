package com.desafio.desafiojava.model;

public class Hospede extends Pessoa {
    private Integer codHospede;
    private String dataDaReserva;
    private Boolean utilizaraGaragem;
    private String Quarto;

    public Hospede() {
    }

    public Hospede(Integer codPessoa, String nome, String dataDeNascimento, Integer codHospede, String dataDaReserva, Boolean utilizaraGaragem, String quarto) {
        super(codPessoa, nome, dataDeNascimento);
        this.codHospede = codHospede;
        this.dataDaReserva = dataDaReserva;
        this.utilizaraGaragem = utilizaraGaragem;
        Quarto = quarto;
    }

    public Integer getCodHospede() {
        return codHospede;
    }

    public String getDataDaReserva() {
        return dataDaReserva;
    }

    public void setDataDaReserva(String dataDaReserva) {
        this.dataDaReserva = dataDaReserva;
    }

    public Boolean getUtilizaraGaragem() {
        return utilizaraGaragem;
    }

    public void setUtilizaraGaragem(Boolean utilizaraGaragem) {
        this.utilizaraGaragem = utilizaraGaragem;
    }

    public String getQuarto() {
        return Quarto;
    }

    public void setQuarto(String quarto) {
        Quarto = quarto;
    }
}
