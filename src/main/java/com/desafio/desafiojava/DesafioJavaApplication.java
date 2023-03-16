package com.desafio.desafiojava;

import model.Entidade;
import model.Hospede;
import model.Quarto;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;


@SpringBootApplication
public class DesafioJavaApplication {

    public static void main(String[] args) throws Exception {
        Hospede hospede1 = new Hospede(1, "Gustavo", LocalDate.of(1995, 8, 20), 1, LocalDate.now(), true, "a", true);
        //System.out.println(hospede1);

        Quarto quarto1 = new Quarto(1, "101", "Solteiro", true);
        Quarto quarto2 = new Quarto(1, "102", "Casal", true);
        Entidade entidade1 = new Entidade(1, "Hotel Elotech", "11.111.111/2222-33", "Hotel", List.of(quarto1));

        System.out.println(entidade1);

//        System.out.println(quarto1.toString());
//
//        hospede1.criarReserva(hospede1, quarto1, "12/03/2023");
//        System.out.println(quarto1.toString());
//
//        hospede1.fazerCheckin(hospede1, quarto1);
//        System.out.println(quarto1.toString());
//
//        hospede1.fazerCheckout(hospede1, quarto1);
//        System.out.println(quarto1.toString());


    }

}
