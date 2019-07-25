package com.facdjunior.vidracaria.dao;

import com.facdjunior.vidracaria.domain.Cliente;
import com.facdjunior.vidracaria.domain.Pessoa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Francisco Alves 2019-07-25
 */
public class ClienteDAOTest {
    
    @Test
    @Ignore
    public void salvar() throws ParseException{
        
        PessoaDAO pessoaDAO = new PessoaDAO();
        Pessoa pessoa = pessoaDAO.buscar(3L);
        
        Cliente cliente = new Cliente();
        cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("25/07/2019"));
        cliente.setLiberado(true);
        cliente.setPessoa(pessoa);
        
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.salvar(cliente);
        
        System.out.println("Cliente salvo com sucesso!");
    }
    
    @Test
    @Ignore
    public void listar(){
        ClienteDAO clienteDAO = new ClienteDAO();
        List<Cliente> resultado = clienteDAO.listar();
        
        for(Cliente cliente : resultado){
            System.out.println("Cliente: "+cliente.getPessoa().getNome()+" Data Cadastro: "+cliente.getDataCadastro());
        }
    }
    
    @Test
    @Ignore
    public void buscar(){
        Long codigo = 2L;
        
        ClienteDAO clienteDAO = new ClienteDAO();
        Cliente cliente = clienteDAO.buscar(codigo);
        
        System.out.println("Cliente: "+cliente.getPessoa().getNome()+" Data Cadastro: "+cliente.getDataCadastro());
        
    }
    
    @Test
    @Ignore
    public void excluir(){
        Long codigo = 1L;
        
        ClienteDAO clienteDAO = new ClienteDAO();
        Cliente cliente = clienteDAO.buscar(codigo);
        
        clienteDAO.excluir(cliente);
    }
    
    @Test
    @Ignore
    public void editar(){
        Long codigoPessoa = 2L;
        Long codigoCliente = 2L;
        
        PessoaDAO pessoaDAO = new PessoaDAO();
        Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);
        
        ClienteDAO clienteDAO = new ClienteDAO();
        Cliente cliente = clienteDAO.buscar(codigoCliente);
        
        cliente.setLiberado(false);
        
        clienteDAO.editar(cliente);
        System.out.println("Cliente: "+cliente.getPessoa().getNome()+" Data Cadastro: "+cliente.getDataCadastro());
    }
}
