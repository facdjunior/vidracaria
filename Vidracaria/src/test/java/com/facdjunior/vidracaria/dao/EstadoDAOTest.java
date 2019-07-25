package com.facdjunior.vidracaria.dao;

import com.facdjunior.vidracaria.domain.Estado;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author UsuarioSaude
 */
public class EstadoDAOTest {

    @Test
    @Ignore
    public void salvar() {
        Estado estado = new Estado();
        estado.setNome("TOCANTINS");
        estado.setSigla("TO");

        EstadosDAO estadosDAO = new EstadosDAO();
        estadosDAO.salvar(estado);
    }

    @Test
    @Ignore
    public void listar() {
        EstadosDAO estadosDAO = new EstadosDAO();
        List<Estado> resultado = estadosDAO.listar();

        for (Estado estado : resultado) {
            System.out.println(estado.getNome() + "-" + estado.getSigla());
        }
    }

    @Test
    @Ignore
    public void buscar() {
        Long codigo = 3L;

        EstadosDAO estadosDAO = new EstadosDAO();
        Estado estado = estadosDAO.buscar(codigo);

        if (estado == null) {
            System.out.println("Nenhum registro encontrado");
        } else {
            System.out.println(estado.getNome() + "-" + estado.getSigla());
        }

    }
}
