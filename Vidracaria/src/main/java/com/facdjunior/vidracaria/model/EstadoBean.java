package com.facdjunior.vidracaria.model;

import com.facdjunior.vidracaria.domain.Estado;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.omnifaces.util.Messages;

/**
 *
 * @author Francisco Junior 2019-07-26
 */
@ManagedBean
@ViewScoped
public class EstadoBean {

    private Estado estado;
    
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;    
    }
    
    public void novo(){
        estado = new Estado();
    }

    public void salvar() {
    //    Messages
    }
}
