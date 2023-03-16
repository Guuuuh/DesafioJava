package model;

import java.util.List;

public class Entidade {
    private Integer codEntidade;
    private String nome;
    private String cnpj;
    private String tipoEntidade;
    private List<Quarto> quartos;

    public Entidade() {
    }

    public Entidade(Integer codEntidade, String nome, String cnpj, String tipoEntidade, List<Quarto> quartos) {
        this.codEntidade = codEntidade;
        this.nome = nome;
        this.cnpj = cnpj;
        this.tipoEntidade = tipoEntidade;
        this.quartos = quartos;
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

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
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
