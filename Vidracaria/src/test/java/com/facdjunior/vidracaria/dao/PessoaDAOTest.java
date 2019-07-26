package com.facdjunior.vidracaria.dao;

import com.facdjunior.vidracaria.domain.Cidade;
import com.facdjunior.vidracaria.domain.Pessoa;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Francisco Junior 2019-07-25
 */
public class PessoaDAOTest {

    @Test
    @Ignore
    public void salvar() {
        Long codigoCidade = 2L;

        CidadeDAO cidadeDAO = new CidadeDAO();
        Cidade cidade = cidadeDAO.buscar(codigoCidade);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gabriel Yuri Sebastião Almada");
        pessoa.setCpf("651.513.291-38");
        pessoa.setRg("30.568.844-3");
        pessoa.setCelular("(63)99230-6498");
        pessoa.setTelefone("(63)3415-4201");
        pessoa.setRua("Quadra 206 Sul Alameda 13");
        pessoa.setBairro("Plano Diretor Sul");
        pessoa.setComplemento("77020-128");
        pessoa.setEmail("gabrielyurisebastiaoalmada@bakerhughes.com");
        pessoa.setNumero(new Short("272"));
        pessoa.setCidade(cidade);

        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.salvar(pessoa);

        System.out.println("Registro salvo com sucesso!");
    }

    @Test
    @Ignore
    public void listar() {
        PessoaDAO pessoaDAO = new PessoaDAO();
        List<Pessoa> resultado = pessoaDAO.listar();

        for (Pessoa pessoa : resultado) {
            System.out.println("Pessoa: " + pessoa.getNome() + " CPF.: " + pessoa.getCpf());
        }
    }

    @Test
    @Ignore
    public void buscar() {
        Long codigo = 1L;
        Long codigoCidade = 1L;

        CidadeDAO cidadeDAO = new CidadeDAO();
        Cidade cidade = cidadeDAO.buscar(codigoCidade);

        PessoaDAO pessoaDAO = new PessoaDAO();
        Pessoa pessoa = pessoaDAO.buscar(codigo);

        if (pessoa == null) {
            System.out.println("Nenhum registro encontrado");
        } else if (cidade == null) {
            System.out.println("Nenhum registro encontrado");
        } else {
            System.out.println("Pessoa: " + pessoa.getNome() + " CPF.: " + pessoa.getCpf());
        }
    }
    
    @Test
    @Ignore
    public void excluir(){
        Long codigoPessoa = 1L;
        Long codigoCidade = 2L;
        
        CidadeDAO cidadeDAO = new CidadeDAO();
        Cidade cidade = cidadeDAO.buscar(codigoCidade);
        
        PessoaDAO pessoaDAO = new PessoaDAO();
        Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);
        
        if(cidade == null){
            System.out.println("Erro ao excluir Registro");
        }else if(pessoa==null){
            System.out.println("Erro ao Excluir Registro");
        }else{
            pessoaDAO.excluir(pessoa);
            System.out.println("Registro Excluído com Sucesso");
        }
    }
    
    @Test
    @Ignore
    public void editar(){
        Long codigoCidade = 2L;
        Long codigoPessoa = 3L;
        
        CidadeDAO cidadeDAO = new CidadeDAO();
        Cidade cidade = cidadeDAO.buscar(codigoCidade);
        
        PessoaDAO pessoaDAO = new PessoaDAO();
        Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);
        
        pessoa.setEmail("tatiane@lonza.com");
        
        pessoaDAO.editar(pessoa);
        System.out.println("Pessoa: " + pessoa.getNome() + " CPF.: " + pessoa.getCpf()+" E-mail:"+pessoa.getEmail());
        
    }
}
