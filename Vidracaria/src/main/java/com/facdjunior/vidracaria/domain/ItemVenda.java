/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facdjunior.vidracaria.domain;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Francisco Junior 2019-07-24
 */

@SuppressWarnings("serial")
@Entity
public class ItemVenda extends GenericDomain{
    
    @Column(nullable = false)
    private Short quantidade;
    
    @Column(nullable = false, precision = 9, scale = 2)
    private BigDecimal precoParcial;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Produto produto;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Funcionario funcionario;

    public Short getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Short quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoParcial() {
        return precoParcial;
    }

    public void setPrecoParcial(BigDecimal precoParcial) {
        this.precoParcial = precoParcial;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
}
