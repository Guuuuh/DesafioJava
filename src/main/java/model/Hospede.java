package model;

public class Hospede extends Pessoa {
    private Integer codHospede;
    private String dataDaReserva;
    private Boolean utilizaraGaragem;
    private String numeroDoQuarto;
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

    public void setNumeroDoQuarto(String numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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
        System.out.println(hospede.getNome());
        System.out.println(hospede.getDataDaReserva());
        System.out.println(hospede.getNumeroDoQuarto());
    }

    public void criarReserva(Hospede hospede,Quarto quarto, String dataDaReserva) {
        if (!quarto.getReservado()) {
            quarto.setReservado(true);
            setNumeroDoQuarto(quarto.getNumeroQuarto());
            hospede.setDataDaReserva(dataDaReserva);
            imprimeInformacoesHospede(hospede);
        } else {
            System.out.println("Este quarto já está resevado!");
        }
    }

}
