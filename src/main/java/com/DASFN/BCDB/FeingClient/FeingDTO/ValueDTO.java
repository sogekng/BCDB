package com.DASFN.BCDB.FeingClient.FeingDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ValueDTO {
    

    @JsonProperty("Mes")
    private String mes;

    @JsonProperty("Modalidade")
    private String modalidade;

    @JsonProperty("Posicao")
    private Double posicao;

    @JsonProperty("InstituicaoFinanceira")
    private String instituicaoFinanceira;

    @JsonProperty("TaxaJurosAoMes")
    private Double taxaJurosAoMes;

    @JsonProperty("TaxaJurosAoAno")
    private Double taxaJurosAoAno;

    @JsonProperty("cnpj8")
    private String cnpj8;

    @JsonProperty("anoMes")
    private String anoMes;

    
    public ValueDTO() {
    }


    public ValueDTO(String mes, String modalidade, Double posicao, String instituicaoFinanceira, Double taxaJurosAoMes,
            Double taxaJurosAoAno, String cnpj8, String anoMes) {
                
        this.mes = mes;
        this.modalidade = modalidade;
        this.posicao = posicao;
        this.instituicaoFinanceira = instituicaoFinanceira;
        this.taxaJurosAoMes = taxaJurosAoMes;
        this.taxaJurosAoAno = taxaJurosAoAno;
        this.cnpj8 = cnpj8;
        this.anoMes = anoMes;
    }


    public String getMes() {
        return mes;
    }


    public void setMes(String mes) {
        this.mes = mes;
    }


    public String getModalidade() {
        return modalidade;
    }


    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }


    public Double getPosicao() {
        return posicao;
    }


    public void setPosicao(Double posicao) {
        this.posicao = posicao;
    }


    public String getInstituicaoFinanceira() {
        return instituicaoFinanceira;
    }


    public void setInstituicaoFinanceira(String instituicaoFinanceira) {
        this.instituicaoFinanceira = instituicaoFinanceira;
    }


    public Double getTaxaJurosAoMes() {
        return taxaJurosAoMes;
    }


    public void setTaxaJurosAoMes(Double taxaJurosAoMes) {
        this.taxaJurosAoMes = taxaJurosAoMes;
    }


    public Double getTaxaJurosAoAno() {
        return taxaJurosAoAno;
    }


    public void setTaxaJurosAoAno(Double taxaJurosAoAno) {
        this.taxaJurosAoAno = taxaJurosAoAno;
    }


    public String getCnpj8() {
        return cnpj8;
    }


    public void setCnpj8(String cnpj8) {
        this.cnpj8 = cnpj8;
    }


    public String getAnoMes() {
        return anoMes;
    }


    public void setAnoMes(String anoMes) {
        this.anoMes = anoMes;
    }

    
  
}
