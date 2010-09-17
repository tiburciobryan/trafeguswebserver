/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.chapecosolucoes.server.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Emerson
 */
@Entity
@Table(name = "view_dados_embarcador")
@NamedQueries({
    @NamedQuery(name = "ViewDadosEmbarcador.findAll", query = "SELECT v FROM ViewDadosEmbarcador v")})
public class ViewDadosEmbarcador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "pess_oras_codigo")
    private Integer pessOrasCodigo;
    @Column(name = "emba_pjur_pess_oras_codigo")
    private Integer embaPjurPessOrasCodigo;
    @Column(name = "pess_nome", length = 50)
    private String pessNome;
    @Column(name = "pess_numero", length = 10)
    private String pessNumero;
    @Column(name = "pess_complemento", length = 50)
    private String pessComplemento;
    @Column(name = "pjur_cnpj", length = 30)
    private String pjurCnpj;
    @Column(name = "pjur_inscricao_estadual", length = 30)
    private String pjurInscricaoEstadual;
    @Column(name = "pjur_razao_social", length = 50)
    private String pjurRazaoSocial;
    @Column(name = "logr_cep", length = 8)
    private String logrCep;
    @Column(name = "endereco", length = 200)
    private String endereco;
    @Column(name = "bairro", length = 100)
    private String bairro;
    @Column(name = "cidade", length = 100)
    private String cidade;
    @Column(name = "estado", length = 100)
    private String estado;
    @Column(name = "sigla", length = 2)
    private String sigla;
    @Column(name = "pais", length = 50)
    private String pais;

    public ViewDadosEmbarcador() {
    }

    public Integer getPessOrasCodigo() {
        return pessOrasCodigo;
    }

    public void setPessOrasCodigo(Integer pessOrasCodigo) {
        this.pessOrasCodigo = pessOrasCodigo;
    }

    public Integer getEmbaPjurPessOrasCodigo() {
        return embaPjurPessOrasCodigo;
    }

    public void setEmbaPjurPessOrasCodigo(Integer embaPjurPessOrasCodigo) {
        this.embaPjurPessOrasCodigo = embaPjurPessOrasCodigo;
    }

    public String getPessNome() {
        return pessNome;
    }

    public void setPessNome(String pessNome) {
        this.pessNome = pessNome;
    }

    public String getPessNumero() {
        return pessNumero;
    }

    public void setPessNumero(String pessNumero) {
        this.pessNumero = pessNumero;
    }

    public String getPessComplemento() {
        return pessComplemento;
    }

    public void setPessComplemento(String pessComplemento) {
        this.pessComplemento = pessComplemento;
    }

    public String getPjurCnpj() {
        return pjurCnpj;
    }

    public void setPjurCnpj(String pjurCnpj) {
        this.pjurCnpj = pjurCnpj;
    }

    public String getPjurInscricaoEstadual() {
        return pjurInscricaoEstadual;
    }

    public void setPjurInscricaoEstadual(String pjurInscricaoEstadual) {
        this.pjurInscricaoEstadual = pjurInscricaoEstadual;
    }

    public String getPjurRazaoSocial() {
        return pjurRazaoSocial;
    }

    public void setPjurRazaoSocial(String pjurRazaoSocial) {
        this.pjurRazaoSocial = pjurRazaoSocial;
    }

    public String getLogrCep() {
        return logrCep;
    }

    public void setLogrCep(String logrCep) {
        this.logrCep = logrCep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
