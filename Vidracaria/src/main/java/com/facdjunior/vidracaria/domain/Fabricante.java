/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facdjunior.vidracaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Francisco Alves
 */
@SuppressWarnings("serial")
@Entity
public class Fabricante extends GenericDomain{
    
    @Column(length = 120, nullable = false)
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
