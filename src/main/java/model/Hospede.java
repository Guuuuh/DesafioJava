package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Hospede extends Pessoa {
    private Integer codHospede;
    private LocalDate dataDaReserva;
    private Boolean utilizaraGaragem;
    private String numeroDoQuarto;
    private Boolean possuiReserva = false;


    public Hospede(Integer codPessoa, String nome, LocalDate dataDeNascimento, Integer codHospede, LocalDate dataDaReserva, Boolean utilizaraGaragem, String numeroDoQuarto, Boolean possuiReserva) {
        super(codPessoa, nome, dataDeNascimento);
        this.codHospede = codHospede;
        this.dataDaReserva = dataDaReserva;
        this.utilizaraGaragem = utilizaraGaragem;
        this.numeroDoQuarto = numeroDoQuarto;
        this.possuiReserva = possuiReserva;
    }

    public Integer getCodHospede() {
        return codHospede;
    }

    public void setCodHospede(Integer codHospede) {
        this.codHospede = codHospede;
    }

    public LocalDate getDataDaReserva() {
        return dataDaReserva;
    }

    public void setDataDaReserva(LocalDate dataDaReserva) {
        this.dataDaReserva = dataDaReserva;
    }

    public Boolean getUtilizaraGaragem() {
        return utilizaraGaragem;
    }

    public void setUtilizaraGaragem(Boolean utilizaraGaragem) {
        this.utilizaraGaragem = utilizaraGaragem;
    }

    public String getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public void setNumeroDoQuarto(String numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public Boolean getPossuiReserva() {
        return possuiReserva;
    }

    public void setPossuiReserva(Boolean possuiReserva) {
        this.possuiReserva = possuiReserva;
    }

    @Override
    public String toString() {
        return "Hospede = " +
                "codHospede=" + codHospede +
                ", dataDaReserva='" + dataDaReserva + '\'' +
                ", utilizaraGaragem=" + utilizaraGaragem +
                ", numeroDoQuarto='" + numeroDoQuarto + '\'' +
                '}';
    }

    public void imprimeInformacoesHospede(Hospede hospede, String metodo) {
        switch (metodo) {
            case "reserva" -> {
                System.out.println("Olá " + hospede.getNome() + ", sua reserva foi efetuada!");
                System.out.println("A reserva é para o dia: " + hospede.getDataDeNascimento());
                System.out.println("Este é o número do seu quarto: " + hospede.getNome());
            }
            case "checkin" -> {
                System.out.println("Olá " + hospede.getNome() + ", foi realizado o seu check-in no quarto " + hospede.numeroDoQuarto + ", Seja bem vindo!");
            }
            case "checkout" -> {
                System.out.println("Olá " + hospede.getNome() + ", seu check-out foi realizado com sucesso!");
                System.out.println("Check-out realizado no dia: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

            }
        }
    }


    public void criarReserva(Hospede hospede, Quarto quartoAReservar, LocalDate dataDaReserva) throws Exception {
        if (quartoAReservar.getReservado()) {
            throw new Exception("Este quarto já está reservado!");
        }

//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//        format.setLenient(false);
//        try {
//            format.parse(dataDaReserva);
//        } catch (ParseException e) {
//            throw new Exception("A data da reserva está inválida!");
//        }

        quartoAReservar.setReservado(true);
        this.numeroDoQuarto = quartoAReservar.getNumeroQuarto();
        hospede.setDataDaReserva(dataDaReserva);
        quartoAReservar.setHospede(hospede);
        quartoAReservar.setNomeHospede(hospede);
        hospede.setPossuiReserva(true);
        imprimeInformacoesHospede(hospede, "reserva");
    }


    public void fazerCheckin(Hospede hospede, Quarto quarto) throws Exception {
        if (!hospede.possuiReserva) {
            throw new Exception("Este hospede não possui reservas");
        }

        if (!quarto.getReservado()) {
            throw new Exception("Check-in para o quarto errado, este quarto não está reservado");
        }

        if (!Objects.equals(hospede.getCodHospede(), quarto.getHospede().getCodHospede())) {
            throw new Exception("Check-in para o quarto errado, efetue novamente no quarto correto!");
        }

        quarto.setCheckin(true);
        imprimeInformacoesHospede(hospede, "checkin");
    }

    public void fazerCheckout(Hospede hospede, Quarto quartoAReservar) {
        quartoAReservar.setReservado(false);
        quartoAReservar.resetNomeHospede(quartoAReservar);
        quartoAReservar.setCheckin(false);
        quartoAReservar.setHospede(null);
        hospede.setNumeroDoQuarto("");
        hospede.setDataDaReserva(null);
        hospede.setPossuiReserva(false);
        imprimeInformacoesHospede(hospede, "checkout");
    }

}
