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
    private Boolean reservado = false;
    private Hospede hospede;
    private String nomeHospede;
    private Boolean checkin = false;

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

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        if (this.reservado) {
            this.hospede = hospede;
        }
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public Boolean getCheckin() {
        return checkin;
    }

    public void setCheckin(Boolean checkin) {
        this.checkin = checkin;
    }


    @Override
    public String toString() {
        return "Quarto{" +
                "codQuarto=" + codQuarto +
                ", numeroQuarto='" + numeroQuarto + '\'' +
                ", tipoCama='" + tipoCama + '\'' +
                ", aceitaAnimais=" + aceitaAnimais +
                ", reservado=" + reservado +
                ", nomeHospede='" + nomeHospede + '\'' +
                ", checkin=" + checkin +
                '}';
    }


    public void setNomeHospede(Hospede hospede) {
        if (this.reservado) {
            this.nomeHospede = hospede.getPessoa().getNome();
        }
    }
    public void resetNomeHospede(Quarto quarto) {
         quarto.nomeHospede = null;
    }

}
