package model;

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

    public void criarReserva(Hospede hospede,Quarto quarto, String dataDaReserva) {
        if (!quarto.getReservado()) {
            quarto.setReservado(true);
            this.numeroDoQuarto = (quarto.getNumeroQuarto());
            hospede.setDataDaReserva(dataDaReserva);
            quarto.setHospede(hospede);
            quarto.setNomeHospede(hospede);
            hospede.setPossuiReserva(true);
            imprimeInformacoesHospede(hospede);
        } else {
            System.out.println("Este quarto já está resevado!");
        }
    }

    public void fazerCheckin(Hospede hospede, Quarto quarto){
        if (hospede.possuiReserva) {
            if (quarto.getReservado()) {
                if (Objects.equals(hospede.getCodHospede(), quarto.getHospede().getCodHospede())) {
                    System.out.println("Olá " + hospede.getPessoa().getNome() + " foi realizado o seu check-in no quarto: " + hospede.getNumeroDoQuarto());
                    quarto.setCheckin(true);
                } else {
                    System.out.println("Check-in para o quarto errado, efetue novamente no quarto correto!");
                }
            } else {
                System.out.println("Check-in para o quarto errado, este quarto não está reservado");
            }
        } else {
            System.out.println("Este hospede não possui reservas");
        }
    }

}
