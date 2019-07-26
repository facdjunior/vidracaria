package com.facdjunior.vidracaria.dao;

import com.facdjunior.vidracaria.domain.Funcionario;
import com.facdjunior.vidracaria.domain.Pessoa;
import com.facdjunior.vidracaria.domain.Usuario;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Francisco Alves 2019-07-25
 */
public class FuncionarioDAOTest {

    @Test
    @Ignore
    public void salvar() throws ParseException {

        PessoaDAO pessoaDAO = new PessoaDAO();
        Pessoa pessoa = pessoaDAO.buscar(1L);

        Funcionario funcionario = new Funcionario();
        funcionario.setCarteiraTrabalho("31212");
        funcionario.setDataAdmissao(new Date());
        funcionario.setPessoa(pessoa);

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.salvar(funcionario);
    }

    @Test
    @Ignore
    public void listar() {
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        List<Funcionario> resultado = funcionarioDAO.listar();

        for (Funcionario funcionario : resultado) {
            System.out.println("Funcionário: " + funcionario.getPessoa().getNome() + ", Admitido em: " + funcionario.getDataAdmissao());
        }
    }

    @Test
    @Ignore
    public void buscar() {

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = funcionarioDAO.buscar(1L);

        System.out.println("Funcionário: " + funcionario.getPessoa().getNome() + ", Admitido em: " + funcionario.getDataAdmissao());

    }

    @Test
    @Ignore
    public void excluir() {

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = usuarioDAO.buscar(2L);

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = funcionarioDAO.buscar(2L);

        if (usuario == null) {
            System.out.println("Erro ao excluir 'USUARIO' cadastrado");
            System.out.println("");
            System.out.println("Procure Administrador do Sistema");
        } else if (funcionario == null) {
            System.out.println("Erro ao excluir 'FUNCIONÁRIO' cadastrado");
            System.out.println("");
            System.out.println("Procure Administrador do Sistema");
        } else {
            funcionarioDAO.excluir(funcionario);
            System.out.println("Resgistro excluído com Sucesso");
        }
    }
    
    @Test
    @Ignore
    public void editar(){
        
        PessoaDAO pessoaDAO = new PessoaDAO();
        Pessoa pessoa = pessoaDAO.buscar(2L);
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = funcionarioDAO.buscar(1L);
        
        funcionario.setCarteiraTrabalho("654321");
        
        funcionarioDAO.editar(funcionario);
        
        System.out.println("Registro alterado com Sucesso!");
    }

}
