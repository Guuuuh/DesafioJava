package model;

import java.util.ArrayList;
import java.util.List;

public class Entidade {
    private Integer codEntidade;
    private String nome;
    private String cnpj;
    private String tipoEntidade;
    private List<Quarto> quartos = new ArrayList<>();

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

    public List<Quarto> getQuartosEntidade() {
        return quartos;
    }

    public void setQuartosEntidade(List<Quarto> quartosEntidade) {
        this.quartos = quartosEntidade;
    }
}
