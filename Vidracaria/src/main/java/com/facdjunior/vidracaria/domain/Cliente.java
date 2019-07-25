/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facdjunior.vidracaria.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author Francisco Junior 2019-07-24
 */
@SuppressWarnings("serial")
@Entity
public class Cliente extends GenericDomain{
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE) //anotação para informar somente Data
    private Date dataCadastro;
    @Column(nullable = false)
    private Boolean liberado;
    @OneToOne
    @JoinColumn(nullable = false)
    private Pessoa pessoa;

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Boolean getLiberado() {
        return liberado;
    }

    public void setLiberado(Boolean liberado) {
        this.liberado = liberado;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
}
