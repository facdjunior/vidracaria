package com.facdjunior.vidracaria.dao;

import com.facdjunior.vidracaria.domain.Cliente;
import com.facdjunior.vidracaria.domain.Funcionario;
import com.facdjunior.vidracaria.domain.Venda;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Francisco Junior 2019-07-25
 */
public class VendaDAOTest {

    @Test
    @Ignore
    public void salvar() {

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = funcionarioDAO.buscar(1L);

        ClienteDAO clienteDAO = new ClienteDAO();
        Cliente cliente = clienteDAO.buscar(2L);

        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setFuncionario(funcionario);
        venda.setHorario(new Date());
        venda.setPrecoTotal(new BigDecimal("22.50"));

        VendaDAO vendaDAO = new VendaDAO();
        vendaDAO.salvar(venda);

        System.out.println("Registro salvo com Sucesso!");
    }

    @Test
    @Ignore
    public void listar() {
        VendaDAO vendaDAO = new VendaDAO();
        List<Venda> resultado = vendaDAO.listar();

        for (Venda venda : resultado) {
            System.out.println("Venda Código: " + venda.getCodigo() + " " + venda.getCliente().getPessoa().getNome() + " Total R$: " + venda.getPrecoTotal());
        }
    }

    @Test
    @Ignore
    public void buscar() {

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = funcionarioDAO.buscar(1L);

        ClienteDAO clienteDAO = new ClienteDAO();
        Cliente cliente = clienteDAO.buscar(2L);

        VendaDAO vendaDAO = new VendaDAO();
        Venda venda = vendaDAO.buscar(1L);

        if (funcionario == null) {
            System.out.println("Venda não contém um vendedor válido");
        } else if (cliente == null) {
            System.out.println("Venda não contém um cliente válido!");
        } else if (venda == null) {
            System.out.println("Erro ao pesquisar código da venda!");
        } else {
            System.out.println("Venda Código: " + venda.getCodigo() + " " + venda.getCliente().getPessoa().getNome() + " Total R$: " + venda.getPrecoTotal());
        }
    }

    @Test
    @Ignore
    public void excluir() {

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = funcionarioDAO.buscar(1L);

        ClienteDAO clienteDAO = new ClienteDAO();
        Cliente cliente = clienteDAO.buscar(2L);

        VendaDAO vendaDAO = new VendaDAO();
        Venda venda = vendaDAO.buscar(3L);

        if (funcionario == null) {
            System.out.println("Venda não contém um vendedor válido");
        } else if (cliente == null) {
            System.out.println("Venda não contém um cliente válido!");
        } else if (venda == null) {
            System.out.println("Erro ao pesquisar código da venda!");
        } else {
            vendaDAO.excluir(venda);
            System.out.println("Venda Código: " + venda.getCodigo() + " " + venda.getCliente().getPessoa().getNome() + " Total R$: " + venda.getPrecoTotal());
        }
    }
    
    @Test
    @Ignore
    public void editar(){
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = funcionarioDAO.buscar(1L);

        ClienteDAO clienteDAO = new ClienteDAO();
        Cliente cliente = clienteDAO.buscar(2L);

        VendaDAO vendaDAO = new VendaDAO();
        Venda venda = vendaDAO.buscar(2L);
        
        venda.setHorario(new Date());

        if (funcionario == null) {
            System.out.println("Venda não contém um vendedor válido");
        } else if (cliente == null) {
            System.out.println("Venda não contém um cliente válido!");
        } else if (venda == null) {
            System.out.println("Erro ao editar Venda!");
        } else {
            vendaDAO.editar(venda);
            System.out.println("Venda Código: " + venda.getCodigo() + " " + venda.getCliente().getPessoa().getNome() + " Total R$: " + venda.getPrecoTotal());
        }
    }
}
