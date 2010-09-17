/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.chapecosolucoes.server.beans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Emerson
 */
@Entity
@Table(name = "sico_servico_integracao_conf")
@NamedQueries({
    @NamedQuery(name = "SicoServicoIntegracaoConf.findAll", query = "SELECT s FROM SicoServicoIntegracaoConf s")})
public class SicoServicoIntegracaoConf implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sico_codigo", nullable = false)
    private Integer sicoCodigo;
    @Column(name = "sico_host_executavel", length = 50)
    private String sicoHostExecutavel;
    @Column(name = "sico_caminho_aplicacao", length = 500)
    private String sicoCaminhoAplicacao;
    @Column(name = "sico_nome_executavel", length = 50)
    private String sicoNomeExecutavel;
    @JoinColumn(name = "sico_tecn_codigo", referencedColumnName = "tecn_codigo")
    @ManyToOne
    private TecnTecnologia tecnTecnologia;
    @JoinColumn(name = "sico_ssis_codigo", referencedColumnName = "ssis_codigo")
    @ManyToOne
    private SsisServicoSistema ssisServicoSistema;

    public SicoServicoIntegracaoConf() {
    }

    public SicoServicoIntegracaoConf(Integer sicoCodigo) {
        this.sicoCodigo = sicoCodigo;
    }

    public Integer getSicoCodigo() {
        return sicoCodigo;
    }

    public void setSicoCodigo(Integer sicoCodigo) {
        this.sicoCodigo = sicoCodigo;
    }

    public String getSicoHostExecutavel() {
        return sicoHostExecutavel;
    }

    public void setSicoHostExecutavel(String sicoHostExecutavel) {
        this.sicoHostExecutavel = sicoHostExecutavel;
    }

    public String getSicoCaminhoAplicacao() {
        return sicoCaminhoAplicacao;
    }

    public void setSicoCaminhoAplicacao(String sicoCaminhoAplicacao) {
        this.sicoCaminhoAplicacao = sicoCaminhoAplicacao;
    }

    public String getSicoNomeExecutavel() {
        return sicoNomeExecutavel;
    }

    public void setSicoNomeExecutavel(String sicoNomeExecutavel) {
        this.sicoNomeExecutavel = sicoNomeExecutavel;
    }

    public TecnTecnologia getTecnTecnologia() {
        return tecnTecnologia;
    }

    public void setTecnTecnologia(TecnTecnologia tecnTecnologia) {
        this.tecnTecnologia = tecnTecnologia;
    }

    public SsisServicoSistema getSsisServicoSistema() {
        return ssisServicoSistema;
    }

    public void setSsisServicoSistema(SsisServicoSistema ssisServicoSistema) {
        this.ssisServicoSistema = ssisServicoSistema;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sicoCodigo != null ? sicoCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SicoServicoIntegracaoConf)) {
            return false;
        }
        SicoServicoIntegracaoConf other = (SicoServicoIntegracaoConf) object;
        if ((this.sicoCodigo == null && other.sicoCodigo != null) || (this.sicoCodigo != null && !this.sicoCodigo.equals(other.sicoCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.chapecosolucoes.server.beans.SicoServicoIntegracaoConf[sicoCodigo=" + sicoCodigo + "]";
    }

}
