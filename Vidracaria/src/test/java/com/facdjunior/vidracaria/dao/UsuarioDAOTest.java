/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facdjunior.vidracaria.dao;

import com.facdjunior.vidracaria.domain.Pessoa;
import com.facdjunior.vidracaria.domain.Usuario;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Francisco Junior 2019-07-25
 */
public class UsuarioDAOTest {

    @Test
    @Ignore
    public void salvar() {

        PessoaDAO pessoaDAO = new PessoaDAO();
        Pessoa pessoa = pessoaDAO.buscar(2L);

        Usuario usuario = new Usuario();
        usuario.setAtivo(true);
        usuario.setPessoa(pessoa);
        usuario.setSenha("teste");
        usuario.setTipo('A');

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.salvar(usuario);
    }

    @Test
    @Ignore
    public void listar() {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> resultato = usuarioDAO.listar();

        for (Usuario usuario : resultato) {
            System.out.println("Código Usuário: " + usuario.getPessoa().getNome());
        }
    }

    @Test
    @Ignore
    public void buscar() {

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = usuarioDAO.buscar(1L);

        System.out.println("Código Usuário: " + usuario.getPessoa().getNome());
    }

    @Test
    @Ignore
    public void excluir() {

        PessoaDAO pessoaDAO = new PessoaDAO();
        Pessoa pessoa = pessoaDAO.buscar(2L);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = usuarioDAO.buscar(2L);

        if (usuario == null) {
            System.out.println("Erro ao excluir Usuario");
        } else if (pessoa == null) {
            System.out.println("Erro ao excluir Pessoa");
        } else {
            usuarioDAO.excluir(usuario);
            System.out.println("Dados excluído com sucesso!");
        }
    }

    @Test
    @Ignore
    public void editar() {

        PessoaDAO pessoaDAO = new PessoaDAO();
        Pessoa pessoa = pessoaDAO.buscar(2L);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = usuarioDAO.buscar(1L);

        usuario.setSenha("1");

        if (usuario == null) {
            System.out.println("Erro ao editar cadastro: Usuario não vinculado");
        } else if (pessoa == null) {
            System.out.println("Erro ao editar cadastro: Pessoa não vinculada");
        } else {
            usuarioDAO.editar(usuario);
            System.out.println("Dados alterado com sucesso!");
        }

    }
}
