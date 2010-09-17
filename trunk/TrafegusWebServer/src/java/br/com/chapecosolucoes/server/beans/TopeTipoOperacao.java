/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.chapecosolucoes.server.beans;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "tope_tipo_operacao")
@NamedQueries({
    @NamedQuery(name = "TopeTipoOperacao.findAll", query = "SELECT t FROM TopeTipoOperacao t")})
public class TopeTipoOperacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "tope_codigo", nullable = false)
    private Integer topeCodigo;
    @Column(name = "tope_descricao", length = 50)
    private String topeDescricao;
    @Column(name = "tope_data_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date topeDataCadastro;
    @Column(name = "tope_codigo_gr")
    private Integer topeCodigoGr;
    @Column(name = "tope_importado")
    private Character topeImportado;
    @OneToMany(mappedBy = "topeTipoOperacao")
    private Collection<VucaVeiculoUtilitarioCarga> vucaVeiculoUtilitarioCargaCollection;
    @OneToMany(mappedBy = "topeTipoOperacao")
    private Collection<VmotVeiculoMoto> vmotVeiculoMotoCollection;
    @OneToMany(mappedBy = "topeTipoOperacao")
    private Collection<VcavVeiculoCavalo> vcavVeiculoCavaloCollection;
    @OneToMany(mappedBy = "topeTipoOperacao")
    private Collection<VtruVeiculoTruck> vtruVeiculoTruckCollection;
    @OneToMany(mappedBy = "topeTipoOperacao")
    private Collection<ViagViagem> viagViagemCollection;
    @OneToMany(mappedBy = "topeTipoOperacao")
    private Collection<VupaVeiculoUtilitarioPasse> vupaVeiculoUtilitarioPasseCollection;

    public TopeTipoOperacao() {
    }

    public TopeTipoOperacao(Integer topeCodigo) {
        this.topeCodigo = topeCodigo;
    }

    public Integer getTopeCodigo() {
        return topeCodigo;
    }

    public void setTopeCodigo(Integer topeCodigo) {
        this.topeCodigo = topeCodigo;
    }

    public String getTopeDescricao() {
        return topeDescricao;
    }

    public void setTopeDescricao(String topeDescricao) {
        this.topeDescricao = topeDescricao;
    }

    public Date getTopeDataCadastro() {
        return topeDataCadastro;
    }

    public void setTopeDataCadastro(Date topeDataCadastro) {
        this.topeDataCadastro = topeDataCadastro;
    }

    public Integer getTopeCodigoGr() {
        return topeCodigoGr;
    }

    public void setTopeCodigoGr(Integer topeCodigoGr) {
        this.topeCodigoGr = topeCodigoGr;
    }

    public Character getTopeImportado() {
        return topeImportado;
    }

    public void setTopeImportado(Character topeImportado) {
        this.topeImportado = topeImportado;
    }

    public Collection<VucaVeiculoUtilitarioCarga> getVucaVeiculoUtilitarioCargaCollection() {
        return vucaVeiculoUtilitarioCargaCollection;
    }

    public void setVucaVeiculoUtilitarioCargaCollection(Collection<VucaVeiculoUtilitarioCarga> vucaVeiculoUtilitarioCargaCollection) {
        this.vucaVeiculoUtilitarioCargaCollection = vucaVeiculoUtilitarioCargaCollection;
    }

    public Collection<VmotVeiculoMoto> getVmotVeiculoMotoCollection() {
        return vmotVeiculoMotoCollection;
    }

    public void setVmotVeiculoMotoCollection(Collection<VmotVeiculoMoto> vmotVeiculoMotoCollection) {
        this.vmotVeiculoMotoCollection = vmotVeiculoMotoCollection;
    }

    public Collection<VcavVeiculoCavalo> getVcavVeiculoCavaloCollection() {
        return vcavVeiculoCavaloCollection;
    }

    public void setVcavVeiculoCavaloCollection(Collection<VcavVeiculoCavalo> vcavVeiculoCavaloCollection) {
        this.vcavVeiculoCavaloCollection = vcavVeiculoCavaloCollection;
    }

    public Collection<VtruVeiculoTruck> getVtruVeiculoTruckCollection() {
        return vtruVeiculoTruckCollection;
    }

    public void setVtruVeiculoTruckCollection(Collection<VtruVeiculoTruck> vtruVeiculoTruckCollection) {
        this.vtruVeiculoTruckCollection = vtruVeiculoTruckCollection;
    }

    public Collection<ViagViagem> getViagViagemCollection() {
        return viagViagemCollection;
    }

    public void setViagViagemCollection(Collection<ViagViagem> viagViagemCollection) {
        this.viagViagemCollection = viagViagemCollection;
    }

    public Collection<VupaVeiculoUtilitarioPasse> getVupaVeiculoUtilitarioPasseCollection() {
        return vupaVeiculoUtilitarioPasseCollection;
    }

    public void setVupaVeiculoUtilitarioPasseCollection(Collection<VupaVeiculoUtilitarioPasse> vupaVeiculoUtilitarioPasseCollection) {
        this.vupaVeiculoUtilitarioPasseCollection = vupaVeiculoUtilitarioPasseCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (topeCodigo != null ? topeCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TopeTipoOperacao)) {
            return false;
        }
        TopeTipoOperacao other = (TopeTipoOperacao) object;
        if ((this.topeCodigo == null && other.topeCodigo != null) || (this.topeCodigo != null && !this.topeCodigo.equals(other.topeCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.chapecosolucoes.server.beans.TopeTipoOperacao[topeCodigo=" + topeCodigo + "]";
    }

}
