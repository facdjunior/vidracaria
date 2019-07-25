package com.facdjunior.vidracaria.dao;

import com.facdjunior.vidracaria.domain.Fabricante;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Francisco Junior 2019-07-24
 */
public class FabricanteDAOTest {

    @Test
    @Ignore
    public void salvar() {
        Fabricante fabricante = new Fabricante();
        fabricante.setDescricao("NORTESYS");

        FabricanteDAO fabricanteDAO = new FabricanteDAO();
        fabricanteDAO.salvar(fabricante);

    }

    @Test
    @Ignore
    public void listar() {
        FabricanteDAO fabricanteDAO = new FabricanteDAO();
        List<Fabricante> resultado = fabricanteDAO.listar();

        for (Fabricante fabricante : resultado) {
            System.out.println("O Fabricante: " + fabricante.getDescricao());
        }
    }

    @Test
    @Ignore
    public void buscar() {
        Long codigo = 1L;

        FabricanteDAO fabricanteDAO = new FabricanteDAO();
        Fabricante fabricante = fabricanteDAO.buscar(codigo);

        if (fabricante == null) {
            System.out.println("Nenhum registro encontrado");
        } else {
            System.out.println("Fabricante: " + fabricante.getDescricao());
        }
    }

    @Test
    @Ignore
    public void deletar() {
        Long codigo = 3L;

        FabricanteDAO fabricanteDAO = new FabricanteDAO();
        Fabricante fabricante = fabricanteDAO.buscar(codigo);

        if (fabricante == null) {
            System.out.println("Erro ao tentar deletar");
        } else {
            fabricanteDAO.excluir(fabricante);
            System.out.println("Registro: " + fabricante.getDescricao());
        }
    }

    @Test
    @Ignore
    public void editar() {
        Long codigo = 1L;

        FabricanteDAO fabricanteDAO = new FabricanteDAO();
        Fabricante fabricante = fabricanteDAO.buscar(codigo);

        if (fabricante == null) {
            System.out.println("Não há registro com os dados informados!");
        } else {
            fabricante.setDescricao("NORTESYS SOLUÇÕES EM TECNOLOGIA");
            fabricanteDAO.editar(fabricante);
            System.out.println("Registro alterado com sucesso!");
        }
    }
}
