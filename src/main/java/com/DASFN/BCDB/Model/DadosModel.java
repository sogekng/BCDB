package com.DASFN.BCDB.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.DASFN.BCDB.FeingClient.FeingDTO.ValueDTO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "tb_dados")
public class DadosModel implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    private String mes;
    private String modalidade;
    private Double posicao;
    private String instituicaoFinanceira;
    private Double taxaJurosAoMes;
    private Double taxaJurosAoAno;
    private String cnpj8;
    private String anoMes;

    public DadosModel() {
    }

    public DadosModel(ValueDTO valueDTO){
        this.mes = valueDTO.getMes();
        this.modalidade = valueDTO.getModalidade();
        this.posicao = valueDTO.getPosicao();
        this.instituicaoFinanceira = valueDTO.getInstituicaoFinanceira();
        this.taxaJurosAoMes = valueDTO.getTaxaJurosAoMes();
        this.taxaJurosAoAno = valueDTO.getTaxaJurosAoAno();
        this.cnpj8 = valueDTO.getCnpj8();
        this.anoMes = valueDTO.getAnoMes();
    }

    public DadosModel(Integer id, String mes, String modalidade, Double posicao, String instituicaoFinanceira,
            Double taxaJurosAoMes, Double taxaJurosAoAno, String cnpj8, String anoMes) {
        this.id = id;
        this.mes = mes;
        this.modalidade = modalidade;
        this.posicao = posicao;
        this.instituicaoFinanceira = instituicaoFinanceira;
        this.taxaJurosAoMes = taxaJurosAoMes;
        this.taxaJurosAoAno = taxaJurosAoAno;
        this.cnpj8 = cnpj8;
        this.anoMes = anoMes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
