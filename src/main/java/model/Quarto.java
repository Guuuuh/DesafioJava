package model;
//Para uma pessoa virar um hóspede ela precisa reservar um quarto,
// então para instanciar um objeto hospede precisa passar uma pessoa criando uma reserva.
//Talvez passar um quarto também. Preciso usar a função criarReserva() no construtor do hóspede,
//então vai ser tipo para criar um Hospede(cod, dataDaReserva, utilizaGaragem, Quarto, Objeto Pessoa)
public class Quarto {
    private Integer codQuarto;
    private String numeroQuarto;
    private String tipoCama;
    private Boolean aceitaAnimais;
    private Boolean reservado;
    private Entidade entidade;

    public Quarto(Integer codQuarto, String numeroQuarto, String tipoCama, Boolean aceitaAnimais) {
        this.codQuarto = codQuarto;
        this.numeroQuarto = numeroQuarto;
        this.tipoCama = tipoCama;
        this.aceitaAnimais = aceitaAnimais;
    }

    public Integer getCodQuarto() {
        return codQuarto;
    }

    public String getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(String numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public Boolean getAceitaAnimais() {
        return aceitaAnimais;
    }

    public void setAceitaAnimais(Boolean aceitaAnimais) {
        this.aceitaAnimais = aceitaAnimais;
    }

    public Boolean getReservado() {
        return reservado;
    }

    public void setReservado(Boolean reservado) {
        this.reservado = reservado;
    }
}
