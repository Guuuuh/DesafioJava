package com.desafio.desafiojava.model;
//Para uma pessoa virar um hóspede ela precisa reservar um quarto,
// então para instanciar um objeto hospede precisa passar uma pessoa criando uma reserva.
//Talvez passar um quarto também. Preciso usar a função criarReserva() no construtor do hóspede,
//então vai ser tipo para criar um Hospede(cod, dataDaReserva, utilizaGaragem, Quarto, Objeto Pessoa)
public class Quarto {
    private Integer codQuarto;
    private String numeroQuarto;
    private String tipoCama;
    private Boolean aceitaAnimais;
}
