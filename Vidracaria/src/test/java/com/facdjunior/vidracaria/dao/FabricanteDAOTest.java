package com.facdjunior.vidracaria.dao;

import com.facdjunior.vidracaria.domain.Fabricante;
import org.junit.Test;

/**
 *
 * @author Francisco Junior 2019-07-24
 */
public class FabricanteDAOTest {
    
    //@Test
    public void salvar(){
        Fabricante fabricante = new Fabricante();
        fabricante.setDescricao("NORTESYS");
        
        FabricanteDAO fabricanteDAO = new FabricanteDAO();
        fabricanteDAO.salvar(fabricante);
        
    }
    
}
