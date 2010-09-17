/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.chapecosolucoes.server.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Emerson
 */
@Entity
@Table(name = "rpon_rota_ponto")
@NamedQueries({
    @NamedQuery(name = "RponRotaPonto.findAll", query = "SELECT r FROM RponRotaPonto r")})
public class RponRotaPonto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "rpon_codigo", nullable = false)
    private Integer rponCodigo;
    @Column(name = "rpon_sequencia")
    private Integer rponSequencia;
    @Column(name = "rpon_descricao", length = 100)
    private String rponDescricao;
    @Column(name = "rpon_latitude", precision = 15, scale = 10)
    private BigDecimal rponLatitude;
    @Column(name = "rpon_longitude", precision = 15, scale = 10)
    private BigDecimal rponLongitude;
    @Column(name = "rpon_data_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rponDataCadastro;
    @Column(name = "rpon_codigo_gr")
    private Integer rponCodigoGr;
    @Column(name = "rpon_importado")
    private Character rponImportado;
    @JoinColumn(name = "rpon_tpar_codigo", referencedColumnName = "tpar_codigo")
    @ManyToOne
    private TparTipoParada tparTipoParada;
    @JoinColumn(name = "rpon_rota_codigo", referencedColumnName = "rota_codigo")
    @ManyToOne
    private RotaRota rotaRota;
    @JoinColumn(name = "rpon_refe_codigo", referencedColumnName = "refe_codigo")
    @ManyToOne
    private RefeReferencia refeReferencia;

    public RponRotaPonto() {
    }

    public RponRotaPonto(Integer rponCodigo) {
        this.rponCodigo = rponCodigo;
    }

    public Integer getRponCodigo() {
        return rponCodigo;
    }

    public void setRponCodigo(Integer rponCodigo) {
        this.rponCodigo = rponCodigo;
    }

    public Integer getRponSequencia() {
        return rponSequencia;
    }

    public void setRponSequencia(Integer rponSequencia) {
        this.rponSequencia = rponSequencia;
    }

    public String getRponDescricao() {
        return rponDescricao;
    }

    public void setRponDescricao(String rponDescricao) {
        this.rponDescricao = rponDescricao;
    }

    public BigDecimal getRponLatitude() {
        return rponLatitude;
    }

    public void setRponLatitude(BigDecimal rponLatitude) {
        this.rponLatitude = rponLatitude;
    }

    public BigDecimal getRponLongitude() {
        return rponLongitude;
    }

    public void setRponLongitude(BigDecimal rponLongitude) {
        this.rponLongitude = rponLongitude;
    }

    public Date getRponDataCadastro() {
        return rponDataCadastro;
    }

    public void setRponDataCadastro(Date rponDataCadastro) {
        this.rponDataCadastro = rponDataCadastro;
    }

    public Integer getRponCodigoGr() {
        return rponCodigoGr;
    }

    public void setRponCodigoGr(Integer rponCodigoGr) {
        this.rponCodigoGr = rponCodigoGr;
    }

    public Character getRponImportado() {
        return rponImportado;
    }

    public void setRponImportado(Character rponImportado) {
        this.rponImportado = rponImportado;
    }

    public TparTipoParada getTparTipoParada() {
        return tparTipoParada;
    }

    public void setTparTipoParada(TparTipoParada tparTipoParada) {
        this.tparTipoParada = tparTipoParada;
    }

    public RotaRota getRotaRota() {
        return rotaRota;
    }

    public void setRotaRota(RotaRota rotaRota) {
        this.rotaRota = rotaRota;
    }

    public RefeReferencia getRefeReferencia() {
        return refeReferencia;
    }

    public void setRefeReferencia(RefeReferencia refeReferencia) {
        this.refeReferencia = refeReferencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rponCodigo != null ? rponCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RponRotaPonto)) {
            return false;
        }
        RponRotaPonto other = (RponRotaPonto) object;
        if ((this.rponCodigo == null && other.rponCodigo != null) || (this.rponCodigo != null && !this.rponCodigo.equals(other.rponCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.chapecosolucoes.server.beans.RponRotaPonto[rponCodigo=" + rponCodigo + "]";
    }

}
