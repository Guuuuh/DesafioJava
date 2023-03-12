package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class Hospede extends Pessoa {
    private Integer codHospede;
    private String dataDaReserva;
    private Boolean utilizaraGaragem;
    private String numeroDoQuarto;
    private Boolean possuiReserva = false;
    private Pessoa pessoa;

    public Hospede() {
    }

    public Hospede(Pessoa pessoa, Integer codHospede, Boolean utilizaraGaragem) {
        this.pessoa = pessoa;
        this.codHospede = codHospede;
        this.utilizaraGaragem = utilizaraGaragem;
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

    public String getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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
                ", Pessoa=" + pessoa.toString() +
                "codHospede=" + codHospede +
                ", dataDaReserva='" + dataDaReserva + '\'' +
                ", utilizaraGaragem=" + utilizaraGaragem +
                ", numeroDoQuarto='" + numeroDoQuarto + '\'' +
                '}';
    }

    public void imprimeInformacoesHospede(Hospede hospede) {
        System.out.println("Olá " + hospede.getPessoa().getNome() + " sua reserva foi efetuada com sucesso!");
        System.out.println("A Reserva é para o dia: " + hospede.getDataDaReserva());
        System.out.println("Este é o numero do seu quarto: " + hospede.getNumeroDoQuarto());
    }

    public void criarReserva(Hospede hospede, Quarto quartoAReservar, String dataDaReserva) throws Exception {
        if (quartoAReservar.getReservado()) {
            throw new Exception("Este quarto já está reservado!");
        }

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        try {
            format.parse(dataDaReserva);
        } catch (ParseException e) {
            throw new Exception("A data da reserva está inválida!");
        }

        quartoAReservar.setReservado(true);
        this.numeroDoQuarto = quartoAReservar.getNumeroQuarto();
        hospede.setDataDaReserva(dataDaReserva);
        quartoAReservar.setHospede(hospede);
        quartoAReservar.setNomeHospede(hospede);
        hospede.setPossuiReserva(true);
        imprimeInformacoesHospede(hospede);
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

        System.out.println("Olá " + hospede.getPessoa().getNome() + " foi realizado o seu check-in no quarto: " + hospede.getNumeroDoQuarto());
        quarto.setCheckin(true);
    }


    public void fazerCheckout(Hospede hospede, Quarto quarto) {

    }

}
