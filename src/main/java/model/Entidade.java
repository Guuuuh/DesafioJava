package model;

import java.util.ArrayList;

public class Entidade {
    private Integer codEntidade;
    private String nome;
    private String cnpj;
    private String tipoEntidade;
    private ArrayList<Quarto> quartos = new ArrayList<>();

    public Entidade() {
    }

    public Entidade(Integer codEntidade, String nome, String cnpj, String tipoEntidade) {
        this.codEntidade = codEntidade;
        this.nome = nome;
        this.cnpj = cnpj;
        this.tipoEntidade = tipoEntidade;
    }

    public Integer getCodEntidade() {
        return codEntidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoEntidade() {
        return tipoEntidade;
    }

    public void setTipoEntidade(String tipoEntidade) {
        this.tipoEntidade = tipoEntidade;
    }

    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(ArrayList<Quarto> quartos) {
        this.quartos = quartos;
    }

    @Override
    public String toString() {
        return "Entidade{" +
                "codEntidade=" + codEntidade +
                ", nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", tipoEntidade='" + tipoEntidade + '\'' +
                ", quartos=" + quartos.toString() +
                '}';
    }

}
