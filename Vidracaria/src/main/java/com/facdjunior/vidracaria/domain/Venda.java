/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facdjunior.vidracaria.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Francisco Junior 2019-07-24
 */
@SuppressWarnings("serial")
@Entity
public class Venda extends GenericDomain{
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date horario;
    
    @Column(nullable = false, precision = 8, scale = 2)
    private BigDecimal precoTotal;
    
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Funcionario funcionario;

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public BigDecimal getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(BigDecimal precoTotal) {
        this.precoTotal = precoTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
