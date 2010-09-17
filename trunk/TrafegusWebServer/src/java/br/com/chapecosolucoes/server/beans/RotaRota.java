/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.chapecosolucoes.server.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Emerson
 */
@Entity
@Table(name = "rota_rota")
@NamedQueries({
    @NamedQuery(name = "RotaRota.findAll", query = "SELECT r FROM RotaRota r")})
public class RotaRota implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "rota_codigo", nullable = false)
    private Integer rotaCodigo;
    @Column(name = "rota_descricao", length = 500)
    private String rotaDescricao;
    @Column(name = "rota_distancia", precision = 15, scale = 2)
    private BigDecimal rotaDistancia;
    @Column(name = "rota_coordenada", length = 200000)
    private String rotaCoordenada;
    @Column(name = "rota_data_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rotaDataCadastro;
    @Column(name = "rota_codigo_gr")
    private Integer rotaCodigoGr;
    @Column(name = "rota_importado")
    private Character rotaImportado;
    @Column(name = "rota_coordenadaspipe", length = 1000000)
    private String rotaCoordenadaspipe;
    @OneToMany(mappedBy = "rotaRota")
    private Collection<RponRotaPonto> rponRotaPontoCollection;
    @JoinColumn(name = "rota_pess_oras_codigo_dono", referencedColumnName = "pess_oras_codigo")
    @ManyToOne
    private PessPessoa pessPessoa;
    @OneToMany(mappedBy = "rotaRota")
    private Collection<VrotViagemRota> vrotViagemRotaCollection;

    public RotaRota() {
    }

    public RotaRota(Integer rotaCodigo) {
        this.rotaCodigo = rotaCodigo;
    }

    public Integer getRotaCodigo() {
        return rotaCodigo;
    }

    public void setRotaCodigo(Integer rotaCodigo) {
        this.rotaCodigo = rotaCodigo;
    }

    public String getRotaDescricao() {
        return rotaDescricao;
    }

    public void setRotaDescricao(String rotaDescricao) {
        this.rotaDescricao = rotaDescricao;
    }

    public BigDecimal getRotaDistancia() {
        return rotaDistancia;
    }

    public void setRotaDistancia(BigDecimal rotaDistancia) {
        this.rotaDistancia = rotaDistancia;
    }

    public String getRotaCoordenada() {
        return rotaCoordenada;
    }

    public void setRotaCoordenada(String rotaCoordenada) {
        this.rotaCoordenada = rotaCoordenada;
    }

    public Date getRotaDataCadastro() {
        return rotaDataCadastro;
    }

    public void setRotaDataCadastro(Date rotaDataCadastro) {
        this.rotaDataCadastro = rotaDataCadastro;
    }

    public Integer getRotaCodigoGr() {
        return rotaCodigoGr;
    }

    public void setRotaCodigoGr(Integer rotaCodigoGr) {
        this.rotaCodigoGr = rotaCodigoGr;
    }

    public Character getRotaImportado() {
        return rotaImportado;
    }

    public void setRotaImportado(Character rotaImportado) {
        this.rotaImportado = rotaImportado;
    }

    public String getRotaCoordenadaspipe() {
        return rotaCoordenadaspipe;
    }

    public void setRotaCoordenadaspipe(String rotaCoordenadaspipe) {
        this.rotaCoordenadaspipe = rotaCoordenadaspipe;
    }

    public Collection<RponRotaPonto> getRponRotaPontoCollection() {
        return rponRotaPontoCollection;
    }

    public void setRponRotaPontoCollection(Collection<RponRotaPonto> rponRotaPontoCollection) {
        this.rponRotaPontoCollection = rponRotaPontoCollection;
    }

    public PessPessoa getPessPessoa() {
        return pessPessoa;
    }

    public void setPessPessoa(PessPessoa pessPessoa) {
        this.pessPessoa = pessPessoa;
    }

    public Collection<VrotViagemRota> getVrotViagemRotaCollection() {
        return vrotViagemRotaCollection;
    }

    public void setVrotViagemRotaCollection(Collection<VrotViagemRota> vrotViagemRotaCollection) {
        this.vrotViagemRotaCollection = vrotViagemRotaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rotaCodigo != null ? rotaCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RotaRota)) {
            return false;
        }
        RotaRota other = (RotaRota) object;
        if ((this.rotaCodigo == null && other.rotaCodigo != null) || (this.rotaCodigo != null && !this.rotaCodigo.equals(other.rotaCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.chapecosolucoes.server.beans.RotaRota[rotaCodigo=" + rotaCodigo + "]";
    }

}
