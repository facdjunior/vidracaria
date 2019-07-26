package com.facdjunior.vidracaria.dao;

import com.facdjunior.vidracaria.domain.Fabricante;
import com.facdjunior.vidracaria.domain.Produto;
import java.math.BigDecimal;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Francisco Junior 2019-07-25
 */
public class ProdutoDAOTest {

    @Test
    @Ignore
    public void Salvar() {
        FabricanteDAO fabricanteDAO = new FabricanteDAO();
        Fabricante fabricante = fabricanteDAO.buscar(new Long("1"));

        Produto produto = new Produto();
        produto.setDescricao("Cataflan 50mg com 10 comprimidos");
        produto.setFabricante(fabricante);
        produto.setPreco(new BigDecimal("18.48"));
        produto.setQuantidade(new Short("10"));

        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.salvar(produto);

        System.out.println("Produto Salvo com sucesso");
    }

    @Test
    @Ignore
    public void listar() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        List<Produto> resultado = produtoDAO.listar();

        for (Produto produto : resultado) {
            System.out.println("Produto: " + produto.getCodigo() + " " + produto.getDescricao() + " Preço R$: " + produto.getPreco() + " Estoque Atual: " + produto.getQuantidade());
        }
    }

    @Test
    @Ignore
    public void buscar() {
        Long codigo = 1L;

        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produto = produtoDAO.buscar(codigo);

        if (produto == null) {
            System.out.println("Nenhum registro encontrado");
        } else {
            System.out.println("Produto: " + produto.getCodigo() + " Fabricante: " + produto.getFabricante().getDescricao() + " " + produto.getDescricao() + " Preço R$: " + produto.getPreco() + " Estoque Atual: " + produto.getQuantidade());
        }
    }

    @Test
    @Ignore
    public void excluir() {
        Long codigo = 2L;

        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produto = produtoDAO.buscar(codigo);

        if (produto == null) {
            System.out.println("Erro ao tentar deletar");
        } else {
            produtoDAO.excluir(produto);
            System.out.println("Registro: " + produto.getDescricao());
        }
    }

    @Test
    @Ignore
    public void editar() {
        Long codigoFabricante = 1L;
        Long codigoProduto = 1L;

        FabricanteDAO fabricanteDAO = new FabricanteDAO();
        Fabricante fabricante = fabricanteDAO.buscar(codigoFabricante);

        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produto = produtoDAO.buscar(codigoProduto);

        if (produto == null) {
            System.out.println("Não há registro com os dados informados!");
        } else if (fabricante == null) {
            System.out.println("Favor informar dados Fabricantes valido!");
        } else {
            produto.setQuantidade(new Short("10"));
            produto.setPreco(new BigDecimal("22.50"));
            produtoDAO.editar(produto);
            System.out.println("Registro alterado com sucesso!");
        }
    }
}

