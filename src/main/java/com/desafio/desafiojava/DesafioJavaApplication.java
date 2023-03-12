package com.desafio.desafiojava;

import model.Entidade;
import model.Hospede;
import model.Pessoa;
import model.Quarto;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DesafioJavaApplication {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1, "Gustavo", "11/09/2000");
        Hospede hospede1 = new Hospede(pessoa1, 1, false);
        //System.out.println(hospede1);

        Quarto quarto1 = new Quarto(1, "101", "Solteiro", true);
        Entidade entidade1 = new Entidade(1, "Hotel Elotech", "11.111.111/2222-33", "Hotel");
        entidade1.getQuartos().add(quarto1);
        //System.out.println(entidade1);

        hospede1.criarReserva(hospede1, quarto1, "12/03/2023");
        System.out.println(quarto1.toString());

        hospede1.fazerCheckin(hospede1, quarto1);

    }

}
