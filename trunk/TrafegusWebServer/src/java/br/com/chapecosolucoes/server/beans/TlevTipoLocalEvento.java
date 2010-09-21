/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.chapecosolucoes.server.beans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Emerson
 */
@Entity
@Table(name = "tlev_tipo_local_evento", catalog = "trafegus_transc", schema = "public")
@NamedQueries({
    @NamedQuery(name = "TlevTipoLocalEvento.findAll", query = "SELECT t FROM TlevTipoLocalEvento t"),
    @NamedQuery(name = "TlevTipoLocalEvento.findByTlevCodigo", query = "SELECT t FROM TlevTipoLocalEvento t WHERE t.tlevCodigo = :tlevCodigo"),
    @NamedQuery(name = "TlevTipoLocalEvento.findByTlevDescricao", query = "SELECT t FROM TlevTipoLocalEvento t WHERE t.tlevDescricao = :tlevDescricao"),
    @NamedQuery(name = "TlevTipoLocalEvento.findByTlevSequencia", query = "SELECT t FROM TlevTipoLocalEvento t WHERE t.tlevSequencia = :tlevSequencia")})
public class TlevTipoLocalEvento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "tlev_codigo", nullable = false)
    private Integer tlevCodigo;
    @Column(name = "tlev_descricao", length = 50)
    private String tlevDescricao;
    @Column(name = "tlev_sequencia")
    private Integer tlevSequencia;

    public TlevTipoLocalEvento() {
    }

    public TlevTipoLocalEvento(Integer tlevCodigo) {
        this.tlevCodigo = tlevCodigo;
    }

    public Integer getTlevCodigo() {
        return tlevCodigo;
    }

    public void setTlevCodigo(Integer tlevCodigo) {
        this.tlevCodigo = tlevCodigo;
    }

    public String getTlevDescricao() {
        return tlevDescricao;
    }

    public void setTlevDescricao(String tlevDescricao) {
        this.tlevDescricao = tlevDescricao;
    }

    public Integer getTlevSequencia() {
        return tlevSequencia;
    }

    public void setTlevSequencia(Integer tlevSequencia) {
        this.tlevSequencia = tlevSequencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tlevCodigo != null ? tlevCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TlevTipoLocalEvento)) {
            return false;
        }
        TlevTipoLocalEvento other = (TlevTipoLocalEvento) object;
        if ((this.tlevCodigo == null && other.tlevCodigo != null) || (this.tlevCodigo != null && !this.tlevCodigo.equals(other.tlevCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.chapecosolucoes.server.beans.TlevTipoLocalEvento[tlevCodigo=" + tlevCodigo + "]";
    }

}
