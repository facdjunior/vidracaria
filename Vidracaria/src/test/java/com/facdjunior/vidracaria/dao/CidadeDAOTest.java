package com.facdjunior.vidracaria.dao;

import com.facdjunior.vidracaria.domain.Cidade;
import com.facdjunior.vidracaria.domain.Estado;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Francisco Alves 2019-07-25
 */
public class CidadeDAOTest {

    @Test
    @Ignore
    public void salvar() {

        EstadosDAO estadosDAO = new EstadosDAO();
        Estado estado = estadosDAO.buscar(2L);

        if (estado == null) {
            System.out.println("Favor informa Estado valido!");
        } else {
            Cidade cidade = new Cidade();
            cidade.setNome("Belo Horizonte");
            cidade.setEstado(estado);

            CidadeDAO cidadeDAO = new CidadeDAO();
            cidadeDAO.salvar(cidade);
            System.out.println("Registro gravado com Sucesso");
        }
    }

    @Test
    @Ignore
    public void listar() {
        CidadeDAO cidadeDAO = new CidadeDAO();
        List<Cidade> resultado = cidadeDAO.listar();

        for (Cidade cidade : resultado) {
            System.out.println("Código da Cidade:" + cidade.getCodigo());
            System.out.println("Nome da Cidade: " + cidade.getNome());
            System.out.println("Nome do Estado: " + cidade.getEstado().getSigla());
            System.out.println("Código do Estado: " + cidade.getEstado().getCodigo());

        }
    }

    @Test
    @Ignore
    public void buscar() {
        Long codigo = 1L;
        CidadeDAO cidadeDAO = new CidadeDAO();
        Cidade cidade = cidadeDAO.buscar(codigo);
        
        if (cidade == null) {
            System.out.println("Nenhum registro encontrado");
        } else {
            System.out.println("Código da Cidade:" + cidade.getCodigo()+" - "+ cidade.getNome()+"-"+ cidade.getEstado().getSigla() );
        }

        
        
    }
    
    @Test
    @Ignore
    public void excluir(){
        Long codigo = 3L;
        
        CidadeDAO cidadeDAO = new CidadeDAO();
        Cidade cidade = cidadeDAO.buscar(codigo);
        
        if (cidade == null) {
            System.out.println("Erro ao tentar deletar");
        } else {
            cidadeDAO.excluir(cidade);
            System.out.println("Registro: " + cidade.getNome());
        }
    }
    
    @Test
    @Ignore
    public void editar(){
         Long codigoEstado = 1L;
         Long codigoCidade = 7L;
         
        EstadosDAO estadosDAO = new EstadosDAO();
        Estado estado = estadosDAO.buscar(codigoEstado);

        CidadeDAO cidadeDAO = new CidadeDAO();
        Cidade cidade = cidadeDAO.buscar(codigoCidade);
        

        if (cidade == null) {
            System.out.println("Não há registro com os dados informados!");
        } else if(estado == null) {
            System.out.println("Favor informar estado valido!");
        }else{
            cidade.setNome("Palmas do Tocantins");
            cidade.setEstado(estado);
            cidadeDAO.editar(cidade);
            System.out.println("Registro alterado com sucesso!");
        }
    }

}
