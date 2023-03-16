package model;

public class Reserva {

    private Integer codReserva;
    private Hospede hospede;
    private Quarto quarto;

    public Reserva() {
    }

    public int getCodReserva() {
        return codReserva;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
}
